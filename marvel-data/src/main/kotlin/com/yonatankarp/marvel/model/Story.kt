package com.yonatankarp.marvel.model

import com.yonatankarp.marvel.model.common.Image
import com.yonatankarp.marvel.model.common.ResourceList
import java.time.Instant

/**
 * A model representing a single story in the Marvel API.
 *
 * @author yonatankarp
 */
data class Story(
    /**
     * The unique ID of the story resource.
     */
    val id: Int,

    /**
     * The story title.
     */
    val title: String,

    /**
     * A short description of the story.
     */
    val description: String,

    /**
     * The canonical URL identifier for this resource.
     */
    val resourceUri: String,

    /**
     * The story type e.g. interior story, cover, text story.
     */
    val type: String,

    /**
     * The date the resource was most recently modified.
     */
    val modified: Instant,

    /**
     * The representative image for this story.
     */
    val thumbnail: Image,

    /**
     * A resource list containing comics in which this story takes place.
     */
    val comics: ResourceList<ComicsSummary>,

    /**
     * A resource list containing series in which this story appears.
     */
    val series: ResourceList<SeriesSummary>,

    /**
     * 	A resource list of the events in which this story appears.
     */
    val events: ResourceList<EventSummary>,

    /**
     * A resource list of characters which appear in this story.
     */
    val character: ResourceList<CharacterSummary>,

    /**
     * A resource list of creators who worked on this story.
     */
    val creator: ResourceList<CreatorSummary>,

    /**
     * A summary representation of the issue in which this story was originally
     * published.
     */
    val originalIssue: ComicsSummary
)
