package com.example.countriesapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.countriesapp.data.api.model.SearchResponse
import com.example.countriesapp.data.repository.IconRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val iconRepository: IconRepository
) : ViewModel() {

    private val _searchResponse:MutableStateFlow<SearchResponse?> = MutableStateFlow(null)
    val searchResponse:StateFlow<SearchResponse?> = _searchResponse


    fun search(query: String) {
        viewModelScope.launch {
            _searchResponse.value = iconRepository.search(query)
        }
    }

}