package dev.exercise.keepfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import dev.exercise.keepfit.databinding.ActivityHomePageBinding
import dev.exercise.keepfit.databinding.ActivitySignUpBinding
import org.w3c.dom.Text

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSignUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            validateFields()
        }
        binding.tvLogin.setOnClickListener {
            val intent=Intent(this ,LoginActivity::class.java)
            startActivity(intent)
        }

    }

    open fun validateFields() {
        var Fname =binding.etFirstName.text.toString()
        var Lname =binding.etLastname.text.toString()
        var em = binding.etEmail.text.toString()
        var psw = binding.etPassword.text.toString()
        var cpswd =binding.etConfirmpassword.text.toString()

        if (Fname.isBlank()) {
            binding.etFirstName.error = "input required"

        }

        if (Lname.isBlank()) {
            binding.etLastname.error = "input required"
        }

        if (em.isBlank()) {
            binding.etEmail.error = "input required"
        }

        if (psw.isBlank()) {
            binding.etPassword.error = "input required"
        }

        if (cpswd.isBlank()) {
            binding.etConfirmpassword.error = "input required"
        }

        if (psw != cpswd) {
            binding.etPassword.error = " check password"
        }


    }

}