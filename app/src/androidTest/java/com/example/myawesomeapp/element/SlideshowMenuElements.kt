package com.example.myawesomeapp.element
import android.widget.ImageButton
import android.widget.ImageView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import org.hamcrest.CoreMatchers.allOf

class SlideshowMenuElements {
    fun slideShowHeader(): ViewInteraction =
        onView(
            allOf(
                withText("Slideshow"),
                isDescendantOfA(withId(R.id.toolbar)),
            ),
        )

    fun navMenuButton(): ViewInteraction =
        onView(
            allOf(
                isAssignableFrom(ImageButton::class.java),
                withContentDescription("Open navigation drawer"),
            ),
        )

    fun secondaryMenuButton(): ViewInteraction =
        onView(
            allOf(
                isAssignableFrom(ImageView::class.java),
                withContentDescription("More options"),
            ),
        )

    fun slideshowTextElement(): ViewInteraction =
        onView(
            allOf(
                withId(R.id.text_slideshow),
                withText("This is slideshow Fragment"),
            ),
        )
}
