package com.culqui.code.challengue.core.data.repository

import com.culqui.code.challengue.core.data.remote.SafeApiRequest
import org.koin.core.component.KoinComponent

open class BaseRepository : SafeApiRequest(), KoinComponent {
}