package com.example.myawesomeapp.step
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.MainMenuElements

class HomeMenuSteps {
    val mainMenuElements = MainMenuElements()

    fun homeHeaderCheck() {
        mainMenuElements.homeHeaderElement().check(matches(isDisplayed()))
    }

    fun navbarClick() {
        mainMenuElements.homeMenuButton().check(matches(isDisplayed())).perform(click())
    }

    fun secondaryMenuClick() {
        mainMenuElements.homeSecondaryMenu().check(matches(isDisplayed())).perform(click())
    }

    fun homeTextCheck() {
        mainMenuElements.homeTextElement().check(matches(isDisplayed()))
    }

    fun homeFabClick() {
        mainMenuElements.fabScreenElement().check(matches(isDisplayed())).perform(click())
    }

    fun homeNotificationCheck() {
        mainMenuElements.homeNotificationElement().check(matches(isDisplayed()))
        Thread.sleep(5000)
        mainMenuElements.homeNotificationElement().check(doesNotExist())
    }
}
