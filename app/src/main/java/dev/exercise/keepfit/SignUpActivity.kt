package dev.exercise.keepfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import org.w3c.dom.Text

class SignUpActivity : AppCompatActivity() {
    lateinit var btnSignUp: Button
    lateinit var tilFirstName: TextInputLayout
    lateinit var etFirstName: EditText
    lateinit var tilLastName: TextInputLayout
    lateinit var etLastname: EditText
    lateinit var tilEmail: TextInputLayout
    lateinit var etEmail: EditText
    lateinit var tilPassword: TextInputLayout
    lateinit var etPassword: EditText
    lateinit var tilConfirmpassword: TextInputLayout
    lateinit var etConfirmpassword: EditText
    lateinit var tvLogin: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this, SignUpActivity::class.java)
        setContentView(R.layout.activity_sign_up)
        btnSignUp = findViewById(R.id.btnSignUp)
        tilFirstName = findViewById(R.id.tilFirstName)
        etFirstName = findViewById(R.id.etFirstName)
        tilLastName = findViewById(R.id.tilLastName)
        etLastname = findViewById(R.id.etLastname)
        tilEmail = findViewById(R.id.tilEmail)
        etEmail = findViewById(R.id.etEmail)
        tilPassword = findViewById(R.id.tilPassword)
        etPassword = findViewById(R.id.etPassword)
        tilConfirmpassword = findViewById(R.id.tilConfirmpassword)
        etConfirmpassword = findViewById(R.id.etConfirmpassword)
        tvLogin = findViewById(R.id.tvLogin)



        btnSignUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            validateFields()
        }
        tvLogin.setOnClickListener {
            val intent=Intent(this ,LogInActivity::class.java)
            startActivity(intent)
        }

    }

    open fun validateFields() {
        var Fname = etFirstName.text.toString()
        var Lname = etLastname.text.toString()
        var em = etEmail.text.toString()
        var psw = etPassword.text.toString()
        var cpswd = etConfirmpassword.text.toString()

        if (Fname.isBlank()) {
            etFirstName.error = "input required"

        }

        if (Lname.isBlank()) {
            etLastname.error = "input required"
        }

        if (em.isBlank()) {
            etEmail.error = "input required"
        }

        if (psw.isBlank()) {
            etPassword.error = "input required"
        }

        if (cpswd.isBlank()) {
            etConfirmpassword.error = "input required"
        }

        if (psw != cpswd) {
            etPassword.error = " check password"
        }


    }

}