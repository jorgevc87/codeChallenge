package com.culqui.code.challengue.core.data.repository

import com.culqui.code.challengue.core.data.remote.ApiResponse
import com.culqui.code.challengue.core.data.remote.dto.LoginDto
import com.culqui.code.challengue.core.data.remote.dto.LoginRequest
import com.culqui.code.challengue.core.data.remote.dto.ResponseDto

interface UserDataRepository {

    suspend fun login(loginRequest: LoginRequest): ApiResponse<ResponseDto<LoginDto>>

}