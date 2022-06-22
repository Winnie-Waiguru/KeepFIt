package dev.exercise.keepfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import dev.exercise.keepfit.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, HomePageActivity::class.java)
            startActivity(intent)
            validateLogin()


        }
        binding.tvSignup.setOnClickListener {
            val intent=Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }

    }
    fun validateLogin(){
        val email= binding.etEmail.text.toString()
        val pswd= binding.etPassword.text.toString()

        if (email.isBlank()){
            binding.tilEmail.error="check password"

        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.tilEmail.error="Email is required"

        }

        if (pswd.isBlank()){
            binding.etPassword.error="confirmed"
        }



    }
}