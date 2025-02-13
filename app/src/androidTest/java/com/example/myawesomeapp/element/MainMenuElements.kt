package com.example.myawesomeapp.element

import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import org.hamcrest.CoreMatchers.allOf

class MainMenuElements {
    fun fabScreenElement(): ViewInteraction = onView(withId(R.id.fab))

    fun homeTextElement(): ViewInteraction =
        onView(
            allOf(
                isAssignableFrom(TextView::class.java),
                withText("This is home Fragment"),
            ),
        )

    fun homeHeaderElement(): ViewInteraction =
        onView(
            allOf(
                isDescendantOfA(withId(R.id.toolbar)),
                isAssignableFrom(TextView::class.java),
                withText("Home"),
            ),
        )

    fun homeMenuButton(): ViewInteraction =
        onView(
            allOf(
                isAssignableFrom(ImageButton::class.java),
                isDescendantOfA(withId(R.id.toolbar)),
            ),
        )

    fun homeSecondaryMenu(): ViewInteraction =
        onView(
            allOf(
                isAssignableFrom(ImageView::class.java),
                withContentDescription("More options"),
            ),
        )

    fun homeNotificationElement(): ViewInteraction =
        onView(
            withText("Replace with your own action"),
        )
}
