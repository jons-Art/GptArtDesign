package com.example.gptartdesign

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var pager: ViewPager2
    private lateinit var adapter: FlipPagerAdapter
    private val pages = mutableListOf<Page>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pager = findViewById(R.id.pager)
        adapter = FlipPagerAdapter(this, pages)
        pager.adapter = adapter
        pager.setPageTransformer(FlipPageTransformer())

        findViewById<FloatingActionButton>(R.id.fab_add).setOnClickListener {
            startActivity(Intent(this, PageEditorActivity::class.java))
        }

        findViewById<FloatingActionButton>(R.id.fab_export).setOnClickListener {
            // Export logic: for demo, just show basic flow
            // In production, render pages to bitmaps then export to PNG sequence or MP4
        }
    }
}
