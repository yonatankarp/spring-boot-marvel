package com.yonatankarp.marvel.test_objects

import com.yonatankarp.marvel.model.Character
import com.yonatankarp.marvel.model.Comics
import com.yonatankarp.marvel.model.Event
import com.yonatankarp.marvel.model.common.ResponseWrapper

interface ResponseWrapperTestObject : CharacterTestObject {

    val defaultCharactersResponseWrapper: ResponseWrapper<Character>
        get() = ResponseWrapper(
            0,
            20,
            1560,
            20,
            arrayOf(defaultCharacter, anotherCharacter)
        )

    val defaultCharacterResponseWrapper: ResponseWrapper<Character>
        get() = ResponseWrapper(
            0,
            20,
            1560,
            20,
            arrayOf(defaultCharacter)
        )

    val defaultComicsResponseWrapper: ResponseWrapper<Comics>
        get() = ResponseWrapper(
            0,
            20,
            1560,
            20,
            arrayOf(defaultComics)
        )

    val defaultEventResponseWrapper: ResponseWrapper<Event>
        get() = ResponseWrapper(
            0,
            20,
            1560,
            20,
            arrayOf(defaultEvent)
        )
}
