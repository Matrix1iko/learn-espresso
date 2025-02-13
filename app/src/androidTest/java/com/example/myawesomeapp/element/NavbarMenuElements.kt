package com.example.myawesomeapp.element

import android.widget.TextView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import org.hamcrest.CoreMatchers.allOf

class NavbarMenuElements {
    fun profilePicElement(): ViewInteraction = onView(withId(R.id.imageView))

    fun profileNameElement(): ViewInteraction =
        onView(
            allOf(
                isAssignableFrom(TextView::class.java),
                withText("Android Studio"),
            ),
        )

    fun profileEmailElement(): ViewInteraction =
        onView(
            allOf(
                withText("android.studio@android.com"),
                withId(R.id.textView),
            ),
        )

    fun homeNavButton(): ViewInteraction = onView(withId(R.id.nav_home))

    fun galleryNavButton(): ViewInteraction = onView(withId(R.id.nav_gallery))

    fun slideshowNavButton(): ViewInteraction = onView(withId(R.id.nav_slideshow))
}
