package com.example.iamrobot.models

//blueprint for how mu question should look
data class Question(
    val id: Int,
    val questionText: String,
    val icon: Int, // all images should be int
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String?, // question marks means this value kan be null
    val correctAnswer: String
)


// Side note: you can have more than one type of data class for your question