package com.culqui.code.challengue.core.data.remote.dto

import com.google.gson.annotations.SerializedName

data class LoginRequest(
    @SerializedName("email") val login: String,
    @SerializedName("password") val password: String
)