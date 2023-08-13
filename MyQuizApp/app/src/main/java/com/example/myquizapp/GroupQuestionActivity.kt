package com.example.myquizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myquizapp.models.Group_Constants.getAllQuestions
import com.example.myquizapp.models.Song_Constants

class GroupQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_question)

        getAllQuestions()
    }
}