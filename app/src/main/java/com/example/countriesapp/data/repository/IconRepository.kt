package com.example.countriesapp.data.repository

import com.example.countriesapp.data.api.model.SearchResponse


interface IconRepository {

    suspend fun search(query: String):SearchResponse
}