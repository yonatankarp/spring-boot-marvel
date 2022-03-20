package com.yonatankarp.marvel.test_objects

import com.yonatankarp.marvel.model.StorySummary

/**
 * @author yonatankarp
 */
interface StoryTestData {
    val defaultStorySummary: StorySummary
        get() = StorySummary(
            "http://gateway.marvel.com/v1/public/stories/19947",
            "Cover #19947",
            "cover",
        )

    val anotherStorySummary: StorySummary
        get() = StorySummary(
            "http://gateway.marvel.com/v1/public/stories/92078",
            "Hulk (2008) #55",
            "cover",
        )
}
