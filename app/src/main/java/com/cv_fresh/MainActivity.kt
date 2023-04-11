package com.cv_fresh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val newregbtn = findViewById<Button>(R.id.newregbtn)
        val username = findViewById<EditText>(R.id.Usernametxt)
        val login = findViewById<Button>(R.id.loginbtn)
        newregbtn.setOnClickListener()
        {

            Toast.makeText(this, "Hello User" , Toast.LENGTH_SHORT).show()


            val intent = Intent(this,Page2::class.java)
            startActivity(intent)


        }



    }
}