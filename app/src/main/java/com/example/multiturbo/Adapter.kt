package com.example.multiturbo

import android.content.res.ColorStateList
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.concurrent.schedule


class Adapter() : RecyclerView.Adapter<ViewHolder>() {

    lateinit var mainact : MainActivity


    var lastRowButtonColors = mutableListOf<String>("#F183AE", "#DC89A6", "#CA8DC1", "#AE90C6", "#98A4D0", "#88C1E7", "#87CEC5", "#ABCA91", "#DCD490", "#E79F8D")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vh = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.button, parent, false))
        return vh

    }

    override fun getItemCount(): Int {

        return 110
    }


  
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.button.isEnabled = true
        holder.button.textSize = 14f

        holder.button.setBackgroundResource(R.drawable.noradius)

        val colnumber = (position/11)+1
        val rownumber = 10-(position%11)

        holder.button.text = ("$rownumber x $colnumber").toString()
        holder.button.setPadding(0, 0,0,0)
        holder.button.setTextColor(Color.parseColor("#ffffff"))



        holder.button.setOnClickListener {

            //holder.button.text = (rownumber *  colnumber).toString()

            Log.i("LETSDEBUG", "CLICK ITEM")
            //Toast.makeText(mainact.applicationContext, "Test", Toast.LENGTH_LONG).show()

            val builder = AlertDialog.Builder(mainact)
            builder.setTitle(("$rownumber x  $colnumber").toString() + " = " + (rownumber *  colnumber).toString())
            builder.setMessage("")


            builder.setPositiveButton(android.R.string.yes) { dialog, which ->

            }

            builder.show()

        }




        if(rownumber <= 10 && colnumber <= 10)
        {


            holder.button.setBackgroundTintList(ColorStateList.valueOf(holder.itemView.context.resources.getColor(R.color.ten)))

        }

        if(rownumber <= 9 && colnumber <= 9)
        {

            holder.button.setBackgroundTintList(ColorStateList.valueOf(holder.itemView.context.resources.getColor(R.color.nine)))

        }
        if(rownumber <= 8 && colnumber <= 8)
        {

            holder.button.setBackgroundTintList(ColorStateList.valueOf(holder.itemView.context.resources.getColor(R.color.eight)))
        }
        if(rownumber <= 7 && colnumber <= 7)
        {
            holder.button.setBackgroundTintList(ColorStateList.valueOf(holder.itemView.context.resources.getColor(R.color.seven)))
        }

        if(rownumber <= 6 && colnumber <= 6)
        {
            holder.button.setBackgroundTintList(ColorStateList.valueOf(holder.itemView.context.resources.getColor(R.color.six)))
        }

        if(rownumber <= 5 && colnumber <= 5)
        {
            holder.button.setBackgroundTintList(ColorStateList.valueOf(holder.itemView.context.resources.getColor(R.color.five)))
        }

        if(rownumber <= 4 && colnumber <= 4)
        {
            holder.button.setBackgroundTintList(ColorStateList.valueOf(holder.itemView.context.resources.getColor(R.color.four)))
        }

        if(rownumber <= 3 && colnumber <= 3)
        {
            holder.button.setBackgroundTintList(ColorStateList.valueOf(holder.itemView.context.resources.getColor(R.color.three)))
        }
        if(rownumber <= 2 && colnumber <= 2)
        {
            holder.button.setBackgroundTintList(ColorStateList.valueOf(holder.itemView.context.resources.getColor(R.color.two)))
        }
        if(rownumber == 1 && colnumber == 1)
        {
            holder.button.setBackgroundTintList(ColorStateList.valueOf(holder.itemView.context.resources.getColor(R.color.one)))
        }









        if(rownumber == 1)
        {

            //holder.button.setBackgroundColor(Color.parseColor(lastRowButtonColors[colnumber-1]))


            if(colnumber == 1)
            {
                holder.button.setBackgroundResource(R.drawable.bottomleftradius)
                holder.button.setBackgroundTintList(ColorStateList.valueOf(holder.itemView.context.resources.getColor(R.color.one)))
            }
            if(colnumber == 10)
            {
                holder.button.setBackgroundResource(R.drawable.bottomrightradius)
                holder.button.setBackgroundTintList(ColorStateList.valueOf(holder.itemView.context.resources.getColor(R.color.ten)))
            }

        }

        if(rownumber == 10 && (colnumber == 1))
        {
            holder.button.setBackgroundResource(R.drawable.topleftradius)
            holder.button.setBackgroundTintList(ColorStateList.valueOf(holder.itemView.context.resources.getColor(R.color.ten)))
        }

        if(rownumber == 10 && (colnumber == 10))
        {
            holder.button.setBackgroundResource(R.drawable.toprightradius)
            holder.button.setBackgroundTintList(ColorStateList.valueOf(holder.itemView.context.resources.getColor(R.color.ten)))
        }




        if (rownumber == 0) {
            holder.button.text = (colnumber).toString()

            //holder.button.setBackgroundColor(Color.TRANSPARENT)
            holder.button.setBackgroundTintList(ColorStateList.valueOf(holder.itemView.context.resources.getColor(R.color.transparent)))
            holder.button.isEnabled = false
            holder.button.textSize = 26f
          /* for (item in 1..10){
                if (colnumber == item){
                    holder.button.setTextColor(Color.parseColor(lastRowButtonColors[item]))
                }
            }

           */
            if (colnumber == 1){
                holder.button.setTextColor(Color.parseColor(lastRowButtonColors[0]))
            }
            if (colnumber == 2){
                holder.button.setTextColor(Color.parseColor(lastRowButtonColors[1]))
            }
            if (colnumber == 3){
                holder.button.setTextColor(Color.parseColor(lastRowButtonColors[2]))
            }
            if (colnumber == 4){
                holder.button.setTextColor(Color.parseColor(lastRowButtonColors[3]))
            }
            if (colnumber == 5){
                holder.button.setTextColor(Color.parseColor(lastRowButtonColors[4]))
            }
            if (colnumber == 6){
                holder.button.setTextColor(Color.parseColor(lastRowButtonColors[5]))
            }
            if (colnumber == 7){
                holder.button.setTextColor(Color.parseColor(lastRowButtonColors[6]))
            }
            if (colnumber == 8){
                holder.button.setTextColor(Color.parseColor(lastRowButtonColors[7]))
            }
            if (colnumber == 9){
                holder.button.setTextColor(Color.parseColor(lastRowButtonColors[8]))
            }
            if (colnumber == 10){
                holder.button.setTextColor(Color.parseColor(lastRowButtonColors[9]))
            }



        }




    }

}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {

var button = view.findViewById<Button>(R.id.buttonNumbers)



}