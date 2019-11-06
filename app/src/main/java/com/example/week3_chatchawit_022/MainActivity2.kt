package com.example.week3_chatchawit_022

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_page.*

class MainActivity2 : AppCompatActivity() {

    public final var TAG_NICKNAME: String = "NICKNAME"
    public final var TAG_DATE: String = "DATE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page)

        setTitle("Page2")

        btn_sender2.setOnClickListener {
            var nickname = tv_result_name.text.toString()
            var date = tv_result_date.text.toString()

            sentderFun(nickname, date)
        }
        var name = intent.extras?.getString(MainActivity().TAG_NAME)
        var last = intent.extras?.getString(MainActivity().TAG_LASTNAME)
        var nickname = intent.extras?.getString(MainActivity().TAG_NICKNAME)
        var date = intent.extras?.getString(MainActivity().TAG_DATE)
        var number = intent.extras?.getString(MainActivity().TAG_NUMBER)

        tv_result_name.setText(name)
        tv_result_lastname.setText(last)
        tv_result_nickname.setText(nickname)
        tv_result_date.setText(date)
        tv_result_number.setText(number)

        btn_back.setOnClickListener {
            finish()
        }
    }


    fun sentderFun(arg1: String, arg2: String) {

        var goMainActivity3 = Intent(this,MainActivity3::class.java)


        goMainActivity3.putExtra(TAG_NICKNAME, arg1)
        goMainActivity3.putExtra(TAG_DATE, arg2)

        startActivity(goMainActivity3)
    }
}