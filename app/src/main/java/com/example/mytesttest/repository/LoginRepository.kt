package com.example.mytesttest.repository

import com.example.mytesttest.model.LoginDomain

interface LoginRepository {
    suspend fun login(phoneNumber: String, version: String):LoginDomain
}