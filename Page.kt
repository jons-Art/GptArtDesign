package com.example.gptartdesign

import android.content.Context
import android.graphics.*
import android.graphics.BitmapFactory

data class OverlayText(
    var text: String,
    var xPercent: Float = 0.5f,
    var yPercent: Float = 0.5f,
    var sizeSp: Float = 24f,
    var color: Int = Color.BLACK,
    var typeface: Typeface? = null
)

data class Page(var imagePath: String = "", val overlays: MutableList<OverlayText> = mutableListOf()) {
    fun renderToBitmap(context: Context, outW: Int = 1080, outH: Int = 1920): Bitmap {
        val src = if (imagePath.isNotEmpty()) BitmapFactory.decodeFile(imagePath) else Bitmap.createBitmap(outW, outH, Bitmap.Config.ARGB_8888)
        val scaled = Bitmap.createScaledBitmap(src, outW, outH, true)
        val bmp = Bitmap.createBitmap(outW, outH, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bmp)
        canvas.drawBitmap(scaled, 0f, 0f, null)

        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        overlays.forEach { o ->
            paint.textSize = o.sizeSp * context.resources.displayMetrics.scaledDensity
            paint.color = o.color
            paint.typeface = o.typeface
            paint.textAlign = Paint.Align.CENTER
            val x = outW * o.xPercent
            val y = outH * o.yPercent
            canvas.drawText(o.text, x, y, paint)
        }
        return bmp
    }
}
