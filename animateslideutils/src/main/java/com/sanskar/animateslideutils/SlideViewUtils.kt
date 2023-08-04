package com.sanskar.animateslideutils

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.FrameLayout

/**
 * SlidingView is a custom FrameLayout view that reacts to touch events
 * and slides around the screen accordingly.
 *
 * This view is useful in scenarios where the user wants to be able to freely
 * move a view around the screen.
 *
 * @property downRawX The raw X coordinate of the initial touch event.
 * @property downRawY The raw Y coordinate of the initial touch event.
 *
 * @constructor Creates a new SlidingView.
 * @param context The Context the view is running in, through which it can access the current theme, resources, etc.
 * @param attrs The attributes of the XML tag that is inflating the view.
 * @param defStyleAttr An attribute in the current theme that contains a reference to a style resource to apply to this view.
 */
class SlidingView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private var downRawX: Float = 0.toFloat()
    private var downRawY: Float = 0.toFloat()

    private var originalX: Float = 0.toFloat()
    private var originalY: Float = 0.toFloat()

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)

        if (changed) {
            originalX = x
            originalY = y
        }
    }

    /**
     * Handles the touch screen motion event.
     *
     * This method detects the type of touch event (ACTION_DOWN or ACTION_MOVE)
     * and accordingly updates the position of the view on the screen.
     *
     * @param event The motion event.
     * @return True if the event was handled, false otherwise.
     */
    override fun onTouchEvent(event: MotionEvent): Boolean {
        return when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                // Save the raw coordinates of the initial touch point
                downRawX = event.rawX
                downRawY = event.rawY
                true // Consumed
            }

            MotionEvent.ACTION_MOVE -> {
                // Calculate the distance moved in X and Y direction
                val diffX = event.rawX - downRawX
                val diffY = event.rawY - downRawY

                // Move the view
                val view = this
                view.x = view.x + diffX
                view.y = view.y + diffY

                // Remember this touch position for the next move event
                downRawX = event.rawX
                downRawY = event.rawY

                true // Consumed
            }

            else -> super.onTouchEvent(event)
        }
    }

    /**
     * Resets the view to its original position.
     */
    fun resetPosition() {
        x = originalX
        y = originalY
    }}
