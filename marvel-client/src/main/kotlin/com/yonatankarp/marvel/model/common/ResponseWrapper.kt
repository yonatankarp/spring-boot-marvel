package com.yonatankarp.marvel.model.common

import com.fasterxml.jackson.annotation.JsonProperty

data class ResponseWrapper<T>(
    /**
     * The offset associated with this response.
     */
    @JsonProperty("offset")
    var offset: Int? = null,

    /**
     * The limit associated with this response.
     */
    @JsonProperty("limit")
    var limit: Int? = null,

    /**
     * The total number of entities in the Marvel API.
     */
    @JsonProperty("total")
    var total: Int? = null,

    /**
     * The number of results in this response.
     */
    @JsonProperty("count")
    var count: Int? = null,

    /**
     * A collection of results for the given request.
     */
    @JsonProperty("results")
    var results: Array<T>? = null,
) {
    @Suppress("DuplicatedCode")
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ResponseWrapper<*>

        if (offset != other.offset) return false
        if (limit != other.limit) return false
        if (total != other.total) return false
        if (count != other.count) return false
        if (!results.contentEquals(other.results)) return false

        return true
    }

    @Suppress("DuplicatedCode")
    override fun hashCode(): Int {
        var result = offset.hashCode()
        result = 31 * result + limit.hashCode()
        result = 31 * result + total.hashCode()
        result = 31 * result + count.hashCode()
        result = 31 * result + results.hashCode()
        return result
    }

    override fun toString(): String =
        StringBuilder().append("ResponseWrapper(")
            .append("offset=").append(offset).append(", ")
            .append("limit=").append(limit).append(", ")
            .append("total").append(total).append(", ")
            .append("count").append(count).append(", ")
            .append("results=").append(results?.joinToString(separator = ",", prefix = "{", postfix = "}"))
            .toString()

}
