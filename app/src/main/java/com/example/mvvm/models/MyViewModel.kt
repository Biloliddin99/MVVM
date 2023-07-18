package com.example.mvvm.models

import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {

    private val data = Data()

    fun getCount1() = data.count1
    fun getCount2() = data.count1

    fun addCount1(){
        data.count1++
    }

    fun addCount2(){
        data.count2++
    }


}