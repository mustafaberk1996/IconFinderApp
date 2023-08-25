package com.example.countriesapp.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.countriesapp.data.api.model.Icon
import com.example.countriesapp.databinding.IconListItemBinding

class IconAdapter(
    private val context: Context, private val icons: List<Icon>):
    RecyclerView.Adapter<IconAdapter.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(
            IconListItemBinding.inflate(LayoutInflater.from(context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return icons.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val icon = icons[position]

        holder.ivIcon.load(icon.raster_sizes.last().formats.last().preview_url)


    }

    class CustomViewHolder(binding: IconListItemBinding): RecyclerView.ViewHolder(binding.root) {

        val ivIcon = binding.ivIcon

    }
}