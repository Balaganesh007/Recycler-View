package com.example.recyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ListItemsBinding

class DisplayAdapter : ListAdapter<Model, DisplayAdapter.ViewHolder>(DataDiffCallBack()) {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.v("bala","bindView")
        val item = getItem(position)
        holder.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.v("bala","bindcreateHolder")
        return ViewHolder.from(parent)
    }

    class ViewHolder private constructor(val binding: ListItemsBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(
            item: Model
        ) { Log.v("bala","bind")
            binding.displayRecyclerView = item
            binding.executePendingBindings()
        }
        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ListItemsBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }
}
class DataDiffCallBack : DiffUtil.ItemCallback<Model>(){
    override fun areItemsTheSame(oldItem: Model, newItem: Model): Boolean {
        Log.v("bala","checkitemoldnew")
        return oldItem.id == newItem.id

    }

    override fun areContentsTheSame(oldItem: Model, newItem: Model): Boolean {
        return oldItem == newItem
    }

}


