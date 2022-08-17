package com.example.mytesttest.network.model

import com.example.mytesttest.model.LoginDomain
import com.example.mytesttest.utils.DomainMapper

class LoginDtoMapper
constructor() : DomainMapper<LoginDto, LoginDomain> {
    override fun mapToDomainModel(model: LoginDto): LoginDomain {
        return LoginDomain(
            isSuccess = model.isSuccess,
            data = model.data
        )
    }

    override fun mapFromDomainModel(domainModel: LoginDomain): LoginDto {
        return LoginDto(
            isSuccess = domainModel.isSuccess,
            data = domainModel.data
        )
    }

    fun mapToDomainList(initial:List<LoginDto>):List<LoginDomain>{
        return initial.map { mapToDomainModel(it) }
    }
}