package com.yonatankarp.marvel.test_objects

import com.yonatankarp.marvel.model.Character
import com.yonatankarp.marvel.model.Comics
import com.yonatankarp.marvel.model.Event
import com.yonatankarp.marvel.model.common.MarvelResponse

interface MarvelResponseTestObject : ResponseWrapperTestObject {
    val defaultCharactersMarvelResponse: MarvelResponse<Character>
        get() = MarvelResponse(
            STATUS_CODE,
            STATUS_VALUE,
            COPYRIGHTS,
            ATTRIBUTE_TEXT,
            ATTRIBUTE_HTML,
            ETAG,
            defaultCharactersResponseWrapper
        )

    val defaultSingleCharacterMarvelResponse: MarvelResponse<Character>
        get() = MarvelResponse(
            STATUS_CODE,
            STATUS_VALUE,
            COPYRIGHTS,
            ATTRIBUTE_TEXT,
            ATTRIBUTE_HTML,
            ETAG,
            defaultCharacterResponseWrapper
        )

    val defaultComicsMarvelResponse: MarvelResponse<Comics>
        get() = MarvelResponse(
            STATUS_CODE,
            STATUS_VALUE,
            COPYRIGHTS,
            ATTRIBUTE_TEXT,
            ATTRIBUTE_HTML,
            ETAG,
            defaultComicsResponseWrapper
        )

    val defaultEventsMarvelResponse: MarvelResponse<Event>
        get() = MarvelResponse(
            STATUS_CODE,
            STATUS_VALUE,
            COPYRIGHTS,
            ATTRIBUTE_TEXT,
            ATTRIBUTE_HTML,
            ETAG,
            defaultEventResponseWrapper
        )

    companion object {
        private const val STATUS_CODE = 200
        private const val STATUS_VALUE = "Ok"
        private const val COPYRIGHTS = "© 2022 MARVEL"
        private const val ATTRIBUTE_TEXT = "Data provided by Marvel. © 2022 MARVEL"
        private const val ATTRIBUTE_HTML = "<a href=\"http://marvel.com\">Data provided by Marvel. © 2022 MARVEL</a>"
        private const val ETAG = "f09847059d85fe1ffd88ed7c95e140559593fc9a"
    }
}
