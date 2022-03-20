package com.yonatankarp.marvel.model.common

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime

/**
 * A representation of dates and it's metadata.
 *
 * @author yonatankarp
 */
data class Date(
    /**
     * The type of the date (e.g. "onSaleDate", "focDate", "unlimitedDate",
     * "digitalPurchaseDate")
     */
    @JsonProperty("type")
    var type: String? = null,

    /**
     * The date representation in UTC.
     */
    @JsonProperty("date")
    var date: OffsetDateTime? = null
)
