package com.example.myquizapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import com.example.myquizapp.databinding.ActivityResult2Binding
import com.example.myquizapp.databinding.ActivityResultBinding
import com.google.android.material.snackbar.Snackbar

class Result2Activity : AppCompatActivity() {

    lateinit var binding: ActivityResult2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResult2Binding.inflate(layoutInflater)
        val view: LinearLayout = binding.root

//        setContentView(R.layout.activity_result2)
        setContentView(view)

        val totalQuestions = intent.extras?.getInt("totalQuestions", 0)


        var userScore = intent.extras?.getInt("userscore", 0); // if first question set it to zero

        val username = intent.extras?.getString("username")

        binding.tvResultname2.text = "Well done " + username.toString()

        //update our UI
        binding.tvResultscore2.text = userScore.toString() + "/" + totalQuestions.toString()

        //Store this reslut to our shared preferences - save the last user's result
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)

        //edit thsi preference
        val editor = sharedPref.edit()

        editor.apply{
            //adding all values we want to store
            putString("last_user", username)
            putInt("last_score", userScore!!)
            apply() //doing the edit
        }

        binding.btFinal2.setOnClickListener {

            val intent = Intent(this, CategoryActivity::class.java)

            intent.putExtra("username", username.toString()) // passing username

            startActivity(intent)
//          finish()


        }









    }
}