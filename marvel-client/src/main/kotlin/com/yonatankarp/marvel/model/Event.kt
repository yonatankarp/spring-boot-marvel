package com.yonatankarp.marvel.model

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty
import com.yonatankarp.marvel.model.common.Image
import com.yonatankarp.marvel.model.common.ResourceList
import com.yonatankarp.marvel.model.common.Url
import java.time.Instant
import java.time.OffsetDateTime

/**
 * A model representing a single event in the Marvel API.
 *
 * @author yonatankarp
 */
data class Event(
    /**
     * The unique ID of the event resource.
     */
    @JsonProperty("id")
    var id: Int? = null,

    /**
     * The title of the event.
     */
    @JsonProperty("title")
    var title: String? = null,

    /**
     * A description of the event.
     */
    @JsonProperty("description")
    var description: String? = null,

    /**
     * The canonical URL identifier for this resource.
     */
    @JsonProperty("resourceURI")
    var resourceUri: String? = null,

    /**
     * A set of public website URLs for the event.
     */
    @JsonProperty("urls")
    var urls: Set<Url>? = null,

    /**
     * The date the resource was most recently modified.
     */
    @JsonProperty("modified")
    var modified: OffsetDateTime? = null,

    /**
     * The date of publication of the first issue in this event.
     */
    @JsonProperty("start")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    var start: Instant? = null,

    /**
     * The date of publication of the last issue in this event.
     */
    @JsonProperty("end")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    var end: Instant? = null,

    /**
     * The representative image for this event.
     */
    @JsonProperty("thumbnail")
    var thumbnail: Image? = null,

    /**
     * A resource list containing the comics in this event.
     */
    @JsonProperty("comics")
    var comics: ResourceList<ComicsSummary>? = null,

    /**
     * A resource list containing the stories in this event.
     */
    @JsonProperty("stories")
    var stories: ResourceList<StorySummary>? = null,

    /**
     * A resource list containing the series in this event.
     */
    @JsonProperty("series")
    var series: ResourceList<SeriesSummary>? = null,

    /**
     * A resource list containing the characters which appear in this event.
     */
    @JsonProperty("characters")
    var characters: ResourceList<CharacterSummary>? = null,

    /**
     * A resource list containing creators whose work appears in this event.
     */
    @JsonProperty("creators")
    var creators: ResourceList<CreatorSummary>? = null,

    /**
     * A summary representation of the event which follows this event.
     */
    @JsonProperty("next")
    var next: EventSummary? = null,

    /**
     * A summary representation of the event which preceded this event.
     */
    @JsonProperty("previous")
    var previous: EventSummary? = null,
)
