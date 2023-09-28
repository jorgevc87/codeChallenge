package com.culqui.code.challengue.core.data.remote

import androidx.annotation.IntDef

class ApiStatus {

    @IntDef(LOADING, SUCCESS, ERROR)
    @Retention(AnnotationRetention.SOURCE)
    annotation class ApiStatus

    companion object {
        const val LOADING = 800
        const val SUCCESS = 801
        const val ERROR = 802
    }
}