package com.example.myquizapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import com.example.myquizapp.databinding.ActivityResultBinding
import com.example.myquizapp.databinding.ActivitySettingsBinding
import com.google.android.material.snackbar.Snackbar

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

        val username = intent.extras?.getString("username")

        binding.tvResultname.text = "Well done " + username.toString()

        //update our UI
        binding.tvResultscore.text = userScore.toString() + "/" + totalQuestions.toString()

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

        binding.fabLastscore.setOnClickListener{
            val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)

            val lastUser = sharedPref.getString("last_user", "No user found")
            val lastScore = sharedPref.getInt("last_score", 0)

            Log.d("AAA LAST USER FROM", lastUser + lastScore.toString())

            val snack = Snackbar.make(it, lastUser!!, Snackbar.LENGTH_LONG)
            snack.setAction(lastScore.toString(), View.OnClickListener{
                //nothing
            })
            snack.show()
        }

        binding.btFinal.setOnClickListener {

            val intent = Intent(this, CategoryActivity::class.java)

            startActivity(intent)
//          finish()


        }



    }
}