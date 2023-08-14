package com.example.myquizapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.myquizapp.databinding.ActivityHomeBinding
import com.example.myquizapp.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view: LinearLayout = binding.root

        //setContentView divines which xml layout to use as my bfrontend
        setContentView(view)

//        setContentView(R.layout.activity_home)

        binding.btnStart.setOnClickListener {
            var username = binding.etUsername.text

            if (username != null) {
                if(username.isBlank()) {
                    Log.d("AAA Captured username: ", "Please fill in username")
                    //TODO: Display Validation Message to User
                } else {
                    //TODO: Navigate to QuestionActivity
                    Log.d( "AAA Captured username: ", username.toString())

                    val intent = Intent(this, CategoryActivity::class.java)

                    //pass extra data to the next activity
                    intent.putExtra("username", username.toString()) // passing username

                    startActivity(intent)
//                    finish()
                }
            }

        }


    }
}

