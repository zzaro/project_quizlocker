package com.zzaro.quizlocker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button.setOnClickListener{
            var text1 = editText.text.toString()
            var text2 = editText2.text.toString()

            var dialog = AlertDialog.Builder(this@LoginActivity)
            dialog.setTitle("알람")
            dialog.setMessage("id : " + text1)
            dialog.show()
        }
    }
}
