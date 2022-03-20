package com.yonatankarp.marvel.test_objects

import com.yonatankarp.marvel.model.Comics
import java.time.OffsetDateTime

/**
 * @author yonatankarp
 */
interface ComicsTestData : TextObjectTestData, UrlTestData, SeriesTestData, DateTestData, PriceTestData, ImageTestData,
    ResourceListTestData {
    val defaultComics: Comics
        get() = Comics(
            22506,
            10949,
            "Avengers: The Initiative (2007) #19",
            19,
            "",
            "",
            OffsetDateTime.parse("2015-10-27T20:38:23Z"),
            "",
            "5960606084-01911",
            "SEP082362",
            "",
            "",
            "Comic",
            32,
            arrayOf(defaultTextObject),
            "http://gateway.marvel.com/v1/public/comics/22506",
            setOf(defaultUrl),
            defaultSeriesSummary,
            emptyArray(),
            emptyArray(),
            emptyArray(),
            arrayOf(defaultDate),
            arrayOf(defaultPrice),
            defaultImage,
            arrayOf(anotherImage),
            defaultCreatorResourceList,
            defaultCharacterResourceList,
            defaultStoryResourceList,
            defaultEventResourceList,
        )
}
