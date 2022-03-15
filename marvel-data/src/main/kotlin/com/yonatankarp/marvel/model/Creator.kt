package com.yonatankarp.marvel.model

import com.yonatankarp.marvel.model.common.Image
import com.yonatankarp.marvel.model.common.ResourceList
import com.yonatankarp.marvel.model.common.Url
import java.time.Instant

/**
 * A model representing a single creator in the Marvel API.
 *
 * @author yonatankarp
 */
data class Creator(
    /**
     * 	The unique ID of the creator resource.
     */
    val id: Int,

    /**
     * The first name of the creator.
     */
    val firstName: String,

    /**
     * The middle name of the creator.
     */
    val middleName: String,

    /**
     * The last name of the creator.
     */
    val lastName: String,

    /**
     * The suffix or honorific for the creator.
     */
    val suffix: String,

    /**
     * The full name of the creator (a space-separated concatenation of the
     * above four fields).
     */
    val fullName: String,

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
     * The representative image for this creator.
     */
    val thumbnail: Image,

    /**
     * A resource list containing the series which feature work by this creator.
     */
    val series: ResourceList<SeriesSummary>,

    /**
     * A resource list containing the stories which feature work by this
     * creator.
     */
    val stories: ResourceList<StorySummary>,

    /**
     * 	A resource list containing the comics which feature work by this
     * 	creator.
     */
    val comics: ResourceList<ComicsSummary>,

    /**
     * A resource list containing the events which feature work by this
     * creator.
     */
    val events: ResourceList<EventSummary>
)
