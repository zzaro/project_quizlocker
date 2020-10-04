package com.zzaro.quizlocker

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceFragment
import kotlinx.android.synthetic.main.activity_pref_ex.*

class PrefExActivity : AppCompatActivity() {
    // nameField의 데이터를 저장할 Key
    val nameFieldKey = "nameFiled"

    // pushCheckBox의 데이터를 저장할 Key
    val pushCheckBoxKey = "pushCheckBox"

    // shared preference 객체, Activity 초기화 이후에 사용해야 하기 때문에 지연 초기화.
    val preference by lazy { getSharedPreferences("PrefExActivity", Context.MODE_PRIVATE)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pref_ex)


    saveButton.setOnClickListener{
        // SharedPreference 에서 nameFieldKey 키값으로 nameField의 현재 텍스트 저장.
        preference.edit().putString(nameFieldKey, nameField.text.toString()).apply()

        // SharedPreference 에서 pushCheckBoxKey 키값으로 체크 박스의 현재 체크 상태 저장.
        preference.edit().putBoolean(pushCheckBoxKey, pushCheckBox.isChecked).apply()
    }

    loadButton.setOnClickListener{
        // SharedPreference 에서 nameFieldKey로 저장된 문자열을 불러와 nameField의 텍스트로 설정.
        nameField.setText(preference.getString(nameFieldKey, ""))

        // SharedPreference 에서 pushCheckBoxKey 키값으로 불린 값을 불러와 pushCheckBox의 체크 상태 설정.
        pushCheckBox.isChecked = preference.getBoolean(pushCheckBoxKey, false)
    }
    }
}
