package com.example.myawesomeapp.element
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.myawesomeapp.R
import com.google.android.material.snackbar.Snackbar.SnackbarLayout
import org.hamcrest.CoreMatchers.allOf

class MailButton {
    fun fabScreenElement(): ViewInteraction = onView(withId(R.id.fab))

    fun fabNotification(): ViewInteraction =
        onView(
            allOf(
                isAssignableFrom(SnackbarLayout::class.java),
            ),
        )
}
