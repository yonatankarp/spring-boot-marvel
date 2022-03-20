package com.yonatankarp.marvel.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.yonatankarp.marvel.model.common.Image
import com.yonatankarp.marvel.model.common.ResourceList
import java.time.OffsetDateTime

/**
 * A model representing a single story in the Marvel API.
 *
 * @author yonatankarp
 */
data class Story(
    /**
     * The unique ID of the story resource.
     */
    @JsonProperty("id")
    var id: Int? = null,

    /**
     * The story title.
     */
    @JsonProperty("title")
    var title: String? = null,

    /**
     * A short description of the story.
     */
    @JsonProperty("description")
    var description: String? = null,

    /**
     * The canonical URL identifier for this resource.
     */
    @JsonProperty("resourceURI")
    var resourceUri: String? = null,

    /**
     * The story type e.g. interior story, cover, text story.
     */
    @JsonProperty("type")
    var type: String? = null,

    /**
     * The date the resource was most recently modified.
     */
    @JsonProperty("modified")
    var modified: OffsetDateTime? = null,

    /**
     * The representative image for this story.
     */
    @JsonProperty("thumbnail")
    var thumbnail: Image? = null,

    /**
     * A resource list containing comics in which this story takes place.
     */
    @JsonProperty("comics")
    var comics: ResourceList<ComicsSummary>? = null,

    /**
     * A resource list containing series in which this story appears.
     */
    @JsonProperty("series")
    var series: ResourceList<SeriesSummary>? = null,

    /**
     * 	A resource list of the events in which this story appears.
     */
    @JsonProperty("events")
    var events: ResourceList<EventSummary>? = null,

    /**
     * A resource list of characters which appear in this story.
     */
    @JsonProperty("characters")
    var character: ResourceList<CharacterSummary>? = null,

    /**
     * A resource list of creators who worked on this story.
     */
    @JsonProperty("creators")
    var creator: ResourceList<CreatorSummary>? = null,

    /**
     * A summary representation of the issue in which this story was originally
     * published.
     */
    @JsonProperty("originalIssue")
    var originalIssue: ComicsSummary? = null,
)
