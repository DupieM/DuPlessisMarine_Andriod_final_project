package com.example.myquizapp.models

import com.example.myquizapp.R

object Group_Constants {

    //array for all our question
    var allQuestions = ArrayList<Group_Question>()

    //function to populate our questions
    fun getAllQuestions() {

        val que1 = Group_Question(
            id = 1,
            questionText = "With which entertainment company is the K-Pop group, as shown below, associated.",
            icon = R.drawable.bts,
            optionOne = "Hybe",
            optionTwo = "JYP",
            optionThree = "YG",
            correctAnswer = "Hybe"
        )

        val que2 = Group_Question(
            id = 2,
            questionText = "With which entertainment company is the K-Pop group, as shown below, associated.",
            icon = R.drawable.blackpink,
            optionOne = "Starship",
            optionTwo = "Cube",
            optionThree = "YG",
            correctAnswer = "YG"
        )

        val que3 = Group_Question(
            id = 3,
            questionText = "With which entertainment company is the K-Pop group, as shown below, associated.",
            icon = R.drawable.straykids,
            optionOne = "BIG HIT",
            optionTwo = "JYP",
            optionThree = "YG",
            correctAnswer = "JYP"
        )

        val que4 = Group_Question(
            id = 4,
            questionText = "With which entertainment company is the K-Pop group, as shown below, associated.",
            icon = R.drawable.gidle,
            optionOne = "Cube",
            optionTwo = "Stone Music",
            optionThree = "YG",
            correctAnswer = "Cube"
        )

        val que5 = Group_Question(
            id = 5,
            questionText = "With which entertainment company is the K-Pop group, as shown below, associated.",
            icon = R.drawable.redvelvet,
            optionOne = "SM",
            optionTwo = "Black Label",
            optionThree = "Cube",
            correctAnswer = "SM"
        )

        val que6 = Group_Question(
            id = 6,
            questionText = "With which entertainment company is the K-Pop group, as shown below, associated.",
            icon = R.drawable.monstax,
            optionOne = "SM",
            optionTwo = "P Nation",
            optionThree = "Starship",
            correctAnswer = "Starship"
        )

        allQuestions.add(que1)
        allQuestions.add(que2)
        allQuestions.add(que3)
        allQuestions.add(que4)
        allQuestions.add(que5)
        allQuestions.add(que6)

    }
}