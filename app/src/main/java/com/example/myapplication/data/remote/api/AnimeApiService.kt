package com.example.myapplication.data.remote.api

import com.example.myapplication.data.models.detail.AnimeDetail
import com.example.myapplication.data.models.get.Anime
import com.example.myapplication.data.models.get.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface AnimeApiService {

    @GET("anime")
    suspend fun getAnime(): Response<Anime>

    @GET("anime/{id}")
    suspend fun getDetailAnime(
        @Path("id") id: Int
    ): AnimeDetail
}