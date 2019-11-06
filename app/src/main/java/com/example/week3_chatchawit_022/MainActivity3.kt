package com.example.week3_chatchawit_022

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_page.*

class MainActivity3 :AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        setTitle("Page3")


        var nickname = intent.extras?.getString(MainActivity().TAG_NICKNAME)
        var date = intent.extras?.getString(MainActivity().TAG_DATE)

        tv_result_nickname.setText(nickname)
        tv_result_date.setText(date)

        btn_back.setOnClickListener {
            finish()
        }
    }
}