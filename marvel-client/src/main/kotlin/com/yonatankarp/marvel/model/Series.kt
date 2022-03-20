package com.yonatankarp.marvel.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.yonatankarp.marvel.model.common.Image
import com.yonatankarp.marvel.model.common.ResourceList
import com.yonatankarp.marvel.model.common.Url
import java.time.OffsetDateTime

/**
 * A model representing a single series in the Marvel API.
 *
 * @author yonatankarp
 */
data class Series(
    /**
     * The unique ID of the series resource.
     */
    @JsonProperty("id")
    var id: Int? = null,

    /**
     * The canonical title of the series.
     */
    @JsonProperty("title")
    var title: String? = null,

    /**
     * A description of the series.
     */
    @JsonProperty("description")
    var description: String? = null,

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
     * The first year of publication for the series.
     */
    @JsonProperty("startYear")
    var startYear: Int? = null,

    /**
     * The last year of publication for the series (conventionally, 2099 for
     * ongoing series).
     */
    @JsonProperty("endYear")
    var endYear: Int? = null,

    /**
     * The age-appropriateness rating for the series.
     */
    @JsonProperty("rating")
    var rating: String? = null,

    /**
     * The date the resource was most recently modified.
     */
    @JsonProperty("modified")
    var modified: OffsetDateTime? = null,

    /**
     * The representative image for this series.
     */
    @JsonProperty("thumbnail")
    var thumbnail: Image? = null,

    /**
     * A resource list containing comics in this series.
     */
    @JsonProperty("comics")
    var comics: ResourceList<ComicsSummary>? = null,

    /**
     * A resource list containing stories which occur in comics in this series.
     */
    @JsonProperty("stories")
    var stories: ResourceList<StorySummary>? = null,

    /**
     * A resource list containing events which take place in comics in this
     * series.
     */
    @JsonProperty("events")
    var events: ResourceList<EventSummary>? = null,

    /**
     * A resource list containing characters which appear in comics in this
     * series.
     */
    @JsonProperty("characters")
    var characters: ResourceList<CharacterSummary>? = null,

    /**
     * A resource list of creators whose work appears in comics in this series.
     */
    @JsonProperty("creators")
    var creators: ResourceList<CreatorSummary>? = null,

    /**
     * A summary representation of the series which follows this series.
     */
    @JsonProperty("next")
    var next: SeriesSummary? = null,

    /**
     * A summary representation of the series which preceded this series.
     */
    @JsonProperty("previous")
    var previous: SeriesSummary? = null,
)
