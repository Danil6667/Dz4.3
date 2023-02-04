package com.example.myapplication.data.models.get

import com.google.gson.annotations.SerializedName

data class Response<T>(

    @SerializedName("data")
    val data: List<T>?
)