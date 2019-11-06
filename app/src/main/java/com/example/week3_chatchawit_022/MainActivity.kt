package com.example.week3_chatchawit_022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    public final var TAG_NAME: String = "NAME"
    public final var TAG_LASTNAME: String = "LASTNAME"
    public final var TAG_NICKNAME: String = "NICKNAME"
    public final var TAG_DATE: String = "DATE"
    public final var TAG_NUMBER: String = "NUMBER"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("หน้าแรก")

        btn_sender.setOnClickListener {
            var name = et_name.text.toString()
            var lastname = et_lastname.text.toString()
            var nickname = et_nickname.text.toString()
            var date = et_date.text.toString()
            var number = et_number.text.toString()

            sentderFun(name, lastname, nickname, date, number)
        }
        btn_clear.setOnClickListener {
            ClearFun()
        }

    }

    fun sentderFun(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String) {

        var goMainActivity2 = Intent(this,MainActivity2::class.java)

        goMainActivity2.putExtra(TAG_NAME, arg1)
        goMainActivity2.putExtra(TAG_LASTNAME, arg2)
        goMainActivity2.putExtra(TAG_NICKNAME, arg3)
        goMainActivity2.putExtra(TAG_DATE, arg4)
        goMainActivity2.putExtra(TAG_NUMBER, arg5)
        startActivity(goMainActivity2)
    }
    fun ClearFun(){
        et_name.setText("")
        et_lastname.setText("")
        et_nickname.setText("")
        et_date.setText("")
        et_number.setText("")
    }

}