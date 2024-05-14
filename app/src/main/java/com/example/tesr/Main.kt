package com.example.tesr

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameEditText = findViewById<EditText>(R.id.usernameEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val forgotPasswordText = findViewById<TextView>(R.id.forgotPasswordText)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()
            if (validateLogin(username, password)) {
                Toast.makeText(this, "Login successful", Toast.LENGTH_LONG).show()
                // Proceed to the next screen or activity
            } else {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_LONG).show()
            }
        }

        forgotPasswordText.setOnClickListener {
            // Handle forgotten password recovery
            Toast.makeText(this, "Password reset link sent to your email", Toast.LENGTH_LONG).show()
        }
    }

    private fun validateLogin(username: String, password: String): Boolean {
        // Implement validation logic here
        return username.isNotEmpty() && password.isNotEmpty()
    }
}
