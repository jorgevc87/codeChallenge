package com.culqui.code.challengue.core.data.remote.dto

import com.google.gson.annotations.SerializedName
import java.io.Serial

data class LoginDto(
    @SerializedName("token") val token: String
)