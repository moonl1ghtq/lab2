package com.example.lab2_3

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView




class Fragment_data : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_data, container, false)
        // Inflate the layout for this fragment


        val tv1 = view.findViewById<TextView>(R.id.textView1)
        val text1 = arguments?.getString("key1")
        tv1.text = text1

        val tv2 = view.findViewById<TextView>(R.id.textView2)
        val text2 = arguments?.getString("key2")
        tv2.text = text2

        val tv3 = view.findViewById<TextView>(R.id.textView3)
        val text3 = arguments?.getString("key3")
        tv3.text = text3





        return view
    }




}