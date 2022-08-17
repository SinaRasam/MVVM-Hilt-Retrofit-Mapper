package com.example.mytesttest.repository

import com.example.mytesttest.model.LoginDomain
import com.example.mytesttest.network.Api
import com.example.mytesttest.network.model.LoginDtoMapper

class LoginRepository_Impl (
    private val apiService : Api,
    private val mapper : LoginDtoMapper
        ): LoginRepository {
    override suspend fun login(phoneNumber: String, version: String): LoginDomain {
        var result = apiService.loginApi(phoneNumber,version)
        return mapper.mapToDomainModel(result)
    }
}