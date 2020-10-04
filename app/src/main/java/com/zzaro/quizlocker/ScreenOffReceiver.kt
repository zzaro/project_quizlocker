package com.zzaro.quizlocker

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

/* ScreenOffReceiver : 화면이 꺼질때 실행되는 브로드캐스트 리시버 */
class ScreenOffReceiver : BroadcastReceiver(){
    override fun onReceive(context : Context?, intent : Intent?){
        when{
            // 화면이 꺼질 때 오는 브로드캐스트 메세지인 경우 토스트 출력
            intent?.action == Intent.ACTION_SCREEN_OFF -> {
                // 화면이 꺼지면 QuizLockerActivity 실행
                val intent = Intent(context, QuizLockerActivity::class.java)

                // 새로운 Activity로 실행
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

                //기존의 액티비티 스택 제거
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                context?.startActivity(intent)
            }
        }
    }
}