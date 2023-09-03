package com.example.myquizapp.models

object General_Constants {

    //array for all our question
    var allQuestions = ArrayList<GeneralQuestion>()

    //function to clear all questions
    fun clearAllQuestions() {
        allQuestions.clear()
    }

    //function to populate our questions
    fun getAllQuestions() {

        val que1 = GeneralQuestion(
            id = 1,
            questionText = "Which K-Pop group named their fanbase as “ARMY”?",
            optionOne = "Twice",
            optionTwo = "BTS",
            optionThree = "Itzy",
            optionFour = "Stray Kids",
            correctAnswer = "BTS"
        )

        val que2 = GeneralQuestion(
            id = 2,
            questionText = "Which K-Pop girl group performed in North Korea.",
            optionOne = "Red Velvet",
            optionTwo = "Blackpink",
            optionThree = "Gfriend",
            optionFour = "(G)-Idle",
            correctAnswer = "Red Velvet"
        )

        val que3 = GeneralQuestion(
            id = 3,
            questionText = "How many members dose the K-Pop girl group Twice have.",
            optionOne = "3",
            optionTwo = "7",
            optionThree = "9",
            optionFour = "5",
            correctAnswer = "9"
        )

        val que4 = GeneralQuestion(
            id = 4,
            questionText = "Who were or is still the big 3 companies of K-Pop?",
            optionOne = "Hybe, JYP & YG",
            optionTwo = "SM, JYP & YG",
            optionThree = "YG, Cube & JYP",
            optionFour = "P nation, Hybe & Starship",
            correctAnswer = "SM, JYP & YG"
        )

        val que5 = GeneralQuestion(
            id = 5,
            questionText = "Jungkook from BTS had a collaboration with which American Artist to produce the song ‘Left and Right’.",
            optionOne = "Charlie Puth",
            optionTwo = "J. Cole",
            optionThree = "Miley Cyrus",
            optionFour = "Bruno Mars",
            correctAnswer = "Charlie Puth"
        )

        val que6 = GeneralQuestion(
            id = 6,
            questionText = "Which K-Pop artists collaboration happened in 2020 to produce the song ‘Eight’.",
            optionOne = "Taeyang & Lisa (BP)",
            optionTwo = "Taeyang & Jimin (BTS)",
            optionThree = "PSY & CL",
            optionFour = "UI & Suga (BTS)",
            correctAnswer = "UI & Suga (BTS)"
        )

        allQuestions.add(que1)
        allQuestions.add(que2)
        allQuestions.add(que3)
        allQuestions.add(que4)
        allQuestions.add(que5)
        allQuestions.add(que6)

    }
}