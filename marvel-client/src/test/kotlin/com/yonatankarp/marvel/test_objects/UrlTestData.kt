package com.yonatankarp.marvel.test_objects

import com.yonatankarp.marvel.model.common.Url

interface UrlTestData {
    val defaultUrl: Url
        get() = Url(
            "detail",
            "http://marvel.com/comics/characters/1011334/3-d_man?utm_campaign=apiRef&utm_source=1885c34d3263b37ab5104ee97fd397e3",
        )

    val anotherUrl: Url
        get() = Url(
            "detail",
            "http://marvel.com/characters/76/a-bomb?utm_campaign=apiRef&utm_source=1885c34d3263b37ab5104ee97fd397e3",
        )
}
