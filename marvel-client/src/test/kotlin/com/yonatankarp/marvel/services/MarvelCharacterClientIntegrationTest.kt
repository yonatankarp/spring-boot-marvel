package com.yonatankarp.marvel.services

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.yonatankarp.marvel.test_objects.MarvelResponseTestObject
import okhttp3.OkHttpClient
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import java.time.Instant

/**
 * @author yonatankarp
 */
@Suppress("kotlin:S100")
class MarvelCharacterClientIntegrationTest : AbstractIntegrationTest(), MarvelResponseTestObject {

    private val mockMarvelApi = MockWebServer()

    private val objectMapper = ObjectMapper()
        .registerModule(JavaTimeModule())
        .registerModule(Jdk8Module())

    private lateinit var client: MarvelCharacterClient

    @BeforeEach
    fun setUp() {
        mockMarvelApi.start()

        client = Retrofit.Builder()
            .client(OkHttpClient())
            .baseUrl("http://localhost:${mockMarvelApi.port}")
            .addConverterFactory(JacksonConverterFactory.create(objectMapper))
            .build()
            .create(MarvelCharacterClient::class.java)
    }

    @AfterEach
    fun tearDown() {
        mockMarvelApi.shutdown()
    }

    @Test
    fun `should return list of characters`() {
        // Given
        val body = getJson("integration/characters/get_characters_successful_response.json")

        val response = MockResponse()
            .setBody(body)
            .setResponseCode(200)

        // When
        mockMarvelApi.enqueue(response)

        // Then
        val actual = client.getCharacters(TIMESTAMP, API_KEY, HASH_CODE)
            .execute().body()

        assertEquals(defaultCharactersMarvelResponse, actual)
    }

    @Test
    fun `should return a character by id`() {
        // Given
        val body = getJson("integration/characters/get_character_by_id_successful_response.json")

        val response = MockResponse()
            .setBody(body)
            .setResponseCode(200)

        // When
        mockMarvelApi.enqueue(response)

        // Then
        val actual = client.getCharacter(CHARACTER_ID, TIMESTAMP, API_KEY, HASH_CODE)
            .execute().body()

        assertEquals(defaultSingleCharacterMarvelResponse, actual)
    }

    @Test
    fun `should return comics by character id`() {
        // Given
        val body = getJson("integration/characters/get_comics_by_character_id.json")

        val response = MockResponse()
            .setBody(body)
            .setResponseCode(200)

        // When
        mockMarvelApi.enqueue(response)

        // Then
        val actual = client.getComics(CHARACTER_ID, TIMESTAMP, API_KEY, HASH_CODE)
            .execute().body()

        assertEquals(defaultComicsMarvelResponse, actual)
    }

    @Test
    fun `should return events by character id`() {
        // Given
        val body = getJson("integration/characters/get_events_by_character_id.json")

        val response = MockResponse()
            .setBody(body)
            .setResponseCode(200)

        // When
        mockMarvelApi.enqueue(response)

        // Then
        val actual = client.getEvents(CHARACTER_ID, TIMESTAMP, API_KEY, HASH_CODE)
            .execute().body()

        assertEquals(defaultEventsMarvelResponse, actual)
    }

    companion object {
        private const val CHARACTER_ID = 123456789L
        private const val API_KEY = "my key"
        private const val HASH_CODE = "my hash"

        private val TIMESTAMP = Instant.now().epochSecond
    }
}
