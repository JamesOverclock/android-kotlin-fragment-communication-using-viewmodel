package com.l3ios.fragmentcommunicationusignviewmodel.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.l3ios.fragmentcommunicationusignviewmodel.R
import com.l3ios.fragmentcommunicationusignviewmodel.viewmodel.PageViewModel
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    private lateinit var pageViewModel: PageViewModel

    fun newInstance(): SecondFragment {
        return SecondFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // init ViewModel
        pageViewModel = ViewModelProvider(this).get(PageViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        pageViewModel.getName().observe(viewLifecycleOwner, Observer { s ->
            Log.d("aaa", s.toString())
            txtName.text = s.toString()
        })
    }

}

