package com.shykun.volodymyr.movieviewer.domain

import com.shykun.volodymyr.movieviewer.data.entity.MoviesType
import com.shykun.volodymyr.movieviewer.data.network.ApiClient
import javax.inject.Inject

class MoviesUseCase @Inject constructor(private val apiClient: ApiClient) {

    fun getMovies(moviesType: MoviesType, page: Int) = apiClient.getMovies(moviesType, page).map { it.results }

    fun searchMovies(query: String, page: Int = 1) = apiClient.searchMovies(query, page).map { it.results }
}
