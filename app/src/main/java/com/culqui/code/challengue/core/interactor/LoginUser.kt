package com.culqui.code.challengue.core.interactor

import android.util.Log
import com.culqui.code.challengue.core.data.remote.ApiStatus
import com.culqui.code.challengue.core.data.remote.dto.LoginRequest
import com.culqui.code.challengue.core.data.repository.UserDataRepository
import com.culqui.code.challengue.core.domain.User

class LoginUser(private val userRemoteRepository: UserDataRepository) {

    suspend fun login(request: LoginRequest): User? {

        val result = userRemoteRepository.login(request)

        return if (result.status == ApiStatus.SUCCESS) {
            result.data?.let {
                Log.i(TAG, "Login exitoso")

                User(1, "NomTest")
            }
        } else {
            Log.i(TAG, "Login fallido")

            null
        }
    }

    companion object {
        private val TAG = LoginUser::class.simpleName
    }

}