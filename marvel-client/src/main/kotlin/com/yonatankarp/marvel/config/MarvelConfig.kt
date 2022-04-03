package com.yonatankarp.marvel.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.yonatankarp.marvel.clients.MarvelCharacterClient
import okhttp3.OkHttpClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import java.util.Objects

@Suppress("HasPlatformType")
@Configuration
class MarvelConfig {

    @Autowired
    fun configureJackson(objectMapper: ObjectMapper) =
        Objects
            .requireNonNullElse(objectMapper, ObjectMapper())
            .registerModule(JavaTimeModule())
            .registerModule(Jdk8Module())

    @Bean
    fun marvelCharacterClient(
        objectMapper: ObjectMapper,
        config: ApiConfig
    ): MarvelCharacterClient = Retrofit.Builder()
        .client(OkHttpClient())
        .baseUrl(config.baseUrl)
        .addConverterFactory(JacksonConverterFactory.create(objectMapper))
        .build()
        .create(MarvelCharacterClient::class.java)
}

@Component
@ConfigurationProperties(prefix = "marvel.api")
data class ApiConfig(var baseUrl: String = "", var publicKey: String = "", var privateKey: String = "")
