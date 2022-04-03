package com.yonatankarp.marvel.clients

import java.io.File

/**
 * @author yonatankarp
 */
abstract class AbstractIntegrationTest {
    /**
     * Helper function which will load JSON from the path specified.
     *
     * @param path :  Path to the JSON file
     * @return JSON from file at a given path.
     */
    internal fun getJson(path: String): String {
        val url = this.javaClass.classLoader.getResource(path)
        val file = File(url!!.path)
        return String(file.readBytes())
    }
}
