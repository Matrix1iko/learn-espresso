package com.example.myawesomeapp.step
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.GalleryMenuElements

class GalleryMenuSteps {
    val galleryMenuElements = GalleryMenuElements()

    fun galleryHeaderCheck() {
        galleryMenuElements.galleryHeaderElement().check(matches(isDisplayed()))
    }

    fun navbarButtonCheck() {
        galleryMenuElements.galleryMenuButton().check(matches(isDisplayed()))
    }

    fun secondaryButtonCheck() {
        galleryMenuElements.gallerySecondButton().check(matches(isDisplayed()))
    }

    fun firstElementTitleClick() {
        galleryMenuElements.firstHeaderElement().check(matches(isDisplayed())).perform(click())
    }

    fun firstElementNotificationCheck() {
        galleryMenuElements.galleryFirstElementNotification().check(matches(isDisplayed()))
        Thread.sleep(5000)
        galleryMenuElements.galleryLastElementNotification().check(doesNotExist())
    }

    fun lastElementNotificationCheck() {
        galleryMenuElements.galleryLastElementNotification().check(matches(isDisplayed()))
        Thread.sleep(5000)
        galleryMenuElements.galleryLastElementNotification().check(doesNotExist())
    }

    fun lastElementTitleClick() {
        galleryMenuElements.galleryListElement().check(matches(isDisplayed())).perform(swipeUp())
        Thread.sleep(500)
        galleryMenuElements.lastHeaderElement().check(matches(isDisplayed())).perform(click())
    }
}
