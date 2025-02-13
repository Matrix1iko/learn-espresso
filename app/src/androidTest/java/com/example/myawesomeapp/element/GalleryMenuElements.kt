package com.example.myawesomeapp.element

import android.widget.TextView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.hasSibling
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import org.hamcrest.CoreMatchers.allOf

class GalleryMenuElements {
    fun galleryHeaderElement(): ViewInteraction =
        onView(
            allOf(
                isDescendantOfA(withId(R.id.toolbar)),
                isAssignableFrom(TextView::class.java),
                withText("Gallery"),
            ),
        )

    fun galleryMenuButton(): ViewInteraction = onView(withContentDescription("Open navigation drawer"))

    fun gallerySecondButton(): ViewInteraction = onView(withContentDescription("More options"))

    fun firstHeaderElement(): ViewInteraction =
        onView(
            allOf(
                withText("My title"),
                withId(R.id.item_title),
                hasSibling(
                    allOf(
                        withId(R.id.item_number),
                        withText("1"),
                    ),
                ),
            ),
        )

    fun lastHeaderElement(): ViewInteraction =
        onView(
            allOf(
                withText("My title"),
                withId(R.id.item_title),
                hasSibling(
                    allOf(
                        withId(R.id.item_number),
                        withText("10"),
                    ),
                ),
            ),
        )

    fun galleryListElement(): ViewInteraction = onView(withId(R.id.recycle_view))

    fun galleryFirstElementNotification(): ViewInteraction = onView(withText("Item #1 clicked successfully!"))

    fun galleryLastElementNotification(): ViewInteraction = onView(withText("Item #10 clicked successfully!"))
}
