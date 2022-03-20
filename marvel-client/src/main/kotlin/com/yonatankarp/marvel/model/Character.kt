package com.yonatankarp.marvel.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.yonatankarp.marvel.model.common.Image
import com.yonatankarp.marvel.model.common.ResourceList
import com.yonatankarp.marvel.model.common.Url
import java.time.OffsetDateTime

/**
 * A model representing a single character in the Marvel API.
 *
 * @author yonatankarp
 */
data class Character(
    /**
     * The unique ID of the character resource.
     */
    @JsonProperty("id")
    var id: Int? = null,

    /**
     * The name of the character.
     */
    @JsonProperty("name")
    var name: String? = null,

    /**
     * A short bio or description of the character.
     */
    @JsonProperty("description")
    var description: String? = null,

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
     * The representative image for this character.
     */
    @JsonProperty("thumbnail")
    var thumbnail: Image? = null,

    /**
     * A resource list containing comics which feature this character.
     */
    @JsonProperty("comics")
    var comics: ResourceList<ComicsSummary>? = null,

    /**
     * A resource list of stories in which this character appears.
     */
    @JsonProperty("stories")
    var stories: ResourceList<StorySummary>? = null,

    /**
     * A resource list of events in which this character appears.
     */
    @JsonProperty("events")
    var events: ResourceList<EventSummary>? = null,

    /**
     * A resource list of series in which this character appears.
     */
    @JsonProperty("series")
    var series: ResourceList<SeriesSummary>? = null,
)
