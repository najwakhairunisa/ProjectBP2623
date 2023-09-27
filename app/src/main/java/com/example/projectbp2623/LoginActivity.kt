package com.example.projectbp2623

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //intent explicit
        //instance
        val btnlogin:Button = findViewById(R.id.buttonlogin)
        val txtUsername:EditText = findViewById(R.id.editTextText3)
        val txtpassword: EditText = findViewById(R.id.editTextText4)

        //event btn Login click
        btnlogin.setOnClickListener {
            //volidate
            if(txtUsername.text.toString().equals("Najwa") &&
                    txtpassword.text.toString().equals("amikom")) {
                //cool home activity
                val intentHome = Intent(this, HomeActivity::class.java)
                startActivity(intentHome)
            }else{
                    Toast.makeText(this,"Username/Password salah!!!", Toast.LENGTH_SHORT).show()
                }
            }
        }



    }