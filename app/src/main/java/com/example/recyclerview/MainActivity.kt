package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.adapters.ItemAdapter
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.recyclerViewItems.layoutManager= LinearLayoutManager(this)
    val itemAdapter=ItemAdapter(this,getItemList())
        binding.recyclerViewItems.adapter=itemAdapter
    }
    private fun getItemList():ArrayList<String>{
        val list=ArrayList<String>()
        for(i in 1..15){
            list.add("Item $i")
        }
    return list
    }
}