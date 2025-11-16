package com.example.gptartdesign

import android.view.View
import androidx.viewpager2.widget.ViewPager2

class FlipPageTransformer : ViewPager2.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        page.apply {
            pivotY = (height / 2).toFloat()
            pivotX = if (position < 0f) 0f else width.toFloat()
            rotationY = position * -180f
            alpha = if (kotlin.math.abs(position) > 0.5f) 0.0f else 1.0f
        }
    }
}
