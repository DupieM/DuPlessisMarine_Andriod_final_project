package com.example.iamrobot.models

import com.example.iamrobot.R

object Constants {


    //array for all our question
    var allQuestions = ArrayList<Question>()

    //function to populate our questions
    fun getAllQuestions() {

        val que1 = Question(
            id = 1,
            questionText = "Are you a robot?",
            R.drawable.robot,
            optionOne = "Yes",
            optionTwo = "No",
            optionThree = "Maybe",
            correctAnswer = "No"
        )

        val que2 = Question(
            questionText = "Are yo Sure",
            id = 2,
            optionOne = "Yes",
            optionTwo = "No",
            correctAnswer = "Yes",
            icon = R.drawable.robot,
            optionThree = null
        )

        allQuestions.add(que1)
        allQuestions.add(que2)

//        val que3 = Question(
//            id = 3,
//            questionText = "Identify the streetlight",
//            R.drawable.robot,
//            optionOne = "",
//            optionTwo = "",
//            correctAnswer = ""
//        )
    }
}