package com.example.countriesapp.data.api.service

import com.example.countriesapp.data.api.model.SearchResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface IconService {

    //https://api.iconfinder.com/v4/icons/search
    @GET("v4/icons/search")
    @Headers(
        "Authorization:Bearer X0vjEUN6KRlxbp2DoUkyHeM0VOmxY91rA6BbU5j3Xu6wDodwS0McmilLPBWDUcJ1"
    )
    suspend fun search(@Query("query") query: String):SearchResponse

}