package com.yonatankarp.marvel.model.common

import com.fasterxml.jackson.annotation.JsonProperty
import com.yonatankarp.marvel.model.BaseSummary

/**
 * Resource lists are collections of summary views within the context of another
 * entity type. For example, the list of creators attached to a comic would be
 * presented as resource list inside the full representation of that comic.
 *
 * @author yonatankarp
 */
@Suppress("kotlin:S6218")
data class ResourceList<T : BaseSummary>(
    /**
     * The number of total available resources in this list.
     */
    @JsonProperty("available")
    var available: Int? = null,

    /**
     * The number of resources returned in this resource list (up to 20).
     */
    @JsonProperty("returned")
    var returned: Int? = null,

    /**
     * The path to the list of full view representations of the items in this
     * resource list.
     */
    @JsonProperty("collectionURI")
    var collectionUri: String? = null,

    /**
     * A list of summary views of the items in this resource list.
     */
    @JsonProperty("items")
    var items: Array<T>? = null,
) {
    @Suppress("DuplicatedCode")
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ResourceList<*>

        if (available != other.available) return false
        if (returned != other.returned) return false
        if (collectionUri != other.collectionUri) return false
        if (!items.contentEquals(other.items)) return false

        return true
    }

    @Suppress("DuplicatedCode")
    override fun hashCode(): Int {
        var result = available.hashCode()
        result = 31 * result + returned.hashCode()
        result = 31 * result + collectionUri.hashCode()
        result = 31 * result + items.hashCode()
        return result
    }

    override fun toString(): String =
        StringBuilder().append("ResourceList(")
            .append("available=").append(available).append(". ")
            .append("returned=").append(returned).append(", ")
            .append("collectionUri=").append(collectionUri).append(", ")
            .append("items=").append(items?.joinToString(separator = ",", prefix = "{", postfix = "}"))
            .toString()
}
