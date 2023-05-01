package com.example.lab2_3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lab2_3.databinding.DataItemBinding

class Adapter: RecyclerView.Adapter<Adapter.DataViewHolder>() {

private val list = ArrayList<Song>()

    inner class DataViewHolder( val binding:DataItemBinding):RecyclerView.ViewHolder(binding.root){

        fun bindItem(song:Song, position: Int){
            binding.tvHeading.text = song.title
            binding.textView1.text = song.singer
            Glide.with(binding.titleImage.context)
                .load(song.imageUrl)
                .centerInside()
                .placeholder(R.drawable.elephant)
                .into(binding.titleImage)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
       val view = DataItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DataViewHolder(view)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bindItem(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setNewData(newList:List<Song>){
 list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }

}