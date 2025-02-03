package com.example.myawesomeapp.element
import androidx.appcompat.widget.AppCompatImageButton
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import org.hamcrest.core.AllOf.allOf

class AppCompatImg {
    fun appCompatImg(): ViewInteraction =
        onView(
            allOf(
                isAssignableFrom(AppCompatImageButton::class.java),
            ),
        )
}
