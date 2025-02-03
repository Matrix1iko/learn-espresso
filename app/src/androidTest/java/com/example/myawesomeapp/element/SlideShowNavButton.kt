@file:Suppress("ktlint:standard:filename")

package com.example.myawesomeapp.element
import androidx.appcompat.widget.ActionMenuView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import org.hamcrest.core.AllOf.allOf

class SlideShowNavButton {
    fun slideShowNavButton(): ViewInteraction =
        onView(
            allOf(
                isAssignableFrom(ActionMenuView::class.java),
            ),
        )
}
