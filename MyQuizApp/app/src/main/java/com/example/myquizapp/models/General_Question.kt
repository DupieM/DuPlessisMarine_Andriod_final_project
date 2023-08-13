package com.example.myquizapp.models

data class General_Question(
    val id: Int,
    val questionText: String,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String?, // question marks means this value kan be null
    val correctAnswer: String
)
