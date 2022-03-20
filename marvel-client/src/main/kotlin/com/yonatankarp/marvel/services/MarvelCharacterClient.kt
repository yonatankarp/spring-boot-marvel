package com.yonatankarp.marvel.services

import com.yonatankarp.marvel.model.Character
import com.yonatankarp.marvel.model.Comics
import com.yonatankarp.marvel.model.Event
import com.yonatankarp.marvel.model.common.MarvelResponse
import com.yonatankarp.marvel.model.Series
import com.yonatankarp.marvel.model.Story
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * An interface to interact with Marvel's character API.
 *
 * For more details see: https://developer.marvel.com/docs
 */
interface MarvelCharacterClient {

    @GET("/v1/public/characters")
    fun getCharacters(
        @Query("ts") timestamp: Long,
        @Query("apikey") apiKey: String,
        @Query("hash") hash: String,
        @Query("limit") limit: Long = 100,
        @Query("offset") offset: Long = 0
    ): Call<MarvelResponse<Character>>

    @GET("/v1/public/characters/{characterId}")
    fun getCharacter(
        @Path("characterId") characterId: Long,
        @Query("ts") timestamp: Long,
        @Query("apikey") apiKey: String,
        @Query("hash") hash: String,
        @Query("limit") limit: Long = 100,
        @Query("offset") offset: Long = 0
    ): Call<MarvelResponse<Character>>

    @GET("/v1/public/characters/{characterId}/comics")
    fun getComics(
        @Path("characterId") characterId: Long,
        @Query("ts") timestamp: Long,
        @Query("apikey") apiKey: String,
        @Query("hash") hash: String,
        @Query("limit") limit: Long = 100,
        @Query("offset") offset: Long = 0
    ): Call<MarvelResponse<Comics>>

    @GET("/v1/public/characters/{characterId}/events")
    fun getEvents(
        @Path("characterId") characterId: Long,
        @Query("ts") timestamp: Long,
        @Query("apikey") apiKey: String,
        @Query("hash") hash: String,
        @Query("limit") limit: Long = 100,
        @Query("offset") offset: Long = 0
    ): Call<MarvelResponse<Event>>

    @GET("/v1/public/characters/{characterId}/series")
    fun getSeries(
        @Path("characterId") characterId: Long,
        @Query("ts") timestamp: Long,
        @Query("apikey") apiKey: String,
        @Query("hash") hash: String,
        @Query("limit") limit: Long = 100,
        @Query("offset") offset: Long = 0
    ): Call<MarvelResponse<Series>>

    @GET("/v1/public/characters/{characterId}/stories")
    fun getStories(
        @Path("characterId") characterId: Long,
        @Query("ts") timestamp: Long,
        @Query("apikey") apiKey: String,
        @Query("hash") hash: String,
        @Query("limit") limit: Long = 100,
        @Query("offset") offset: Long = 0
    ): Call<MarvelResponse<Story>>
}
