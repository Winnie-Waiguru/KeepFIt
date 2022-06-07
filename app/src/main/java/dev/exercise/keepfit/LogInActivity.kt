package dev.exercise.keepfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import java.util.regex.Pattern

class LogInActivity : AppCompatActivity() {
    lateinit var btnLogin:Button
    lateinit var etEmail2:EditText
    lateinit var etPassword:EditText
    lateinit var  tilEmail:TextInputLayout
    lateinit var  tilPassword:TextInputLayout
    lateinit var tvSignup:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent=Intent(this, LogInActivity::class.java)
        setContentView(R.layout.activity_log_in2)
     btnLogin=findViewById(R.id.btnLogin)
     etEmail2=findViewById(R.id.etEmail)
     etPassword=findViewById(R.id.etPassword)
     tilEmail= findViewById(R.id.tilEmail)
     tilPassword=findViewById(R.id.tilPassword)
     tvSignup=findViewById(R.id.tvSignup)
        btnLogin.setOnClickListener {
            val intent = Intent(this, LogInActivity::class.java)
            startActivity(intent)
            validateLogin()


        }
        tvSignup.setOnClickListener {
            val intent=Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }

    }
    fun validateLogin(){
        val email= etEmail2.text.toString()
        val pswd= etPassword.text.toString()

        if (email.isBlank()){
            etEmail2.error="check password"

        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            etEmail2.error="Wmail is required"

        }

        if (pswd.isBlank()){
            etPassword.error="confirmed"
        }



    }
}