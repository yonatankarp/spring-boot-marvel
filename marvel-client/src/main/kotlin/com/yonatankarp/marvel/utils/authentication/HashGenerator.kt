package com.yonatankarp.marvel.utils.authentication

import com.yonatankarp.marvel.config.ApiConfig
import org.springframework.stereotype.Component
import org.springframework.util.DigestUtils

@Component
class HashGenerator(val config: ApiConfig) {
    fun generate(ts: Long): String {
        val password = ts.toString() + config.privateKey + config.publicKey
        return DigestUtils.md5DigestAsHex(password.toByteArray())
    }
}
