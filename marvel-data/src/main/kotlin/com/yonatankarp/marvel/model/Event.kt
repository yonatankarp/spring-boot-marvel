package com.yonatankarp.marvel.model

import com.yonatankarp.marvel.model.common.Image
import com.yonatankarp.marvel.model.common.ResourceList
import com.yonatankarp.marvel.model.common.Url
import java.time.Instant

/**
 * A model representing a single event in the Marvel API.
 *
 * @author yonatankarp
 */
data class Event(
    /**
     * The unique ID of the event resource.
     */
    val id: Int,

    /**
     * The title of the event.
     */
    val title: String,

    /**
     * A description of the event.
     */
    val description: String,

    /**
     * The canonical URL identifier for this resource.
     */
    val resourceUri: String,

    /**
     * A set of public website URLs for the event.
     */
    val urls: Set<Url>,

    /**
     * The date the resource was most recently modified.
     */
    val modified: Instant,

    /**
     * The date of publication of the first issue in this event.
     */
    val start: Instant,

    /**
     * The date of publication of the last issue in this event.
     */
    val end: Instant,

    /**
     * The representative image for this event.
     */
    val thumbnail: Image,

    /**
     * A resource list containing the comics in this event.
     */
    val comics: ResourceList<ComicsSummary>,

    /**
     * A resource list containing the stories in this event.
     */
    val stories: ResourceList<StorySummary>,

    /**
     * A resource list containing the series in this event.
     */
    val series: ResourceList<SeriesSummary>,

    /**
     * A resource list containing the characters which appear in this event.
     */
    val characters: ResourceList<CharacterSummary>,

    /**
     * A resource list containing creators whose work appears in this event.
     */
    val creators: ResourceList<CreatorSummary>,

    /**
     * A summary representation of the event which follows this event.
     */
    val next: EventSummary,

    /**
     * A summary representation of the event which preceded this event.
     */
    val previous: EventSummary
)
