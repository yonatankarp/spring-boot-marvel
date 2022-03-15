package com.yonatankarp.marvel.model.common

/**
 * Images are represented as a partial path and an extension.
 * For more information see: https://developer.marvel.com/documentation/images
 *
 * @author yonatankarp
 */
data class Image(
    /**
     * The directory path of to the image.
     */
    val path: String,

    /**
     * The file extension for the image.
     */
    val extension: String
)
