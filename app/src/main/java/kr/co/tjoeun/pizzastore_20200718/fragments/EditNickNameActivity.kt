package kr.co.tjoeun.pizzastore_20200718.fragments

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_edit_nick_name.*
import kotlinx.android.synthetic.main.fragment_my_profile.*
import kr.co.tjoeun.pizzastore_20200718.BaseActivity
import kr.co.tjoeun.pizzastore_20200718.R

class EditNickNameActivity : BaseActivity() {
    override fun setupEvents() {

        okBtn.setOnClickListener {
//            입력한 닉네임을 확인
            val inputNickName = newNickNameEdt.text.toString()

//            닉네임이 5글자가 안 되면 거부.
            if (inputNickName.length < 5) {
//                5글자 이상이어야 한다고 안내
                Toast.makeText(mContext, "닉네임은 최소 5글자 이상이어야 합니다.", Toast.LENGTH_SHORT).show()

//                복귀 코드 실행을 막자. => 이 함수를 강제 종료. (Kotlin에서는 어디로 돌아갈 것인지 명시해줘야 함)
                return@setOnClickListener
            }

//            Intent에 담아서 복귀
            val resultIntent = Intent()
            resultIntent.putExtra("nickName", inputNickName)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()

        }

    }

    override fun setValues() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nick_name)
        setupEvents()
        setValues()
    }
}