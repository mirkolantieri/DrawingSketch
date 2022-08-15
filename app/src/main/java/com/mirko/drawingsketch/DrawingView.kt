package com.mirko.drawingsketch

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

/* Instead of utilising an Activity
* The class view DrawingView will serve as a placeholder
* of the current view(s) and displaying objects
* */

class DrawingView(context: Context, attrs: AttributeSet) : View(context, attrs) {

    private var mDrawPath: CustomPath? = null
    private var mCanvasBitmap: Bitmap? = null
    private var mDrawPaint: Paint? = null
    private var mCanvasPaint: Paint? = null
    private var mBrushSize: Float = 0.toFloat()
    private var colour = Color.BLACK
    private var canvas: Canvas? = null

    init {
        setupDrawing()
    }

    private fun setupDrawing() {
        /*
        * private method setupDrawing():
        * Setup the variable for the Drawing set
        * which is then initialised into the constructor
        * */
        mDrawPaint = Paint()
        mDrawPath = CustomPath(colour, mBrushSize)
        mDrawPaint!!.color = colour
        mDrawPaint!!.style = Paint.Style.STROKE
        mDrawPaint!!.strokeJoin = Paint.Join.ROUND
        mDrawPaint!!.strokeCap = Paint.Cap.ROUND
        mCanvasPaint = Paint(Paint.DITHER_FLAG)
        mBrushSize = 20.toFloat()

    }

    internal inner class CustomPath(
        var color: Int, var
        brushThickness: Float
    ) : Path() {
        /* internal inner class
        * that will be usable only within the DrawingView
        * */


    }

}