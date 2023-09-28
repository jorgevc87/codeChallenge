package com.culqui.code.challengue.main.presentation.view


import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.culqui.code.challengue.databinding.ActivityLoginBinding
import com.culqui.code.challengue.main.presentation.viewmodel.AuthViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private val authViewModel: AuthViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)

        configObservers()

        initViews()

        setContentView(binding.root)
    }

    private fun initViews() {
        binding.btnLogin.setOnClickListener {
            authViewModel.login(
                binding.edtEmail.text.toString().trim(),
                binding.edtPassword.text.toString().trim()
            )
        }
    }

    private fun configObservers() {
        authViewModel.loginResult.observe(this) {
            if (it == null) {
                Toast.makeText(LoginActivity@ this, "Ocurrió un error", Toast.LENGTH_LONG).show()
            } else {
                //Traer Listado de usuarios
            }
        }
    }
}