package com.zzaro.quizlocker

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ScreenOffExActivity : AppCompatActivity() {
    // ScreenOffReceiver 객체
    var screenOffReceiver: ScreenOffReceiver? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_off_ex)

        // screenOffReceiver가  null인 경우에만 screenOffReceiver를 생성하고 등록.
        if (screenOffReceiver == null){
            screenOffReceiver = ScreenOffReceiver()
            val intentFilter = IntentFilter(Intent.ACTION_SCREEN_OFF)
            // registerReceiver = 브로드캐스트 리시버를 런타임에 등록.
            registerReceiver(screenOffReceiver, intentFilter)
        }
    }
}