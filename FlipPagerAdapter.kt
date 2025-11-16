package com.example.gptartdesign

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class FlipPagerAdapter(private val ctx: Context, private val pages: List<Page>) : RecyclerView.Adapter<FlipPagerAdapter.VH>() {
    inner class VH(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.page_image)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(ctx).inflate(R.layout.item_page, parent, false)
        return VH(v)
    }
    override fun onBindViewHolder(holder: VH, position: Int) {
        // For demo, placeholder behavior
        holder.image.setImageResource(android.R.drawable.ic_menu_gallery)
    }
    override fun getItemCount(): Int = pages.size
}
