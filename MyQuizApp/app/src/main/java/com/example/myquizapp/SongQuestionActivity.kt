package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.Toast
import com.example.myquizapp.databinding.ActivitySongQuestionBinding
import com.example.myquizapp.models.General_Constants
import com.example.myquizapp.models.SongQuestion
import com.example.myquizapp.models.Song_Constants.allQuestions
import com.example.myquizapp.models.Song_Constants.clearAllQuestions
import com.example.myquizapp.models.Song_Constants.getAllQuestions


class SongQuestionActivity : AppCompatActivity() {

    lateinit var binding: ActivitySongQuestionBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySongQuestionBinding.inflate(layoutInflater)
        val view: LinearLayout = binding.root

        //setContentView divines which xml layout to use as my bfrontend
        setContentView(view)

//        setContentView(R.layout.activity_song_question)

        val username = intent.getStringExtra("username")

        val questionNumber = intent.getIntExtra("questionNumber", 1)

//        val questionNumber = intent.extras?.getInt("questionNumber", 1)

        if (username != null) {
            Log.d("AAA username: ", username)
        }

        binding.tvName3.text = username.toString()

        var userScore = intent.getIntExtra("userscore", 0); // if first question set it to zero

        if (questionNumber == 1){
            clearAllQuestions()
            getAllQuestions()
        }

//        getAllQuestions()

        val listOfQuestions :ArrayList<SongQuestion> = allQuestions

//        var questionNumber: Int = 4
        val currentQuestion = listOfQuestions[questionNumber!!-1]

        Log.d("AAA USER SCORE:", userScore.toString())
        Log.d("AAA total Questions:", listOfQuestions.count().toString())
        Log.d("AAA First Question: ", currentQuestion.questionText)

        binding.tvHello.text = currentQuestion.questionText
        binding.rbOptionOne.text = currentQuestion.optionOne
        binding.rbOptionTwo.text = currentQuestion.optionTwo
        binding.rbOptionThree.text = currentQuestion.optionThree
        binding.rbOptionFour.text = currentQuestion.optionFour
        binding.pbProgress.progress = currentQuestion.id
        binding.txNumber.text = "${currentQuestion.id}/${listOfQuestions.count()}"

        binding.btnNext.setOnClickListener {
            var selectedAnswer: Int = binding.rgOptions.checkedRadioButtonId

//            Log.d("AAA Answer Slected ID: ", selectedAnswer.toString())

            // check if the user has selected an answer
            if(selectedAnswer != 1) {
                // check if the user selected the correct one?
                var selectedAnswerValue = findViewById<RadioButton>(selectedAnswer)

                if(selectedAnswerValue.text == currentQuestion.correctAnswer) {
                    // update score
                    userScore = userScore!! + 1
                }

                //option 2: navigating to the same question and updating the values

                if(questionNumber == listOfQuestions.count()) {
                    if (userScore == 6){

                        Log.d("AAA RESULT:", userScore.toString())
                        val intent =Intent(this, ResultActivity::class.java)
                        intent.putExtra("userscore", userScore)
                        intent.putExtra("totalQuestions", listOfQuestions.count())

                        intent.putExtra("username", username.toString()) // passing username

                        startActivity(intent)
                        finish()

                    } else if (userScore == 4) {

                        Log.d("AAA RESULT:", userScore.toString())
                        val intent =Intent(this, Result2Activity::class.java)
                        intent.putExtra("userscore", userScore)
                        intent.putExtra("totalQuestions", listOfQuestions.count())

                        intent.putExtra("username", username.toString()) // passing username

                        startActivity(intent)
                        finish()

                    } else if (userScore == 5){
                        Log.d("AAA RESULT:", userScore.toString())
                        val intent =Intent(this, Result2Activity::class.java)
                        intent.putExtra("userscore", userScore)
                        intent.putExtra("totalQuestions", listOfQuestions.count())

                        intent.putExtra("username", username.toString()) // passing username

                        startActivity(intent)
                        finish()
                    } else {

                        Log.d("AAA RESULT:", userScore.toString())
                        val intent =Intent(this, Result3Activity::class.java)
                        intent.putExtra("userscore", userScore)
                        intent.putExtra("totalQuestions", listOfQuestions.count())

                        intent.putExtra("username", username.toString()) // passing username

                        startActivity(intent)
                        finish()
                    }

                }else {
                    //navigate to the next question
                    //option 2: navigating to the same question and updating the values
                    val intent = Intent(this, SongQuestionActivity::class.java)
                    if (questionNumber != null){
                        intent.putExtra("questionNumber", questionNumber+1)
                    }
                    //Pass score
                    intent.putExtra("userscore", userScore)

                    intent.putExtra("username", username.toString()) // passing username

                    startActivity(intent)
                    finish()
                }
//                Log.d("AAA Answer Selected : ", selectedAnswerValue.text.toString())
            }else {
                Toast.makeText(this, "Please select your answer", Toast.LENGTH_LONG).show()
            }
        }



        binding.btBack.setOnClickListener {

            val intent = Intent(this, CategoryActivity::class.java)

            startActivity(intent)
//          finish()


        }

    }
}