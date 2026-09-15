package edu.temple.inclassuiactivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val context: Context, private val numbers: Array<Int>) : BaseAdapter() {

    override fun getCount() = numbers.size

    override fun getItem(position: Int) = numbers[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //return recycled textview or not

        return (if (convertView == null) {
            TextView(context)
        } else {
            convertView as TextView
        }).apply {
            text = numbers[position].toString()
            textSize = 22f
        }
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?)
    = (getView(position, convertView, parent) as TextView).apply{
        textSize = numbers[position].toFloat()
    }

}