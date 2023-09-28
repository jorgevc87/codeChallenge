package com.culqui.code.challengue.main.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.culqui.code.challengue.core.data.remote.dto.LoginRequest
import com.culqui.code.challengue.core.domain.User
import com.culqui.code.challengue.core.interactor.LoginUser
import kotlinx.coroutines.launch
import java.lang.Exception

class AuthViewModel(private val loginUseCase: LoginUser) : BaseViewModel() {

    var loginResult = MutableLiveData<User?>()

    fun login(email: String, password: String) {
        viewModelScope.launch {
            loadingStatus.postValue(true)
            try {

                val request = LoginRequest(email, password)

                val result = loginUseCase.login(request)

                result?.run {
                    loginResult.postValue(this)
                }

            } catch (ex: Exception) {
                errorResult.postValue(Error(ex.message))
            } finally {
                loadingStatus.postValue(false)
            }
        }
    }

}