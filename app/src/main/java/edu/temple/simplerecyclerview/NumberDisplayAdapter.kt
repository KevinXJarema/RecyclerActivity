package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter (private val numbers: Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {


    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(TextView(parent.context))
    }


    override fun getItemCount(): Int {
        return numbers.size
    }


    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.setText(numbers[position].toString())
    }

    //Step 3b: Complete function definitions for adapter

}