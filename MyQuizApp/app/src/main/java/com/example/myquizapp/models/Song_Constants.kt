package com.example.myquizapp.models

object Song_Constants {

    //array for all our question
    var allQuestions = ArrayList<SongQuestion>()

    //function to populate our questions
    fun getAllQuestions() {

        val que1 = SongQuestion(
            id = 1,
            questionText = "‘What is Love?’, ‘Cheer Up’ and ‘The Feels’ are hit songs of which K-Pop girl group.",
            optionOne = "(G)-Idle",
            optionTwo = "Twice",
            optionThree = "Blackpink",
            optionFour = "IVE",
            correctAnswer = "Twice"
        )

        val que2 = SongQuestion(
            id = 2,
            questionText = "In which song did BTS sing: “Haters gon’ hate, Players gon’ play, Live a life, man, Good luck”.",
            optionOne = "Take Two",
            optionTwo = "I Need U",
            optionThree = "Mic Drop",
            optionFour = "Not Today",
            correctAnswer = "Mic Drop"
        )

        val que3 = SongQuestion(
            id = 3,
            questionText = "Which K-Pop girl group starts their newest song ‘Cake’ with: “Itzy Itzy like that! Cake x4 It’s a piece of Cakex4”.",
            optionOne = "Itzy",
            optionTwo = "Le Sserafim",
            optionThree = "New Jeans",
            optionFour = "Twice",
            correctAnswer = "Itzy"
        )

        val que4 = SongQuestion(
            id = 4,
            questionText = "“Swerving, I’m speeding on Serpent Road .... Best of the best on first class” is the chorus of which song by Stray Kids.",
            optionOne = "Back Door",
            optionTwo = "S-Class",
            optionThree = "Gods menu",
            optionFour = "Domino",
            correctAnswer = "S-Class"
        )

        val que5 = SongQuestion(
            id = 5,
            questionText = "What catch phrase does Blackpink use in their songs like ‘Kill This Love’, ‘Pretty Savage’, ‘How you like that’, ‘Boombayah’ and ‘Shut Down’.",
            optionOne = "Blackpink in your area ",
            optionTwo = "NCT in the House",
            optionThree = "TWICE",
            optionFour = "SHINee back!",
            correctAnswer = "Blackpink in your area "
        )

        val que6 = SongQuestion(
            id = 6,
            questionText = "The chorus “I feel it, my head’s in a Daze x2” is from the famous song ‘Drunk-Dazed’ by which K-Pop boy group ….",
            optionOne = "Enhyphen",
            optionTwo = "TXT",
            optionThree = "BigBang",
            optionFour = "NCT 127",
            correctAnswer = "Enhyphen"
        )

        allQuestions.add(que1)
        allQuestions.add(que2)
        allQuestions.add(que3)
        allQuestions.add(que4)
        allQuestions.add(que5)
        allQuestions.add(que6)

    }

}