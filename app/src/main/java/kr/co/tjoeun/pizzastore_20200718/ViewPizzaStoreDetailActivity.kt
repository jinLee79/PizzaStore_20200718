package kr.co.tjoeun.pizzastore_20200718

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ViewPizzaStoreDetailActivity : BaseActivity() {
    override fun setupEvents() {
    }

    override fun setValues() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pizza_store_detail)
        setupEvents()
        setValues()
    }
}