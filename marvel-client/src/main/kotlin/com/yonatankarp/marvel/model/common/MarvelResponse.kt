package com.yonatankarp.marvel.model.common

import com.fasterxml.jackson.annotation.JsonProperty

data class MarvelResponse<T>(
    /**
     * The numeric status code of this response.
     */
    @JsonProperty("code")
    var code: Int? = null,

    /**
     * The string representation of the status code of this response.
     */
    @JsonProperty("status")
    var status: String? = null,

    /**
     * Copyrights
     */
    @JsonProperty("copyright")
    val copyright: String? = null,

    /**
     * Attribute text for Marvel' API.
     */
    @JsonProperty("attributionText")
    var attributionText: String? = null,

    /**
     * Attribute HTML for Marvel' API.
     */
    @JsonProperty("attributionHTML")
    var attributionHTML: String? = null,

    /**
     * The etag of this response.
     */
    @JsonProperty("etag")
    var etag: String? = null,

    /**
     * The results of the request.
     */
    @JsonProperty("data")
    var data: ResponseWrapper<T>? = null,
)

