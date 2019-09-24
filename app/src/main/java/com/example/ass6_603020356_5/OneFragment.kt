package com.example.ass6_603020356_5


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ass6_603020356_5.R
import kotlinx.android.synthetic.main.fragment_one.view.*
import kotlinx.android.synthetic.main.fragment_one.view.*
import kotlinx.android.synthetic.main.fragment_one.view.*
import kotlinx.android.synthetic.main.fragment_two.view.*
import android.widget.Toast as Toast1

/**
 * A simple [Fragment] subclass.
 */
class OneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_one, container, false)
        view.btnClickFragmentOne.setOnClickListener(){
            val toast = Toast1.makeText(context, "ฉันเอง", Toast1.LENGTH_SHORT)
            toast.show()

        }
        return view

    }
}
