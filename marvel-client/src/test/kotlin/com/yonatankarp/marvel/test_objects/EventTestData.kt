package com.yonatankarp.marvel.test_objects

import com.yonatankarp.marvel.model.Event
import java.time.Instant
import java.time.OffsetDateTime

/**
 * @author yonatankarp
 */
interface EventTestData : UrlTestData, ImageTestData, ResourceListTestData {

    val defaultEvent: Event
        get() = Event(
            269,
            "Secret Invasion",
            "The shape-shifting Skrulls have been infiltrating the Earth for years, replacing many of Marvel's heroes with impostors, setting the stage for an all-out invasion.",
            "http://gateway.marvel.com/v1/public/events/269",
            setOf(defaultUrl),
            OffsetDateTime.parse("2015-01-20T19:58:35Z"),
            Instant.parse("2008-06-02T00:00:00Z"),
            Instant.parse("2009-01-25T00:00:00Z"),
            defaultImage,
            defaultComicsResourceList,
            defaultStoryResourceList,
            defaultSeriesResourceList,
            defaultCharacterResourceList,
            defaultCreatorResourceList,
            defaultEventSummary,
            anotherEventSummary,
        )
}
