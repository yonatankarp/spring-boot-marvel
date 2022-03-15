package com.yonatankarp.marvel.model

import com.yonatankarp.marvel.model.common.Image
import com.yonatankarp.marvel.model.common.ResourceList
import com.yonatankarp.marvel.model.common.Url
import java.time.Instant

/**
 * A model representing a single series in the Marvel API.
 *
 * @author yonatankarp
 */
data class Series(
    /**
     * The unique ID of the series resource.
     */
    val id: Int,

    /**
     * The canonical title of the series.
     */
    val title: String,

    /**
     * A description of the series.
     */
    val description: String,

    /**
     * The canonical URL identifier for this resource.
     */
    val resourceUri: String,

    /**
     * A set of public website URLs for the resource.
     */
    val urls: Set<Url>,

    /**
     * The first year of publication for the series.
     */
    val startYear: Int,

    /**
     * The last year of publication for the series (conventionally, 2099 for
     * ongoing series).
     */
    val endYear: Int,

    /**
     * The age-appropriateness rating for the series.
     */
    val rating: String,

    /**
     * The date the resource was most recently modified.
     */
    val modified: Instant,

    /**
     * The representative image for this series.
     */
    val thumbnail: Image,

    /**
     * A resource list containing comics in this series.
     */
    val comics: ResourceList<ComicsSummary>,

    /**
     * A resource list containing stories which occur in comics in this series.
     */
    val stories: ResourceList<StorySummary>,

    /**
     * A resource list containing events which take place in comics in this
     * series.
     */
    val events: ResourceList<EventSummary>,

    /**
     * A resource list containing characters which appear in comics in this
     * series.
     */
    val characters: ResourceList<CharacterSummary>,

    /**
     * A resource list of creators whose work appears in comics in this series.
     */
    val creators: ResourceList<CreatorSummary>,

    /**
     * A summary representation of the series which follows this series.
     */
    val next: SeriesSummary,

    /**
     * A summary representation of the series which preceded this series.
     */
    val previous: SeriesSummary
)
