package com.example.myapplication.data.models.detail

import com.example.myapplication.data.models.get.Anime
import com.google.gson.annotations.SerializedName

data class AnimeDetail(
    @SerializedName("data")
    val data: Anime
)