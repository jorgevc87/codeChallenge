package com.culqui.code.challengue.core.data.repository

import com.culqui.code.challengue.core.data.remote.ApiResponse
import com.culqui.code.challengue.core.data.remote.ApiService
import com.culqui.code.challengue.core.data.remote.dto.LoginDto
import com.culqui.code.challengue.core.data.remote.dto.LoginRequest
import com.culqui.code.challengue.core.data.remote.dto.ResponseDto
import org.koin.core.component.inject

class UserRemoteDataRepository(val apiService: ApiService) : BaseRepository(), UserDataRepository {

    override suspend fun login(loginRequest: LoginRequest): ApiResponse<ResponseDto<LoginDto>> {
        return apiRequest {
            apiService.login(loginRequest)
        }
    }
}