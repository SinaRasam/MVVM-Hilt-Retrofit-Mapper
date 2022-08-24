package com.example.mytesttest.di

import com.example.mytesttest.network.Api
import com.example.mytesttest.network.model.LoginDtoMapper
import com.example.mytesttest.repository.LoginRepository
import com.example.mytesttest.repository.LoginRepository_Impl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideLoginRepository(
        apiService: Api,
        loginDtoMapper: LoginDtoMapper
    ): LoginRepository {
        return LoginRepository_Impl(apiService, loginDtoMapper)
    }
}