package com.example.myawesomeapp.step
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.NavbarMenuElements

class NavbarMenuSteps {
    val navbarMenuElements = NavbarMenuElements()

    fun profileElementsCheck() {
        navbarMenuElements.profilePicElement().check(matches(isDisplayed()))
        navbarMenuElements.profileNameElement().check(matches(isDisplayed()))
        navbarMenuElements.profileEmailElement().check(matches(isDisplayed()))
    }

    fun homeNavbarButtonClick() {
        navbarMenuElements.homeNavButton().check(matches(isDisplayed())).perform(click())
    }

    fun galleryNavbarButtonClick() {
        navbarMenuElements.galleryNavButton().check(matches(isDisplayed())).perform(click())
    }

    fun slideshowNavbarButtonClick() {
        navbarMenuElements.slideshowNavButton().check(matches(isDisplayed())).perform(click())
    }
}
