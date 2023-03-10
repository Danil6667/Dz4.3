package com.example.myapplication.ui.fragments.detail

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.repositories.AnimeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailAnimeViewModel  @Inject constructor(private val repository: AnimeRepository) : ViewModel() {

    fun getDetailAnime(id: Int) = repository.getDetailAnime(id = id)
}