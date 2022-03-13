package com.example.recyclerview

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("Id")
fun TextView.setId(item : Model?){
    item?.let {
        text = item.id.toString()
    }
}
@BindingAdapter("Names")
fun TextView.setNames(item : Model?){
    item?.let {
        text = item.name
    }
}