package kr.co.tjoeun.pizzastore_20200718.fragments

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

}