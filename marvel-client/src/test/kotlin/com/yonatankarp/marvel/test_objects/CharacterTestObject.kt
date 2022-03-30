package com.yonatankarp.marvel.test_objects

import com.yonatankarp.marvel.model.Character
import java.time.OffsetDateTime

/**
 * @author yonatankarp
 */
interface CharacterTestObject :
    ImageTestData,
    ComicsTestData,
    SeriesTestData,
    StoryTestData,
    EventTestData,
    ResourceListTestData,
    UrlTestData {
    val defaultCharacter: Character
        get() = Character(
            1011334,
            "3-D Man",
            "",
            OffsetDateTime.parse("2014-04-29T18:18:17Z"),
            "http://gateway.marvel.com/v1/public/characters/1011334",
            setOf(defaultUrl),
            defaultImage,
            defaultComicsResourceList,
            defaultStoryResourceList,
            defaultEventResourceList,
            defaultSeriesResourceList,
        )

    val anotherCharacter: Character
        get() = Character(
            1017100,
            "A-Bomb (HAS)",
            "Rick Jones has been Hulk's best bud since day one, but now he's more than a friend...he's a teammate! Transformed by a Gamma energy explosion, A-Bomb's thick, armored skin is just as strong and powerful as it is blue. And when he curls into action, he uses it like a giant bowling ball of destruction! ",
            OffsetDateTime.parse("2013-09-18T19:54:04Z"),
            "http://gateway.marvel.com/v1/public/characters/1017100",
            setOf(anotherUrl),
            anotherImage,
            anotherComicsResourceList,
            anotherStoryResourceList,
            anotherEventResourceList,
            anotherSeriesResourceList,
        )
}
