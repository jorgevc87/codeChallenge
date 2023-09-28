package com.culqui.code.challengue.main.framework.koin

import com.culqui.code.challengue.main.presentation.viewmodel.AuthViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

//Inyeccion de dependencias para los viewmodels
val ViewModelModule = module {
    viewModel { AuthViewModel(get()) }
}