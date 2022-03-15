package com.yonatankarp.marvel.model.common

/**
 * A model representing a single price in the Marvel API.
 *
 * @author yonatankarp
 */
data class Price(
    /**
     * The type of the price.
     */
    val type: String,

    /**
     * The amount
     */
    val price: Int
)
