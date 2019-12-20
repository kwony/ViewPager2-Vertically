package com.example.viewpager

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_myfragment.*

class MyFragment() : Fragment() {
    companion object {
        private const val EXTRA_POSITION = "extra_position"

        fun newInstance(position: Int) : Fragment {
            val fragment = MyFragment()
            val args = Bundle()

            args.putInt(EXTRA_POSITION, position)
            fragment.arguments = args

            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_myfragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val position = arguments?.getInt(EXTRA_POSITION, -1)?: -1
        fr_myfragment_position.text = position.toString()

        Toast.makeText(activity?.applicationContext, "fragment onViewCreated, position: " + position, Toast.LENGTH_SHORT).show()
    }
}
