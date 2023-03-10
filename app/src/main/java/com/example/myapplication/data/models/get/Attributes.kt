package com.example.myapplication.data.models.get

import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("description")
    val description: String = "",
    @SerializedName("posterImage")
    val posterImage: PosterImage,
    @SerializedName("titles")
    val titles: Titles,
    @SerializedName("status")
    val status: String = ""
)