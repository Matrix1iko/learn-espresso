package com.example.myawesomeapp.step
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.SlideshowMenuElements

class SlideshowMenuSteps {
    val slideshowMenuElements = SlideshowMenuElements()

    fun slideshowHeaderCheck() {
        slideshowMenuElements.slideShowHeader().check(matches(isDisplayed()))
    }

    fun navMenuClick() {
        slideshowMenuElements.navMenuButton().check(matches(isDisplayed())).perform(click())
    }

    fun secondaryMenuClick() {
        slideshowMenuElements.secondaryMenuButton().check(matches(isDisplayed())).perform(click())
    }

    fun slideshowTextCheck() {
        slideshowMenuElements.slideshowTextElement().check(matches(isDisplayed()))
    }
}
