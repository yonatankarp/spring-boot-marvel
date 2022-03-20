package com.yonatankarp.marvel.test_objects

import com.yonatankarp.marvel.model.common.Date
import java.time.OffsetDateTime

interface DateTestData {
    val defaultDate: Date
        get() = Date(
            "onsaleDate",
            OffsetDateTime.parse("2008-12-17T05:00:00Z")
        )
}
