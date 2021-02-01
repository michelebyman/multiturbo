package com.example.multiturbo

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var ourAdapter = Adapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ourRecycleView = findViewById<RecyclerView>(R.id.buttonGrid)

        ourRecycleView.layoutManager = GridLayoutManager(this, 11, GridLayoutManager.HORIZONTAL,false)
        ourRecycleView.adapter = ourAdapter
    }
}