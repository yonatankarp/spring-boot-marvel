package com.yonatankarp.marvel.test_objects

import com.yonatankarp.marvel.model.CharacterSummary
import com.yonatankarp.marvel.model.ComicsSummary
import com.yonatankarp.marvel.model.CreatorSummary
import com.yonatankarp.marvel.model.EventSummary
import com.yonatankarp.marvel.model.SeriesSummary
import com.yonatankarp.marvel.model.StorySummary
import com.yonatankarp.marvel.model.common.ResourceList

/**
 * @author yonatankarp
 */
interface ResourceListTestData : SummariseTestData, SeriesTestData, StoryTestData {
    val defaultComicsResourceList: ResourceList<ComicsSummary>
        get() = ResourceList(
            12,
            12,
            "http://gateway.marvel.com/v1/public/characters/1011334/comics",
            arrayOf(defaultComicsSummary),
        )

    val anotherComicsResourceList: ResourceList<ComicsSummary>
        get() = ResourceList(
            4,
            4,
            "http://gateway.marvel.com/v1/public/characters/1017100/comics",
            arrayOf(anotherComicsSummary),
        )

    val defaultSeriesResourceList: ResourceList<SeriesSummary>
        get() = ResourceList(
            3,
            3,
            "http://gateway.marvel.com/v1/public/characters/1011334/series",
            arrayOf(defaultSeriesSummary),
        )

    val anotherSeriesResourceList: ResourceList<SeriesSummary>
        get() = ResourceList(
            2,
            2,
            "http://gateway.marvel.com/v1/public/characters/1017100/series",
            arrayOf(anotherSeriesSummary),
        )

    val defaultStoryResourceList: ResourceList<StorySummary>
        get() = ResourceList(
            21,
            20,
            "http://gateway.marvel.com/v1/public/characters/1011334/stories",
            arrayOf(defaultStorySummary),
        )

    val anotherStoryResourceList: ResourceList<StorySummary>
        get() = ResourceList(
            7,
            7,
            "http://gateway.marvel.com/v1/public/characters/1017100/stories",
            arrayOf(anotherStorySummary),
        )

    val defaultEventResourceList: ResourceList<EventSummary>
        get() = ResourceList(
            1,
            1,
            "http://gateway.marvel.com/v1/public/characters/1011334/events",
            arrayOf(defaultEventSummary),
        )

    val anotherEventResourceList: ResourceList<EventSummary>
        get() = ResourceList(
            0,
            0,
            "http://gateway.marvel.com/v1/public/characters/1017100/events",
            emptyArray(),
        )

    val defaultCreatorResourceList: ResourceList<CreatorSummary>
        get() = ResourceList(
            9,
            9,
            "http://gateway.marvel.com/v1/public/comics/22506/creators",
            arrayOf(defaultCreatorSummary)
        )

    val defaultCharacterResourceList: ResourceList<CharacterSummary>
        get() = ResourceList(
            9,
            9,
            "http://gateway.marvel.com/v1/public/comics/22506/characters",
            arrayOf(defaultCharacterSummary)
        )
}
