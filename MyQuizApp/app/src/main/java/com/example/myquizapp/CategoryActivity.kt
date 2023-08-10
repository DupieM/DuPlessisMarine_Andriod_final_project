package com.example.myquizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.myquizapp.databinding.ActivityCategoryBinding
import com.example.myquizapp.databinding.ActivityMainBinding

class CategoryActivity : AppCompatActivity() {

    lateinit var binding: ActivityCategoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_category)

        //Get passed data from previous activity
        val username = intent.extras?.getString("username")

        Log.d("AAA Welcome", username.toString())

        binding.tvHello.text = "Hi, $username"
    }
}