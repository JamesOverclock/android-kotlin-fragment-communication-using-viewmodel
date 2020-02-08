package com.l3ios.fragmentcommunicationusignviewmodel.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PageViewModel : ViewModel() {

    /**
     * Live Data Instance
     */

    private val mName = MutableLiveData<String>()

    fun getName(): LiveData<String> {
        return mName
    }

    fun setName(name: String) {
        mName.value = name
    }
}