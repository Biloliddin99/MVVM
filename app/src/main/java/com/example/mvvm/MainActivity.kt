package com.example.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm.databinding.ActivityMainBinding
import com.example.mvvm.models.MyViewModel


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myViewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        myViewModel = ViewModelProvider(this)[MyViewModel::class.java]
        binding.tv1.text = myViewModel.getCount1().toString()
        binding.tv2.text = myViewModel.getCount2().toString()

        binding.tv1.setOnClickListener {
            myViewModel.addCount1()
            binding.tv1.text = myViewModel.getCount1().toString()
        }

        binding.tv2.setOnClickListener {
            myViewModel.addCount2()
            binding.tv2.text = myViewModel.getCount2().toString()
        }


    }
}