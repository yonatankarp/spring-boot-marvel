package com.yonatankarp.marvel.test_objects

import com.yonatankarp.marvel.model.common.TextObjects

interface TextObjectTestData {
    val defaultTextObject: TextObjects
        get() = TextObjects(
            "issue_preview_text",
            "en-us",
            "Join 3-D MAN, CLOUD 9, KOMODO, HARDBALL, and heroes around America in the battle that will decide the fate of the planet and the future of the Initiative program. Will the Kill Krew Army win the day?"
        )
}
