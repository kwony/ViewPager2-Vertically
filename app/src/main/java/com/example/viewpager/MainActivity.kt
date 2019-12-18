package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPager2Adapter(this)

        adapter.addFragment(MyFragment.newInstance(0))
        adapter.addFragment(MyFragment.newInstance(1))
        adapter.addFragment(MyFragment.newInstance(2))

        viewPager2.adapter = adapter
        viewPager2.orientation = ViewPager2.ORIENTATION_VERTICAL
    }
}
