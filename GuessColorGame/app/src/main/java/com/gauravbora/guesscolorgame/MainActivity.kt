package com.gauravbora.guesscolorgame

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import com.gauravbora.guesscolorgame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var options: Array<String> =
        arrayOf("G", "R", "E", "E", "N", "D", "Y", "B", "L", "U", "O", "L", "W", "A")
    var ans: Array<String> = arrayOf("YELLOW", "GREEN", "RED", "BLUE", "BROWN", "ORANGE")
    var hintans: Array<String> = arrayOf("WOLYEL", "NGEER", "EDR", "LUBE", "ROWBN", "GEANOR")

    private var currentQuestion = 1
    private var totalQuestions = 6
    private var questionIndex = 0
    private var maxpresscounter = 6
    private var anscounter = 0
    private var combinedAns = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Shuffles the questions and sets the question index to the first question.
        randomizeQuestions()

        binding.hint.setOnClickListener {
            Toast.makeText(this, hintans[questionIndex], Toast.LENGTH_SHORT).show()
        }

        binding.one.setOnClickListener {
            if (anscounter <= maxpresscounter) {
                if (anscounter == 0) {
                    binding.Et1.text = binding.one.text
                } else if (anscounter == 1) {
                    binding.Et2.text = binding.one.text
                } else if (anscounter == 2) {
                    binding.Et3.text = binding.one.text
                } else if (anscounter == 3) {
                    binding.Et4.text = binding.one.text
                } else if (anscounter == 4) {
                    binding.Et5.text = binding.one.text
                } else {
                    binding.Et6.text = binding.one.text
                }
                anscounter++
                combinedAns += (binding.one.text)
                binding.one.visibility = View.INVISIBLE

                if (anscounter == maxpresscounter) {
                    doValidate()
                }
            }
        }
        binding.two.setOnClickListener {
            if (anscounter <= maxpresscounter) {
                if (anscounter == 0) {
                    binding.Et1.text = binding.two.text
                } else if (anscounter == 1) {
                    binding.Et2.text = binding.two.text
                } else if (anscounter == 2) {
                    binding.Et3.text = binding.two.text
                } else if (anscounter == 3) {
                    binding.Et4.text = binding.two.text
                } else if (anscounter == 4) {
                    binding.Et5.text = binding.two.text
                } else {
                    binding.Et6.text = binding.two.text
                }
                anscounter++
                combinedAns += (binding.two.text)
                binding.two.visibility = View.INVISIBLE

                if (anscounter == maxpresscounter) {
                    doValidate()
                }
            }
        }
        binding.three.setOnClickListener {
            if (anscounter <= maxpresscounter) {
                if (anscounter == 0) {
                    binding.Et1.text = binding.three.text
                } else if (anscounter == 1) {
                    binding.Et2.text = binding.three.text
                } else if (anscounter == 2) {
                    binding.Et3.text = binding.three.text
                } else if (anscounter == 3) {
                    binding.Et4.text = binding.three.text
                } else if (anscounter == 4) {
                    binding.Et5.text = binding.three.text
                } else {
                    binding.Et6.text = binding.three.text
                }
                anscounter++
                combinedAns += (binding.three.text)
                binding.three.visibility = View.INVISIBLE

                if (anscounter == maxpresscounter) {
                    doValidate()
                }
            }
        }
        binding.four.setOnClickListener {
            if (anscounter <= maxpresscounter) {
                if (anscounter == 0) {
                    binding.Et1.text = binding.four.text
                } else if (anscounter == 1) {
                    binding.Et2.text = binding.four.text
                } else if (anscounter == 2) {
                    binding.Et3.text = binding.four.text
                } else if (anscounter == 3) {
                    binding.Et4.text = binding.four.text
                } else if (anscounter == 4) {
                    binding.Et5.text = binding.four.text
                } else {
                    binding.Et6.text = binding.four.text
                }
                anscounter++
                combinedAns += (binding.four.text)
                binding.four.visibility = View.INVISIBLE

                if (anscounter == maxpresscounter) {
                    doValidate()
                }
            }
        }
        binding.five.setOnClickListener {
            if (anscounter <= maxpresscounter) {
                if (anscounter == 0) {
                    binding.Et1.text = binding.five.text
                } else if (anscounter == 1) {
                    binding.Et2.text = binding.five.text
                } else if (anscounter == 2) {
                    binding.Et3.text = binding.five.text
                } else if (anscounter == 3) {
                    binding.Et4.text = binding.five.text
                } else if (anscounter == 4) {
                    binding.Et5.text = binding.five.text
                } else {
                    binding.Et6.text = binding.five.text
                }
                anscounter++
                combinedAns += (binding.five.text)
                binding.five.visibility = View.INVISIBLE

                if (anscounter == maxpresscounter) {
                    doValidate()
                }
            }
        }
        binding.six.setOnClickListener {
            if (anscounter <= maxpresscounter) {
                if (anscounter == 0) {
                    binding.Et1.text = binding.six.text
                } else if (anscounter == 1) {
                    binding.Et2.text = binding.six.text
                } else if (anscounter == 2) {
                    binding.Et3.text = binding.six.text
                } else if (anscounter == 3) {
                    binding.Et4.text = binding.six.text
                } else if (anscounter == 4) {
                    binding.Et5.text = binding.six.text
                } else {
                    binding.Et6.text = binding.six.text
                }
                anscounter++
                combinedAns += (binding.six.text)
                binding.six.visibility = View.INVISIBLE

                if (anscounter == maxpresscounter) {
                    doValidate()
                }
            }
        }
        binding.seven.setOnClickListener {
            if (anscounter <= maxpresscounter) {
                if (anscounter == 0) {
                    binding.Et1.text = binding.seven.text
                } else if (anscounter == 1) {
                    binding.Et2.text = binding.seven.text
                } else if (anscounter == 2) {
                    binding.Et3.text = binding.seven.text
                } else if (anscounter == 3) {
                    binding.Et4.text = binding.seven.text
                } else if (anscounter == 4) {
                    binding.Et5.text = binding.seven.text
                } else {
                    binding.Et6.text = binding.seven.text
                }
                anscounter++
                combinedAns += (binding.seven.text)
                binding.seven.visibility = View.INVISIBLE

                if (anscounter == maxpresscounter) {
                    doValidate()
                }
            }
        }
        binding.eight.setOnClickListener {
            if (anscounter <= maxpresscounter) {
                if (anscounter == 0) {
                    binding.Et1.text = binding.eight.text
                } else if (anscounter == 1) {
                    binding.Et2.text = binding.eight.text
                } else if (anscounter == 2) {
                    binding.Et3.text = binding.eight.text
                } else if (anscounter == 3) {
                    binding.Et4.text = binding.eight.text
                } else if (anscounter == 4) {
                    binding.Et5.text = binding.eight.text
                } else {
                    binding.Et6.text = binding.eight.text
                }
                anscounter++
                combinedAns += (binding.eight.text)
                binding.eight.visibility = View.INVISIBLE

                if (anscounter == maxpresscounter) {
                    doValidate()
                }
            }
        }
        binding.nine.setOnClickListener {
            if (anscounter <= maxpresscounter) {
                if (anscounter == 0) {
                    binding.Et1.text = binding.nine.text
                } else if (anscounter == 1) {
                    binding.Et2.text = binding.nine.text
                } else if (anscounter == 2) {
                    binding.Et3.text = binding.nine.text
                } else if (anscounter == 3) {
                    binding.Et4.text = binding.nine.text
                } else if (anscounter == 4) {
                    binding.Et5.text = binding.nine.text
                } else {
                    binding.Et6.text = binding.nine.text
                }
                anscounter++
                combinedAns += (binding.nine.text)
                binding.nine.visibility = View.INVISIBLE

                if (anscounter == maxpresscounter) {
                    doValidate()
                }
            }
        }
        binding.ten.setOnClickListener {
            if (anscounter <= maxpresscounter) {
                if (anscounter == 0) {
                    binding.Et1.text = binding.ten.text
                } else if (anscounter == 1) {
                    binding.Et2.text = binding.ten.text
                } else if (anscounter == 2) {
                    binding.Et3.text = binding.ten.text
                } else if (anscounter == 3) {
                    binding.Et4.text = binding.ten.text
                } else if (anscounter == 4) {
                    binding.Et5.text = binding.ten.text
                } else {
                    binding.Et6.text = binding.ten.text
                }
                anscounter++
                combinedAns += (binding.ten.text)
                binding.ten.visibility = View.INVISIBLE

                if (anscounter == maxpresscounter) {
                    doValidate()
                }
            }
        }
        binding.eleven.setOnClickListener {
            if (anscounter <= maxpresscounter) {
                if (anscounter == 0) {
                    binding.Et1.text = binding.eleven.text
                } else if (anscounter == 1) {
                    binding.Et2.text = binding.eleven.text
                } else if (anscounter == 2) {
                    binding.Et3.text = binding.eleven.text
                } else if (anscounter == 3) {
                    binding.Et4.text = binding.eleven.text
                } else if (anscounter == 4) {
                    binding.Et5.text = binding.eleven.text
                } else {
                    binding.Et6.text = binding.eleven.text
                }
                anscounter++
                combinedAns += (binding.eleven.text)
                binding.eleven.visibility = View.INVISIBLE

                if (anscounter == maxpresscounter) {
                    doValidate()
                }
            }
        }
        binding.twelve.setOnClickListener {
            if (anscounter <= maxpresscounter) {
                if (anscounter == 0) {
                    binding.Et1.text = binding.twelve.text
                } else if (anscounter == 1) {
                    binding.Et2.text = binding.twelve.text
                } else if (anscounter == 2) {
                    binding.Et3.text = binding.twelve.text
                } else if (anscounter == 3) {
                    binding.Et4.text = binding.twelve.text
                } else if (anscounter == 4) {
                    binding.Et5.text = binding.twelve.text
                } else {
                    binding.Et6.text = binding.twelve.text
                }
                anscounter++
                combinedAns += (binding.twelve.text)
                binding.twelve.visibility = View.INVISIBLE

                if (anscounter == maxpresscounter) {
                    doValidate()
                }
            }
        }
        binding.thirteen.setOnClickListener {
            if (anscounter <= maxpresscounter) {
                if (anscounter == 0) {
                    binding.Et1.text = binding.thirteen.text
                } else if (anscounter == 1) {
                    binding.Et2.text = binding.thirteen.text
                } else if (anscounter == 2) {
                    binding.Et3.text = binding.thirteen.text
                } else if (anscounter == 3) {
                    binding.Et4.text = binding.thirteen.text
                } else if (anscounter == 4) {
                    binding.Et5.text = binding.thirteen.text
                } else {
                    binding.Et6.text = binding.thirteen.text
                }
                anscounter++
                combinedAns += (binding.thirteen.text)
                binding.thirteen.visibility = View.INVISIBLE

                if (anscounter == maxpresscounter) {
                    doValidate()
                }
            }
        }
        binding.fourteen.setOnClickListener {
            if (anscounter <= maxpresscounter) {
                if (anscounter == 0) {
                    binding.Et1.text = binding.fourteen.text
                } else if (anscounter == 1) {
                    binding.Et2.text = binding.fourteen.text
                } else if (anscounter == 2) {
                    binding.Et3.text = binding.fourteen.text
                } else if (anscounter == 3) {
                    binding.Et4.text = binding.fourteen.text
                } else if (anscounter == 4) {
                    binding.Et5.text = binding.fourteen.text
                } else {
                    binding.Et6.text = binding.fourteen.text
                }
                anscounter++
                combinedAns += (binding.fourteen.text)
                binding.fourteen.visibility = View.INVISIBLE

                if (anscounter == maxpresscounter) {
                    doValidate()
                }
            }
        }


    }

    private fun doValidate() {

        anscounter = 0
        if (combinedAns == ans[questionIndex]) {

            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
            currentQuestion++
            questionIndex++
            setQuestion(currentQuestion)
        } else {
            Toast.makeText(this, "$combinedAns   and  ${ans[questionIndex]}", Toast.LENGTH_SHORT)
                .show()
            combinedAns = ""
        }
        resetViews()
    }

    private fun resetViews() {
        binding.apply {
            one.visibility = View.VISIBLE
            two.visibility = View.VISIBLE
            three.visibility = View.VISIBLE
            four.visibility = View.VISIBLE
            five.visibility = View.VISIBLE
            six.visibility = View.VISIBLE
            seven.visibility = View.VISIBLE
            eight.visibility = View.VISIBLE
            nine.visibility = View.VISIBLE
            ten.visibility = View.VISIBLE
            eleven.visibility = View.VISIBLE
            twelve.visibility = View.VISIBLE
            thirteen.visibility = View.VISIBLE
            fourteen.visibility = View.VISIBLE

            Et1.text = ""
            Et2.text = ""
            Et3.text = ""
            Et4.text = ""
            Et5.text = ""
            Et6.text = ""
            setoptionsUi(options)
        }
    }

    private fun randomizeQuestions() {
        options.shuffle()

        questionIndex = 0
        setQuestion(currentQuestion)
    }


    //        set first question
    private fun setQuestion(currentQuestion: Int) {
        combinedAns = ""
        when (currentQuestion) {
            1 -> {
                binding.questionImage.setImageResource(R.drawable.yellow_img)
                binding.lavel.text= "Lavel 1"
            }
            2 -> {
                binding.questionImage.setImageResource(R.drawable.green_img)
                binding.Et6.visibility = View.GONE
                maxpresscounter = 5
                binding.lavel.text= "Lavel 2"
            }
            3 -> {
                binding.questionImage.setImageResource(R.drawable.red_img)
                binding.Et6.visibility = View.GONE
                binding.Et5.visibility = View.GONE
                binding.Et4.visibility = View.GONE
                maxpresscounter = 3
                binding.lavel.text= "Lavel 3"
            }
            4 -> {
                binding.questionImage.setImageResource(R.drawable.blue_img)
                binding.Et6.visibility = View.GONE
                binding.Et5.visibility = View.GONE
                binding.Et4.visibility = View.VISIBLE
                binding.lavel.text= "Lavel 4"
                maxpresscounter = 4
            }

            5 -> {
                binding.questionImage.setImageResource(R.drawable.brown_img)
                binding.Et6.visibility = View.GONE
                binding.Et5.visibility = View.VISIBLE
                maxpresscounter = 5
                binding.lavel.text= "Lavel 5"
            }
            6 -> {
                binding.Et6.visibility = View.VISIBLE
                binding.questionImage.setImageResource(R.drawable.orange_img)
                maxpresscounter = 6
                binding.lavel.text= "Lavel 6"
            }
        }
        if (totalQuestions + 1 == currentQuestion) {
            Toast.makeText(this, "Congratulations ,You Completed the Game", Toast.LENGTH_SHORT)
                .show()

            val builder = AlertDialog.Builder(this)
            // Get the layout inflater
            val inflater = this.layoutInflater

            builder.setView(inflater.inflate(R.layout.dialog_congrats, null))

                .setPositiveButton("Exit",
                    DialogInterface.OnClickListener { dialog, id ->

                       finish()
                        System.exit(0)
                    })
//                .setNegativeButton(R.string.cancel,
//                    DialogInterface.OnClickListener { dialog, id ->
//
//                        Toast.makeText(this,"Canceled",Toast.LENGTH_SHORT).show()
//                    })
            builder.create()
            builder.show()


        }
        setoptionsUi(options)
    }

    private fun setoptionsUi(options: Array<String>) {
        options.shuffle()
        binding.apply {
            one.text = options[0]
            two.text = options[1]
            three.text = options[2]
            four.text = options[3]
            five.text = options[4]
            six.text = options[5]
            seven.text = options[6]
            eight.text = options[7]
            nine.text = options[8]
            ten.text = options[9]
            eleven.text = options[10]
            twelve.text = options[11]
            thirteen.text = options[12]
            fourteen.text = options[13]
        }
    }

}
