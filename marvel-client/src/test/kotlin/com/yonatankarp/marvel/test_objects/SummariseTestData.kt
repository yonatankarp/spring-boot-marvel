package com.yonatankarp.marvel.test_objects

import com.yonatankarp.marvel.model.CharacterSummary
import com.yonatankarp.marvel.model.ComicsSummary
import com.yonatankarp.marvel.model.CreatorSummary
import com.yonatankarp.marvel.model.EventSummary

interface SummariseTestData {
    val defaultComicsSummary: ComicsSummary
        get() = ComicsSummary(
            "http://gateway.marvel.com/v1/public/comics/21366",
            "Avengers: The Initiative (2007) #14",
        )

    val anotherComicsSummary: ComicsSummary
        get() = ComicsSummary(
            "http://gateway.marvel.com/v1/public/comics/47176",
            "FREE COMIC BOOK DAY 2013 1 (2013) #1",
        )

    val defaultCharacterSummary: CharacterSummary
        get() = CharacterSummary(
            "http://gateway.marvel.com/v1/public/characters/1010802",
            "Ant-Man (Eric O'Grady)",
        )

    val anotherCharacterSummary: CharacterSummary
        get() = CharacterSummary(
            "http://gateway.marvel.com/v1/public/characters/1011334",
            "3-D Man",
        )

    val defaultCreatorSummary: CreatorSummary
        get() = CreatorSummary(
            "http://gateway.marvel.com/v1/public/creators/2133",
            "Tom Brevoort",
            "editor",
        )

    val anotherCreatorSummary: CreatorSummary
        get() = CreatorSummary(
            "http://gateway.marvel.com/v1/public/creators/12581",
            "Chris Eliopoulos",
            "letterer",
        )

    val defaultEventSummary: EventSummary
        get() = EventSummary(
            "http://gateway.marvel.com/v1/public/events/269",
            "Secret Invasion",
        )

    val anotherEventSummary: EventSummary
        get() = EventSummary(
            "http://gateway.marvel.com/v1/public/events/318",
            "Dark Reign",
        )
}
