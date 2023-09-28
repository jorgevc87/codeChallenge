package com.culqui.code.challengue.core.data.remote.dto

import com.google.gson.annotations.SerializedName

data class ResponseDto<T>(
    @SerializedName("status") val status: Int,
    @SerializedName("data") val data: T,
    @SerializedName("message") val message: String
)