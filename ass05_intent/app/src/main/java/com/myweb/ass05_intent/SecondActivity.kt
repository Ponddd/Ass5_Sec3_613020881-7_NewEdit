package com.myweb.ass05_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data :Bundle? =intent.extras
        var newEmployee = data?.getParcelable<Employee>("empData")
        nameText.text= "Employee Name : ${newEmployee?.name}"
        radiobtn.text = "Gender : ${newEmployee?.gender}"
        emailText.text = "E-mail : ${newEmployee?.email}"
        salaryText.text = "Salary : ${newEmployee?.salary}"

    }

    fun onClickClose(view : View){
        finish()
    }
}
