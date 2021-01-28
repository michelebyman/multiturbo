package com.example.multiturbo

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView



class Adapter() : RecyclerView.Adapter<ViewHolder>() {

    var multy = mutableListOf<String>()
    var lastRowButtonColors = mutableListOf<String>("#F183AE", "#DC89A6", "#CA8DC1", "#AE90C6", "#98A4D0", "#88C1E7", "#87CEC5", "#ABCA91", "#DCD490", "#E79F8D")



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vh = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.button, parent, false))
        return vh
        createMultyList()
    }

    override fun getItemCount(): Int {
        //return multy.size
        return 110
    }

    fun createMultyList() {

       /* for (i in 1..100) {
            multy.add(i.toString())
        }
        */
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        val colnumber = (position/11)+1
        val rownumber = 10-(position%11)

        holder.button.text = (colnumber*rownumber).toString()

        holder.button.setBackgroundColor(Color.CYAN)
        if(rownumber <= 10 && colnumber <= 10)
        {
            holder.button.setBackgroundColor(Color.parseColor(lastRowButtonColors[9]))
        }

        if(rownumber <= 9 && colnumber <= 9)
        {
            holder.button.setBackgroundColor(Color.parseColor(lastRowButtonColors[8]))
        }
        if(rownumber <= 8 && colnumber <= 8)
        {
            holder.button.setBackgroundColor(Color.parseColor(lastRowButtonColors[7]))
        }
        if(rownumber <= 7 && colnumber <= 7)
        {
            holder.button.setBackgroundColor(Color.parseColor(lastRowButtonColors[6]))
        }

        if(rownumber <= 6 && colnumber <= 6)
        {
            holder.button.setBackgroundColor(Color.parseColor(lastRowButtonColors[5]))
        }

        if(rownumber <= 5 && colnumber <= 5)
        {
            holder.button.setBackgroundColor(Color.parseColor(lastRowButtonColors[4]))
        }

        if(rownumber <= 4 && colnumber <= 4)
        {
            holder.button.setBackgroundColor(Color.parseColor(lastRowButtonColors[3]))
        }

        if(rownumber <= 3 && colnumber <= 3)
        {
            holder.button.setBackgroundColor(Color.parseColor(lastRowButtonColors[2]))
        }
        if(rownumber <= 2 && colnumber <= 2)
        {
            holder.button.setBackgroundColor(Color.parseColor(lastRowButtonColors[1]))
        }
        if(rownumber == 1 && colnumber == 1)
        {
            holder.button.setBackgroundColor(Color.parseColor(lastRowButtonColors[0]))
        }

        if(rownumber == 0)
        {
            holder.button.text = (colnumber).toString()
            holder.button.setBackgroundColor(Color.parseColor(lastRowButtonColors[colnumber-1]))
            holder.button.
        }


    }

}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
var button = view.findViewById<Button>(R.id.buttonNumbers)


}