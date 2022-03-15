package com.yonatankarp.marvel.model.common

/**
 * Text objects are bits of descriptive text which are attached to an entity.
 *
 * @author yonatankarp
 */
data class TextObjects(
    /**
     * The string description of the text object (e.g. solicit text, preview text, etc.).
     */
    val type: String,

    /**
     * A language code denoting which language the text object is written in.
     */
    val language: String,

    /**
     * The text of the text object.
     */
    val text: String
)
