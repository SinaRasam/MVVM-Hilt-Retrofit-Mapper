package com.example.mytesttest.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class LoginDomain(
    var isSuccess : Boolean,
    var data : String?
):Parcelable
