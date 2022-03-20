package com.yonatankarp.marvel.test_objects

import com.yonatankarp.marvel.model.SeriesSummary

/**
 * @author yonatankarp
 */
interface SeriesTestData {
    val defaultSeriesSummary: SeriesSummary
        get() = SeriesSummary(
            "http://gateway.marvel.com/v1/public/series/1945",
            "Avengers: The Initiative (2007 - 2010)",
        )

    val anotherSeriesSummary: SeriesSummary
        get() = SeriesSummary(
            "http://gateway.marvel.com/v1/public/series/17765",
            "FREE COMIC BOOK DAY 2013 1 (2013)",
        )
}
