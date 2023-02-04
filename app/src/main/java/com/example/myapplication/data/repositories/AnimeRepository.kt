package com.example.myapplication.data.repositories

import androidx.lifecycle.liveData
import com.example.myapplication.data.remote.api.AnimeApiService
import javax.inject.Inject

class AnimeRepository @Inject constructor(private val animeApiService: AnimeApiService) {

    fun getAnime() = liveData {
        emit(animeApiService.getAnime())
    }

    fun getDetailAnime(id : Int) = liveData {
        emit(animeApiService.getDetailAnime(id = id))
    }
}