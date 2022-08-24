package com.example.mytesttest.presentation.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mytesttest.model.LoginDomain
import com.example.mytesttest.network.model.LoginDtoMapper
import com.example.mytesttest.repository.LoginRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class LoginViewModel
@Inject
constructor(
    private val repository: LoginRepository,
    private @Named("Version") val version:String
):ViewModel() {

/*    private val _login:MutableLiveData<LoginDomain> = MutableLiveData()
    val login : LiveData<LoginDomain>
        get() = _login*/

    val login:MutableLiveData<LoginDomain> = MutableLiveData()
}