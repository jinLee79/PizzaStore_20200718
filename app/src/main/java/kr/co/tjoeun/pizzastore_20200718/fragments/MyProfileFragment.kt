package kr.co.tjoeun.pizzastore_20200718.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_my_profile.*
import kr.co.tjoeun.pizzastore_20200718.R

class MyProfileFragment : Fragment() {

//    닉네임 변경 요청임을 구분하기 위한 숫자 저장 변수
    val REQ_FOR_NICKNAME = 2003

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        changeNickNameBtn.setOnClickListener {
//            다른 액티비티를 통해서 입력값 받아오기
//            나(fragment)를 갖고 있는 activity에서 다른 activity로 이동
            val myIntent = Intent(activity, EditNickNameActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_NICKNAME)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQ_FOR_NICKNAME) {
            if (resultCode == Activity.RESULT_OK) {

//                data는 Intent이면서 null일 수도 있다. => ?로 null 체크
                val nickName = data?.getStringExtra("nickName")

//                nickName은 String?라서 null일 수 있지만 TextView가 알아서 처리(TextView에는 만약 null 들어오면 빈칸으로 바꾸어주는 기능 있음)
                nickNameTxt.text = nickName
            }

        }


    }

}