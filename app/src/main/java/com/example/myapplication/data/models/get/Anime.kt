package com.example.myapplication.data.models.get

import com.google.gson.annotations.SerializedName

data class Anime(
    @SerializedName("attributes")
    val attributes: Attributes,
    @SerializedName("id")
    val id: String = "",
    @SerializedName("type")
    val type: String = ""
)