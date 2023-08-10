package com.example.myquizapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myquizapp.databinding.ActivityMainBinding
import com.example.myquizapp.ui.theme.MyQuizAppTheme

class MainActivity : ComponentActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: LinearLayout = binding.root

        //setContentView divines which xml layout to use as my bfrontend
        setContentView(view)

//        setContentView(R.layout.activity_main)

        binding.btnStart.setOnClickListener {
            var username = binding.etUsername.text

            if (username != null) {
                if(username.isBlank()) {
                    Log.d("AAA Captured username: ", "Please fill in username")
                    //TODO: Display Validation Message to User
                } else {
                    //TODO: Navigate to QuestionActivity
                    Log.d( "AAA Captured username: ", username.toString())

                    val intent = Intent(this, HomeActivity::class.java)

                    //pass extra data to the next activity
                    intent.putExtra("username", username.toString()) // passing username

                    startActivity(intent)
//                    finish()
                }
            }

        }

    }

}
