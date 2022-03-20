package com.yonatankarp.marvel.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import java.util.Objects

@Suppress("HasPlatformType")
@Configuration
class MarvelConfig {
    fun configureJackson(@Autowired objectMapper: ObjectMapper) =
        Objects
            .requireNonNullElse(objectMapper, ObjectMapper())
            .registerModule(JavaTimeModule())
            .registerModule(Jdk8Module())
}
