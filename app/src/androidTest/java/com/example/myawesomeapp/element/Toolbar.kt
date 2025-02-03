package com.example.myawesomeapp.element
import androidx.appcompat.widget.ActionMenuView
import androidx.appcompat.widget.AppCompatImageButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import com.example.myawesomeapp.element.AppCompatImg
import com.example.myawesomeapp.element.SlideShowNavButton
import org.hamcrest.CoreMatchers.allOf

class Toolbar {
    fun toolbar(): ViewInteraction =
        onView(
            withId(R.id.toolbar),
        )

    fun toolbarHome(): ViewInteraction =
        onView(
            (
                allOf(
                    isAssignableFrom(AppCompatTextView::class.java),
                    withText("Home"),
                )
            ),
        )

    fun toolbarGallery(): ViewInteraction =
        onView(
            (
                allOf(
                    isAssignableFrom(AppCompatTextView::class.java),
                    withText("Gallery"),
                )
            ),
        )

    fun toolbarMenu(): ViewInteraction =
        onView(
            (
                allOf(isAssignableFrom(AppCompatImageButton::class.java))
            ),
        )

    fun toolbarMore(): ViewInteraction =
        onView(
            (
                allOf(isAssignableFrom(ActionMenuView::class.java))
            ),
        )
}
