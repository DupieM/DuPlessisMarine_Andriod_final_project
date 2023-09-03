package com.example.myquizapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global.putInt
import android.util.Log
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

        binding.btnScore.setOnClickListener{

            //Store this reslut to our shared preferences - save the last user's result
            val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)

            //edit thsi preference
            val editor = sharedPref.edit()

            editor.apply{
                //adding all values we want to store
                putInt("last_score", 0)
                apply() //doing the edit
            }

            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)

        }

    }

}


