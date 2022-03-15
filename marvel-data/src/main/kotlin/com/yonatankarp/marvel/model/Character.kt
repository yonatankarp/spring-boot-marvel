package com.yonatankarp.marvel.model

import com.yonatankarp.marvel.model.common.Image
import com.yonatankarp.marvel.model.common.ResourceList
import com.yonatankarp.marvel.model.common.Url
import java.time.Instant

/**
 * A model representing a single character in the Marvel API.
 *
 * @author yonatankarp
 */
data class Character(
    /**
     * The unique ID of the character resource.
     */
    val id: Int,

    /**
     * The name of the character.
     */
    val name: String,

    /**
     * A short bio or description of the character.
     */
    val description: String,

    /**
     * The date the resource was most recently modified.
     */
    val modified: Instant,

    /**
     * The canonical URL identifier for this resource.
     */
    val resourceUri: String,

    /**
     * A set of public website URLs for the resource.
     */
    val urls: Set<Url>,

    /**
     * The representative image for this character.
     */
    val thumbnail: Image,

    /**
     * A resource list containing comics which feature this character.
     */
    val comics: ResourceList<ComicsSummary>,

    /**
     * A resource list of stories in which this character appears.
     */
    val stories: ResourceList<StorySummary>,

    /**
     * A resource list of events in which this character appears.
     */
    val events: ResourceList<EventSummary>,

    /**
     * A resource list of series in which this character appears.
     */
    val series: ResourceList<SeriesSummary>
)
