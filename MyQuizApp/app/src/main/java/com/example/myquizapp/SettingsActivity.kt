package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.example.myquizapp.databinding.ActivityMainBinding
import com.example.myquizapp.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {

    lateinit var binding: ActivitySettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySettingsBinding.inflate(layoutInflater)
        val view: LinearLayout = binding.root

//        setContentView(R.layout.activity_settings)
        setContentView(view)

        binding.btHome.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
//          finish()


        }

    }
}