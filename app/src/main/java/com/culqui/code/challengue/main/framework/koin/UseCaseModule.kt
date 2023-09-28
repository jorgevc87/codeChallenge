package com.culqui.code.challengue.main.framework.koin

import com.culqui.code.challengue.core.data.remote.ApiService
import com.culqui.code.challengue.core.data.repository.UserDataRepository
import com.culqui.code.challengue.core.data.repository.UserRemoteDataRepository
import com.culqui.code.challengue.core.interactor.LoginUser
import org.koin.dsl.module

//Inyeccion de dependencias para los interactors
val UseCaseModule = module {
    single { UserRemoteDataRepository(get<ApiService>()) }
    single { LoginUser(get<UserDataRepository>()) }
}