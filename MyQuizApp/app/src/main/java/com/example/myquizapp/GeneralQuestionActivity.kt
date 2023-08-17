package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.Toast
import com.example.myquizapp.databinding.ActivityGeneralQuestionBinding
import com.example.myquizapp.models.GeneralQuestion
import com.example.myquizapp.models.General_Constants.allQuestions
import com.example.myquizapp.models.General_Constants.getAllQuestions

class GeneralQuestionActivity : AppCompatActivity() {

    lateinit var binding: ActivityGeneralQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGeneralQuestionBinding.inflate(layoutInflater)
        val view: LinearLayout = binding.root

        //setContentView divines which xml layout to use as my bfrontend
        setContentView(view)

//        setContentView(R.layout.activity_general_question)

        val questionNumber = intent.getIntExtra("questionNumber", 1)

        var userScore = 0

        if (questionNumber == 1){
            getAllQuestions()
        }

//        getAllQuestions()

        val listOfQuestions :ArrayList<GeneralQuestion> = allQuestions

        val currentQuestion = listOfQuestions[questionNumber!!-1]

        Log.d("AAA First Question: ", currentQuestion.questionText)

        binding.tvHello.text = currentQuestion.questionText
        binding.rbOptionOne.text = currentQuestion.optionOne
        binding.rbOptionTwo.text = currentQuestion.optionTwo
        binding.rbOptionThree.text = currentQuestion.optionThree
        binding.rbOptionFour.text = currentQuestion.optionFour
        binding.pbProgress.progress = currentQuestion.id
        binding.txNumber.text = "${currentQuestion.id}/${listOfQuestions.count()}"
//
//
        binding.btnNext2.setOnClickListener {
            var selectedAnswer: Int = binding.rgOptions.checkedRadioButtonId

//            Log.d("AAA Answer Slected ID: ", selectedAnswer.toString())

            // check if the user has selected an answer
            if(selectedAnswer != 1) {
                // check if the user selected the correct one?
                var selectedAnswerValue = findViewById<RadioButton>(selectedAnswer)

                if(selectedAnswerValue.text == currentQuestion.correctAnswer) {
                    // update score
                    userScore++
                }

                //TODO: navigate to the next question
                //option 2: navigating to the same question and updating the values
                val intent = Intent(this, SongQuestionActivity::class.java)

                if (questionNumber != null){
                    intent.putExtra("questionNumber", questionNumber+1)
                }

                startActivity(intent)

//                Log.d("AAA Answer Selected : ", selectedAnswerValue.text.toString())
            }else {
                Toast.makeText(this, "Please select your answer", Toast.LENGTH_LONG).show()
            }
        }

        binding.btBack2.setOnClickListener {

            val intent = Intent(this, CategoryActivity::class.java)

            startActivity(intent)
//          finish()


        }






    }
}