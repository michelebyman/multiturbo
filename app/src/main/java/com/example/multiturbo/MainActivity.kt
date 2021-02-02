package com.example.multiturbo

import android.app.AlertDialog
import android.content.DialogInterface
import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var ourAdapter = Adapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ourAdapter.mainact = this

        var ourRecycleView = findViewById<RecyclerView>(R.id.buttonGrid)

        //ourRecycleView.addItemDecoration(MarginItemDecoration(20))

        ourRecycleView.layoutManager = GridLayoutManager(this, 11, GridLayoutManager.HORIZONTAL,false)
        ourRecycleView.adapter = ourAdapter

        var button63 = findViewById<Button>(R.id.button63)
        button63.isEnabled = false
    }
}

/*
class MarginItemDecoration(private val spaceHeight: Int) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(outRect: Rect, view: View,
                                parent: RecyclerView, state: RecyclerView.State) {
        with(outRect) {
            if (parent.getChildAdapterPosition(view) == 10) {
                top = spaceHeight
            }
            left =  0
            right = 0
            bottom = 0
        }
    }
}

 */