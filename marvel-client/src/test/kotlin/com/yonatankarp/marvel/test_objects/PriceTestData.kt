package com.yonatankarp.marvel.test_objects

import com.yonatankarp.marvel.model.common.Price

interface PriceTestData {
    val defaultPrice: Price
        get() = Price(
            "printPrice",
            2.99,
        )
}
