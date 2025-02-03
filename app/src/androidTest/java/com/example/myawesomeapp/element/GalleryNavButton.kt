package com.example.myawesomeapp.element
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.myawesomeapp.R

class GalleryNavButton {
    fun galleryNavButton(): ViewInteraction =
        onView(
            withId(R.id.nav_gallery),
        )
}
