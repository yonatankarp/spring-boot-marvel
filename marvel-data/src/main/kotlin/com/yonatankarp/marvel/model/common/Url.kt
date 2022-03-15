package com.yonatankarp.marvel.model.common

/**
 * URLs are references to web pages or deep links into applications. (When
 * present in a result set, it is preferred that you use these to link back to
 * Marvel.) Many resources will have more than one representation on the web so
 * URLs are generally presented as an array of URL resources.
 *
 * @author yonatankarp
 */
data class Url(
    /**
     * A text identifier for the URL.
     */
    val type: String,

    /**
     * 	A full URL (including scheme, domain, and path).
     */
    val url: String
)
