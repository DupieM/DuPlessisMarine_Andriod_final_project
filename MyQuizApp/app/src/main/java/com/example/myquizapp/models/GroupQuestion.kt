package com.example.myquizapp.models

data class GroupQuestion(
    val id: Int,
    val questionText: String,
    val icon: Int, // all images should be int
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String?, // question marks means this value kan be null
    val correctAnswer: String
)
