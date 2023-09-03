package com.example.myquizapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.myquizapp.databinding.ActivityCategoryBinding
import com.example.myquizapp.databinding.ActivityHomeBinding
import com.example.myquizapp.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class CategoryActivity : AppCompatActivity() {

    lateinit var binding: ActivityCategoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCategoryBinding.inflate(layoutInflater)
        val view: LinearLayout = binding.root

        //setContentView divines which xml layout to use as my bfrontend
        setContentView(view)

//        setContentView(R.layout.activity_category)

        //Get passed data from previous activity
        val username = intent.getStringExtra("username")

        Log.d("AAA Welcome", username.toString())

        binding.tvHello.text = "Hi $username"

        binding.btSong.setOnClickListener {
            val intent = Intent(this, SongQuestionActivity::class.java)

            intent.putExtra("username", username.toString()) // passing username

            startActivity(intent)
            finish()
        }

        binding.btGroup.setOnClickListener {
            val intent = Intent(this, GroupQuestionActivity::class.java)


            intent.putExtra("username", username.toString()) // passing username

            startActivity(intent)
            finish()
        }


        binding.btGeneral.setOnClickListener {
            val intent = Intent(this, GeneralQuestionActivity::class.java)

            intent.putExtra("username", username.toString()) // passing username

            startActivity(intent)
            finish()
        }

        binding.fabLastscore.setOnClickListener{
            val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)

            val lastUser = sharedPref.getString("last_user", "No user found")
            val lastScore = sharedPref.getInt("last_score", 0)

            Log.d("AAA LAST USER FROM", lastUser + lastScore.toString())

            val snack = Snackbar.make(it, "Your previous score was", Snackbar.LENGTH_LONG)
            snack.setAction(lastScore.toString(), View.OnClickListener{
                //nothing
            })
            snack.show()
        }

        binding.btBack3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
            finish()
        }

    }
}