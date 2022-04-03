package com.yonatankarp.marvel.utils.authentication

import com.yonatankarp.marvel.config.ApiConfig
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@Suppress("kotlin:S100")
internal class HashGeneratorTest {

    private val generator: HashGenerator = HashGenerator(config)

    @Test
    fun `should generate correct hash code`() {
        // Given
        val timestamp = 1L

        // When
        val actual = generator.generate(timestamp)

        // Then
        val expected = "852d790bf3313eeecf72b436795fa4d9"
        assertEquals(expected, actual)
    }

    companion object {
        private const val BASE_URL = "localhost"
        private const val PUBLIC_KEY = "public-key"
        private const val PRIVATE_KEY = "private-key"

        private val config = ApiConfig(BASE_URL, PUBLIC_KEY, PRIVATE_KEY)
    }
}
