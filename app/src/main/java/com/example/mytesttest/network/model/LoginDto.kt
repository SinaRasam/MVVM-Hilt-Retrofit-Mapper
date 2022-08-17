package com.example.mytesttest.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class LoginDto(
    @SerializedName("isSuccess")
    @Expose
    var isSuccess: Boolean,

    @SerializedName("data")
    @Expose
    var data: String? = null
)
