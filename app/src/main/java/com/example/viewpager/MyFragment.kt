package com.example.viewpager

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        Log.d("MyFragment", "onViewCreated, position: " + arguments?.getInt(EXTRA_POSITION, -1))
//        edit_text.requestFocusFromTouch()
        super.onViewCreated(view, savedInstanceState)
    }
}