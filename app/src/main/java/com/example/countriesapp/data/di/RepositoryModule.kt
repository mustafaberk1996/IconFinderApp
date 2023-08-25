package com.example.countriesapp.data.di

import com.example.countriesapp.data.repository.IconRepository
import com.example.countriesapp.data.repository.IconRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {


    @Provides
    @Singleton
    fun provideIconRepository(iconRepositoryImpl: IconRepositoryImpl):IconRepository = iconRepositoryImpl
}