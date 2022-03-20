package com.yonatankarp.marvel.services

import com.yonatankarp.marvel.model.common.MarvelResponse
import okhttp3.OkHttpClient
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import java.time.Instant

/**
 * @author yonatankarp
 */
@Suppress("kotlin:S100")
class MarvelCharacterClientTest {

    private lateinit var client: MarvelCharacterClient

    @BeforeEach
    fun setUp() {
        client = Retrofit.Builder()
            .client(OkHttpClient())
            .baseUrl("https://localhost")
            .addConverterFactory(JacksonConverterFactory.create())
            .build()
            .create(MarvelCharacterClient::class.java)
    }

    @Test
    fun `should GET characters with default offset and limit`() {
        // Given timestamp, api key and hash

        // When we call  the client
        val call = client.getCharacters(TIMESTAMP, API_KEY, HASH_CODE)

        // Then we expect the request to contain all the required parameters
        with(call.request()) {
            assertEquals("GET", method())
            assertEquals(TIMESTAMP.toString(), url().queryParameter(TIMESTAMP_QUERY_PARAM_NAME))
            assertEquals(API_KEY, url().queryParameter(API_KEY_QUERY_PARAM_NAME))
            assertEquals(HASH_CODE, url().queryParameter(HASH_QUERY_PARAM_NAME))
            assertEquals(DEFAULT_OFFSET.toString(), url().queryParameter(OFFSET_QUERY_PARAM_NAME))
            assertEquals(DEFAULT_LIMIT.toString(), url().queryParameter(LIMIT_QUERY_PARAM_NAME))
        }
    }

    @Test
    fun `should GET characters with custom offset and limit`() {
        // Given timestamp, api key and hash

        // When we call  the client
        val call = client.getCharacters(TIMESTAMP, API_KEY, HASH_CODE, CUSTOM_LIMIT, CUSTOM_OFFSET)

        // Then we expect the request to contain all the required parameters
        with(call.request()) {
            assertEquals("GET", method())
            assertEquals(TIMESTAMP.toString(), url().queryParameter(TIMESTAMP_QUERY_PARAM_NAME))
            assertEquals(API_KEY, url().queryParameter(API_KEY_QUERY_PARAM_NAME))
            assertEquals(HASH_CODE, url().queryParameter(HASH_QUERY_PARAM_NAME))
            assertEquals(CUSTOM_OFFSET.toString(), url().queryParameter(OFFSET_QUERY_PARAM_NAME))
            assertEquals(CUSTOM_LIMIT.toString(), url().queryParameter(LIMIT_QUERY_PARAM_NAME))
        }
    }

    @Test
    fun `should GET character by id default offset and limit`() =
        testWithCharacterIdAndDefaultOffsetAndLimit(
            client::getCharacter,
            CHARACTER_ID,
            "/v1/public/characters/$CHARACTER_ID"
        )

    @Test
    fun `should GET character by id custom offset and limit`() =
        testWithCharacterIdAndCustomOffsetAndLimit(
            client::getCharacter,
            CHARACTER_ID,
            "/v1/public/characters/$CHARACTER_ID"
        )

    @Test
    fun `should GET comics by character id default offset and limit`() =
        testWithCharacterIdAndDefaultOffsetAndLimit(
            client::getComics,
            CHARACTER_ID,
            "/v1/public/characters/$CHARACTER_ID/comics"
        )

    @Test
    fun `should GET comics by character id custom offset and limit`() =
        testWithCharacterIdAndCustomOffsetAndLimit(
            client::getComics,
            CHARACTER_ID,
            "/v1/public/characters/$CHARACTER_ID/comics"
        )

    @Test
    fun `should GET events by character id with default offset and limit`() =
        testWithCharacterIdAndDefaultOffsetAndLimit(
            client::getEvents,
            CHARACTER_ID,
            "/v1/public/characters/$CHARACTER_ID/events"
        )

    @Test
    fun `should GET events by character id with custom offset and limit`() =
        testWithCharacterIdAndCustomOffsetAndLimit(
            client::getEvents,
            CHARACTER_ID,
            "/v1/public/characters/$CHARACTER_ID/events"
        )

    @Test
    fun `should GET series by character id with default offset and limit`() =
        testWithCharacterIdAndDefaultOffsetAndLimit(
            client::getSeries,
            CHARACTER_ID,
            "/v1/public/characters/$CHARACTER_ID/series"
        )

    @Test
    fun `should GET series by character id with custom offset and limit`() =
        testWithCharacterIdAndCustomOffsetAndLimit(
            client::getSeries,
            CHARACTER_ID,
            "/v1/public/characters/$CHARACTER_ID/series"
        )

    @Test
    fun `should GET stories by character id with default offset and limit`() =
        testWithCharacterIdAndDefaultOffsetAndLimit(
            client::getStories,
            CHARACTER_ID,
            "/v1/public/characters/$CHARACTER_ID/stories"
        )

    @Test
    fun `should GET stories by character id with custom offset and limit`() =
        testWithCharacterIdAndCustomOffsetAndLimit(
            client::getStories,
            CHARACTER_ID,
            "/v1/public/characters/$CHARACTER_ID/stories"
        )


    private fun <T> testWithCharacterIdAndDefaultOffsetAndLimit(
        endpoint: (Long, Long, String, String) -> Call<MarvelResponse<T>>,
        characterId: Long,
        expectedUrl: String
    ) {
        // Given character id, timestamp, api key and hash

        // When we call  the client
        val call = endpoint(characterId, TIMESTAMP, API_KEY, HASH_CODE)

        // Then we expect the request to contain all the required parameters
        with(call.request()) {
            assertEquals("GET", method())
            assertEquals(expectedUrl, url().pathSegments().joinToString(separator = "/", prefix = "/"))
            assertEquals(TIMESTAMP.toString(), url().queryParameter(TIMESTAMP_QUERY_PARAM_NAME))
            assertEquals(API_KEY, url().queryParameter(API_KEY_QUERY_PARAM_NAME))
            assertEquals(HASH_CODE, url().queryParameter(HASH_QUERY_PARAM_NAME))
            assertEquals(DEFAULT_OFFSET.toString(), url().queryParameter(OFFSET_QUERY_PARAM_NAME))
            assertEquals(DEFAULT_LIMIT.toString(), url().queryParameter(LIMIT_QUERY_PARAM_NAME))
        }
    }

    private fun <T> testWithCharacterIdAndCustomOffsetAndLimit(
        endpoint: (Long, Long, String, String, Long, Long) -> Call<MarvelResponse<T>>,
        characterId: Long,
        expectedUrl: String
    ) {
        // Given character id, timestamp, api key and hash

        // When we call  the client
        val call = endpoint(characterId, TIMESTAMP, API_KEY, HASH_CODE, CUSTOM_OFFSET, CUSTOM_LIMIT)

        // Then we expect the request to contain all the required parameters
        with(call.request()) {
            assertEquals("GET", method())
            assertEquals(expectedUrl, url().pathSegments().joinToString(separator = "/", prefix = "/"))
            assertEquals(TIMESTAMP.toString(), url().queryParameter(TIMESTAMP_QUERY_PARAM_NAME))
            assertEquals(API_KEY, url().queryParameter(API_KEY_QUERY_PARAM_NAME))
            assertEquals(HASH_CODE, url().queryParameter(HASH_QUERY_PARAM_NAME))
            assertEquals(CUSTOM_LIMIT.toString(), url().queryParameter(OFFSET_QUERY_PARAM_NAME))
            assertEquals(CUSTOM_OFFSET.toString(), url().queryParameter(LIMIT_QUERY_PARAM_NAME))
        }
    }

    companion object {
        private const val TIMESTAMP_QUERY_PARAM_NAME = "ts"
        private const val API_KEY_QUERY_PARAM_NAME = "apikey"
        private const val HASH_QUERY_PARAM_NAME = "hash"
        private const val OFFSET_QUERY_PARAM_NAME = "offset"
        private const val LIMIT_QUERY_PARAM_NAME = "limit"

        private const val CHARACTER_ID = 123456L
        private const val API_KEY = "api key"
        private const val HASH_CODE = "request hash code"
        private const val DEFAULT_OFFSET = 0L
        private const val DEFAULT_LIMIT = 100L
        private const val CUSTOM_OFFSET = 1000L
        private const val CUSTOM_LIMIT = 30L
        private val TIMESTAMP = Instant.now().epochSecond
    }
}
