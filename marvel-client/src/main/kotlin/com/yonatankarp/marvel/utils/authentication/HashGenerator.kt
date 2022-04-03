package com.yonatankarp.marvel.utils.authentication

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.util.DigestUtils

@Component
class HashGenerator(
    @Value("\${marvel.api.public_key}") val publicKey: String,
    @Value("\${marvel.api.private_key}") private val privateKey: String
) {
    fun generate(ts: Long): String {
        val password = ts.toString() + privateKey + publicKey
        return DigestUtils.md5DigestAsHex(password.toByteArray())
    }
}
