package com.culqui.code.challengue.core.data.remote

import com.culqui.code.challengue.core.data.remote.dto.LoginDto
import com.culqui.code.challengue.core.data.remote.dto.LoginRequest
import com.culqui.code.challengue.core.data.remote.dto.ResponseDto
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET

interface ApiService {

    @GET("api/login")
    suspend fun login(@Body loginRequest: LoginRequest): Response<ResponseDto<LoginDto>>

}