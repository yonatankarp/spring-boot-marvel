package com.yonatankarp.marvel.test_objects

import com.yonatankarp.marvel.model.common.Image

/**
 * @author yonatankarp
 */
interface ImageTestData {
    val defaultImage: Image
        get() = Image(
            "http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784",
            "jpg"
        )

    val anotherImage: Image
        get() = Image(
            "http://i.annihil.us/u/prod/marvel/i/mg/3/20/5232158de5b16",
            "jpg"
        )
}
