package com.yonatankarp.marvel.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.yonatankarp.marvel.model.common.Image
import com.yonatankarp.marvel.model.common.ResourceList
import com.yonatankarp.marvel.model.common.Url
import java.time.OffsetDateTime

/**
 * A model representing a single creator in the Marvel API.
 *
 * @author yonatankarp
 */
data class Creator(
    /**
     * 	The unique ID of the creator resource.
     */
    @JsonProperty("id")
    var id: Int? = null,

    /**
     * The first name of the creator.
     */
    @JsonProperty("firstName")
    var firstName: String? = null,

    /**
     * The middle name of the creator.
     */
    @JsonProperty("middleName")
    var middleName: String? = null,

    /**
     * The last name of the creator.
     */
    @JsonProperty("lastName")
    var lastName: String? = null,

    /**
     * The suffix or honorific for the creator.
     */
    @JsonProperty("suffix")
    var suffix: String? = null,

    /**
     * The full name of the creator (a space-separated concatenation of the
     * above four fields).
     */
    @JsonProperty("fullName")
    var fullName: String? = null,

    /**
     * The date the resource was most recently modified.
     */
    @JsonProperty("modified")
    var modified: OffsetDateTime? = null,

    /**
     * The canonical URL identifier for this resource.
     */
    @JsonProperty("resourceURI")
    var resourceUri: String? = null,

    /**
     * A set of public website URLs for the resource.
     */
    @JsonProperty("urls")
    var urls: Set<Url>? = null,

    /**
     * The representative image for this creator.
     */
    @JsonProperty("thumbnail")
    var thumbnail: Image? = null,

    /**
     * A resource list containing the series which feature work by this creator.
     */
    @JsonProperty("series")
    var series: ResourceList<SeriesSummary>? = null,

    /**
     * A resource list containing the stories which feature work by this
     * creator.
     */
    @JsonProperty("stories")
    var stories: ResourceList<StorySummary>? = null,

    /**
     * 	A resource list containing the comics which feature work by this
     * 	creator.
     */
    @JsonProperty("comics")
    var comics: ResourceList<ComicsSummary>? = null,

    /**
     * A resource list containing the events which feature work by this
     * creator.
     */
    @JsonProperty("events")
    var events: ResourceList<EventSummary>? = null,
)
