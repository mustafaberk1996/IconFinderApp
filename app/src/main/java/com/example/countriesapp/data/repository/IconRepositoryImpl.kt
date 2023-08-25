package com.example.countriesapp.data.repository

import com.example.countriesapp.data.api.model.SearchResponse
import com.example.countriesapp.data.api.service.IconService
import javax.inject.Inject

class IconRepositoryImpl @Inject constructor(
    private val iconService: IconService
):IconRepository {

    override suspend fun search(query: String): SearchResponse {
       //service
        return iconService.search(query)
    }
}