package com.example.countriesapp.data.di

import com.example.countriesapp.Constants
import com.example.countriesapp.Constants.BASE_API_URL
import com.example.countriesapp.data.api.service.IconService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    //service
    @Provides
    fun provideIconService(retrofit: Retrofit):IconService = retrofit.create(IconService::class.java)

    //retrofit
    @Provides
    fun provideRetrofit():Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create()).baseUrl(BASE_API_URL).build()


}