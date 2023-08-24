package com.example.myquizapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.example.myquizapp.databinding.ActivityResultBinding
import com.example.myquizapp.databinding.ActivitySettingsBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)
        val view: LinearLayout = binding.root

//        setContentView(R.layout.activity_result)
        setContentView(view)

        val totalQuestions = intent.extras?.getInt("totalQuestions", 0)


        var userScore = intent.extras?.getInt("userscore", 0); // if first question set it to zero

        //update our UI
        binding.tvResultscore.text = userScore.toString() + "/" + totalQuestions.toString()

        //Store this reslut to our shared preferences - save the last user's result
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)

        //edit thsi preference
        val editor = sharedPref.edit()

        editor.apply{
            //adding all values we want to store
            putInt("last_score", userScore!!)
            apply() //doing the edit
        }

        binding.btFinal.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
//          finish()


        }


    }
}