package com.zzaro.quizlocker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceFragment
/* SharedPreference를 사용해 키-밸류 형태로 저장한 후,
UI에서 변경된 사항을 바로 저장할 수 있는 방식이 PreferenceFragment.
앱의 환경 설정 정보를 저장할 필요가 있는 경우 사용.
 */

class PrefFragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pref_fragment)

        // 액티비티의 컨텐트 뷰를 MyPrefFragment로 교체한다.
        fragmentManager.beginTransaction().replace(android.R.id.content, MyPrefFragment()).commit()
    }

    // PreferenceFragment: XML로 작성한 Preference를 UI로 보여주는 클래스
    class MyPrefFragment : PreferenceFragment() {
        override fun onCreate(savedInstanceState: Bundle?){
            super.onCreate(savedInstanceState)

            //Preference 정보가 있는 XML 파일 저장
            addPreferencesFromResource(R.xml.ex_pref)
        }
    }
}
