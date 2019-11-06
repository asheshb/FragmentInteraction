package com.example.fragmentexample


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.fragmentinteraction.MainActivity
import com.example.fragmentinteraction.R


/**
 * A simple [Fragment] subclass.
 */
class OneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_one, container, false)

        val showActivityMessage = view.findViewById<Button>(R.id.show_activity_message)
        showActivityMessage.setOnClickListener {
            activity?.let{
                (it as MainActivity).showActivityMessage()
            }
        }
        return view
    }


    fun showFragmentMessage(){
        activity?.let {
            Toast.makeText(it, "This message is from Fragment", Toast.LENGTH_SHORT).show()
        }
    }

}
