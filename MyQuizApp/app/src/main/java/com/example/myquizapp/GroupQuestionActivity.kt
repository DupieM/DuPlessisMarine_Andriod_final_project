package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.Toast
import com.example.myquizapp.databinding.ActivityGroupQuestionBinding
import com.example.myquizapp.models.GroupQuestion
import com.example.myquizapp.models.Group_Constants
import com.example.myquizapp.models.Group_Constants.allQuestions
import com.example.myquizapp.models.Group_Constants.getAllQuestions



class GroupQuestionActivity : AppCompatActivity() {

    lateinit var binding: ActivityGroupQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_group_question)

        binding = ActivityGroupQuestionBinding.inflate(layoutInflater)
        val view: LinearLayout = binding.root

        //setContentView divines which xml layout to use as my bfrontend
        setContentView(view)

        val username = intent.getStringExtra("username")

        val questionNumber = intent.getIntExtra("questionNumber", 1)

        var userScore = intent.getIntExtra("userscore", 0); // if first question set it to zero

        if (questionNumber == 1){
            getAllQuestions()
        }

        binding.tvName4.text = username.toString()

        val listOfQuestions :ArrayList<GroupQuestion> = allQuestions

        val currentQuestion = listOfQuestions[questionNumber!!-1]

        Log.d("AAA First Question: ", currentQuestion.questionText)

        Log.d("AAA USER SCORE:", userScore.toString())
        Log.d("AAA total Questions:", listOfQuestions.count().toString())
        Log.d("AAA First Question: ", currentQuestion.questionText)

        binding.tvHello2.text = currentQuestion.questionText
        binding.ivPhoto2.setImageResource(currentQuestion.icon)
        binding.rbOptionOne2.text = currentQuestion.optionOne
        binding.rbOptionTwo2.text = currentQuestion.optionTwo
        binding.rbOptionThree2.text = currentQuestion.optionThree
        binding.pbProgress2.progress = currentQuestion.id
        binding.txNumber2.text = "${currentQuestion.id}/${listOfQuestions.count()}"

        binding.btnNext3.setOnClickListener{
            var selectedAnswer: Int = binding.rgOptions.checkedRadioButtonId

            if(selectedAnswer != 1) {
                // check if the user selected the correct one?
                var selectedAnswerValue = findViewById<RadioButton>(selectedAnswer)

                if(selectedAnswerValue.text == currentQuestion.correctAnswer) {
                    // update score
                    userScore = userScore!! + 1
                }

                //option 2: navigating to the same question and updating the values

                if(questionNumber == listOfQuestions.count()) {
                    Log.d("AAA RESULT:", userScore.toString())
                    val intent = Intent(this, ResultActivity::class.java)
                    intent.putExtra("userscore", userScore)
                    intent.putExtra("totalQuestions", listOfQuestions.count())

                    intent.putExtra("username", username.toString()) // passing username

                    startActivity(intent)
                    finish()
                }else {
                    //navigate to the next question
                    //option 2: navigating to the same question and updating the values
                    val intent = Intent(this, GroupQuestionActivity::class.java)
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

        binding.btBack2.setOnClickListener {

            val intent = Intent(this, CategoryActivity::class.java)

            startActivity(intent)
//          finish()


        }


    }
}