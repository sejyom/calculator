package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var result: Double = 0.0
    var str: String? = null
    var num: Double = 0.0
    var flag = 0
    var isClear = 0

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        var frame_main = findViewById<LinearLayout>(R.id.mainLayout)
        var frame_travel = findViewById<LinearLayout>(R.id.travelLayout)
        var frame_calc = findViewById<LinearLayout>(R.id.calcLayout)

        // 앱 켰을 때 메인 화면 표시
        frame_main.visibility = View.VISIBLE
        frame_travel.visibility = View.INVISIBLE
        frame_calc.visibility = View.INVISIBLE

        // 눌리는 버튼에 따라 해당 레이아웃 표시
        binding.btnMain.setOnClickListener {
            frame_main.visibility = View.VISIBLE
            frame_travel.visibility = View.INVISIBLE
            frame_calc.visibility = View.INVISIBLE
        }

        binding.btnTravel.setOnClickListener {
            frame_main.visibility = View.INVISIBLE
            frame_travel.visibility = View.VISIBLE
            frame_calc.visibility = View.INVISIBLE
        }

        binding.btnCal.setOnClickListener {
            frame_main.visibility = View.INVISIBLE
            frame_travel.visibility = View.INVISIBLE
            frame_calc.visibility = View.VISIBLE
        }

        // 가을 여행 레이아웃 라디오 버튼 눌리면 해당 이미지 표시
        binding.rdgroup.setOnCheckedChangeListener { RadioGroup, i ->
            when (i) {
                R.id.rdFrance -> binding.imgTravel.setImageResource(R.drawable.france)
                R.id.rdGermany -> binding.imgTravel.setImageResource(R.drawable.germany)
                R.id.rdSwitzerland -> binding.imgTravel.setImageResource(R.drawable.switzerland)
            }
        }


        // 계산기
        // 숫자 눌리면 editText에 출력
        var btn1: Button? = null
        var btn2: Button? = null
        var btn3: Button? = null
        var btn4: Button? = null
        var btn5: Button? = null
        var btn6: Button? = null
        var btn7: Button? = null
        var btn8: Button? = null
        var btn9: Button? = null
        var btn0: Button? = null
        var btnDot: Button? = null
        var btnEql: Button? = null
        var btnAdd: Button? = null
        var btnSub: Button? = null
        var btnMul: Button? = null
        var btnDiv: Button? = null
        var btnRes: Button? = null



        btn1 = findViewById<Button>(R.id.btn1)
        btn2 = findViewById<Button>(R.id.btn2)
        btn3 = findViewById<Button>(R.id.btn3)
        btn4 = findViewById<Button>(R.id.btn4)
        btn5 = findViewById<Button>(R.id.btn5)
        btn6 = findViewById<Button>(R.id.btn6)
        btn7 = findViewById<Button>(R.id.btn7)
        btn8 = findViewById<Button>(R.id.btn8)
        btn9 = findViewById<Button>(R.id.btn9)
        btn0 = findViewById<Button>(R.id.btn0)
        btnDot = findViewById<Button>(R.id.btnDot)
        btnEql = findViewById<Button>(R.id.btnEql)
        btnAdd = findViewById<Button>(R.id.btnAdd)
        btnSub = findViewById<Button>(R.id.btnSub)
        btnMul = findViewById<Button>(R.id.btnMul)
        btnDiv = findViewById<Button>(R.id.btnDiv)
        btnRes = findViewById<Button>(R.id.btnRes)


        btn1!!.setOnClickListener(this)
        btn2!!.setOnClickListener(this)
        btn3!!.setOnClickListener(this)
        btn4!!.setOnClickListener(this)
        btn5!!.setOnClickListener(this)
        btn6!!.setOnClickListener(this)
        btn7!!.setOnClickListener(this)
        btn8!!.setOnClickListener(this)
        btn9!!.setOnClickListener(this)
        btn0!!.setOnClickListener(this)
        btnDot!!.setOnClickListener(this)
        btnEql!!.setOnClickListener(this)
        btnAdd!!.setOnClickListener(this)
        btnSub!!.setOnClickListener(this)
        btnMul!!.setOnClickListener(this)
        btnDiv!!.setOnClickListener(this)
        btnRes!!.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (isClear==0) {
            result=0.0
            num=0.0
            flag=0
            binding.editText.setText("")
        }
        isClear=1
        when (v?.id) {
            R.id.btn1 -> {
                binding.editText.getText().append("1")
            }
            R.id.btn2 -> {
                binding.editText.getText().append("2")
            }
            R.id.btn3 -> {
                binding.editText.getText().append("3")
            }
            R.id.btn4 -> {
                binding.editText.getText().append("4")
            }
            R.id.btn5 -> {
                binding.editText.getText().append("5")
            }
            R.id.btn6 -> {
                binding.editText.getText().append("6")
            }
            R.id.btn7 -> {
                binding.editText.getText().append("7")
            }
            R.id.btn8 -> {
                binding.editText.getText().append("8")
            }
            R.id.btn9 -> {
                binding.editText.getText().append("9")
            }
            R.id.btn0 -> {
                binding.editText.getText().append("0")
            }
            R.id.btnDot -> {
                binding.editText.getText().append(".")
            }
            R.id.btnAdd -> {
                str = binding.editText.getText().toString()
                if(str!!.trim() == "") {
                    Toast.makeText(applicationContext, "숫자를 입력하세요", Toast.LENGTH_SHORT).show()
                } else {
                    num = str!!.toDouble()
                    flag = 1
                    binding.editText.setText("")
                }
            }
            R.id.btnSub -> {
                str = binding.editText.getText().toString()
                if(str!!.trim() == "") {
                    Toast.makeText(applicationContext, "숫자를 입력하세요", Toast.LENGTH_SHORT).show()
                } else {
                    num = str!!.toDouble()
                    flag = 2
                    binding.editText.setText("")
                }
            }
            R.id.btnMul -> {
                str = binding.editText.getText().toString()
                if(str!!.trim() == "") {
                    Toast.makeText(applicationContext, "숫자를 입력하세요", Toast.LENGTH_SHORT).show()
                } else {
                    num = str!!.toDouble()
                    flag = 3
                    binding.editText.setText("")
                }
            }
            R.id.btnDiv -> {
                str = binding.editText.getText().toString()
                if(str!!.trim() == "") {
                    Toast.makeText(applicationContext, "숫자를 입력하세요", Toast.LENGTH_SHORT).show()
                } else {
                    num = str!!.toDouble()
                    flag = 4
                    binding.editText.setText("")
                }
            }
            R.id.btnRes -> {
                str = binding.editText.getText().toString()
                if(str!!.trim() == "") {
                    Toast.makeText(applicationContext, "숫자를 입력하세요", Toast.LENGTH_SHORT).show()
                } else {
                    num = str!!.toDouble()
                    flag = 5
                    binding.editText.setText("")
                }
            }
            R.id.btnEql -> {
                when(flag) {
                    1 -> {
                        result = num!! + binding.editText.getText().toString().toDouble()
                        binding.editText.setText(result.toString())
                    }
                    2 -> {
                        result = num!! - binding.editText.getText().toString().toDouble()
                        binding.editText.setText(result.toString())
                    }
                    3 -> {
                        result = num!! * binding.editText.getText().toString().toDouble()
                        binding.editText.setText(result.toString())
                    }
                    4 -> {
                            if(binding.editText.getText().toString().trim()=="0") {
                                Toast.makeText(applicationContext, "0으로 나눌 수 없습니다", Toast.LENGTH_SHORT).show()
                            } else {
                                result = num!! / binding.editText.getText().toString().toDouble()
                                result = (result!! * 10).toInt() / 10.0
                                binding.editText.setText(result.toString())
                        }
                    }
                    5 -> {
                        if(binding.editText.getText().toString().trim()=="0") {
                            Toast.makeText(applicationContext, "0으로 나눌 수 없습니다", Toast.LENGTH_SHORT).show()
                        } else {
                            result = num!! % binding.editText.getText().toString().toDouble()
                            binding.editText.setText(result.toString())
                        }
                    }
                }
                binding.editText.setText(result.toString())
                isClear = 0
            }
        }
    }
}