package kr.co.tjoeun.pizzastore_20200718.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_my_profile.*
import kr.co.tjoeun.pizzastore_20200718.BaseActivity
import kr.co.tjoeun.pizzastore_20200718.R

class EditNickNameActivity : BaseActivity() {
    override fun setupEvents() {
        changeNickNameBtn.setOnClickListener {
            val myIntent = Intent(mContext, R.layout.activity_edit_nick_name)
            startActivity(myIntent)

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