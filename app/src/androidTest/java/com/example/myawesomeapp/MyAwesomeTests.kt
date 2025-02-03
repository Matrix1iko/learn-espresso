@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.example.myawesomeapp

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myawesomeapp.element.AppCompatImg
import com.example.myawesomeapp.element.GalleryElemnts
import com.example.myawesomeapp.element.GalleryNavButton
import com.example.myawesomeapp.element.HomeNavButton
import com.example.myawesomeapp.element.MailButton
import com.example.myawesomeapp.element.NavMenu
import com.example.myawesomeapp.element.SlideShowNavButton
import com.example.myawesomeapp.element.Toolbar
import com.google.android.material.textview.MaterialTextView
import org.hamcrest.CoreMatchers.allOf
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MyAwesomeTests {
    private lateinit var scenario: ActivityScenario<MainActivity>

    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun checkSlideScreen() {
        val slideShowNavButton = SlideShowNavButton()
        val appCompatIMG = AppCompatImg()
        appCompatIMG.appCompatImg().check(matches(isDisplayed())).perform(click())
        slideShowNavButton.slideShowNavButton().check(matches(isDisplayed())).perform(click())
        onView(
            allOf(
                isAssignableFrom(MaterialTextView::class.java),
                withText("This is slideshow Fragment"),
            ),
        )
    }

    @Test
    fun checkToolbar() {
        val toolbar = Toolbar()
        val navMenu = NavMenu()
        val homeNavButton = HomeNavButton()
        val galleryNavButton = GalleryNavButton()
        val slideShowNavButton = SlideShowNavButton()
        toolbar.toolbarHome().check(matches(isDisplayed()))
        toolbar.toolbarMenu().check(matches(isDisplayed()))
        toolbar.toolbarMore().check(matches(isDisplayed()))
        toolbar.toolbarMenu().perform(click())

        navMenu.profilePic().check(matches(isDisplayed()))
        navMenu.profileName().check(matches(isDisplayed()))
        navMenu.profileMail().check(matches(isDisplayed()))
        homeNavButton.homeNavButton().check(matches(isDisplayed()))
        galleryNavButton.galleryNavButton().check(matches(isDisplayed()))
        slideShowNavButton.slideShowNavButton().check(matches(isDisplayed()))

        homeNavButton.homeNavButton().perform(click())
    }

    @Test
    fun fabTest() {
        val mailButton = MailButton()
        mailButton.fabScreenElement().check(matches(isDisplayed()))
        mailButton.fabScreenElement().perform(click())
        mailButton.fabNotification().check(matches(isDisplayed()))
        Thread.sleep(3000)
        mailButton.fabNotification().check(doesNotExist())
    }

    @Test
    fun galleryCheck() {
        val slideShowNavButton = SlideShowNavButton()
        val appCompatIMG = AppCompatImg()
        val galleryNavButton = GalleryNavButton()
        val toolbar = Toolbar()
        val galleryElemnts = GalleryElemnts()
        appCompatIMG.appCompatImg().check(matches(isDisplayed())).perform(click())
        galleryNavButton.galleryNavButton().check(matches(isDisplayed())).perform(click())
        Thread.sleep(3000)
        // galleryNavButton.galleryNavButton().check(matches(isChecked()))
        toolbar.toolbarGallery().check(matches(isDisplayed()))
        galleryElemnts
            .firstElement()
            .check(
                matches(isDisplayed()),
            ).perform(click())
        Thread.sleep(500)
        galleryElemnts.firstNotification().check(matches(isDisplayed()))
        galleryElemnts.list().perform(swipeUp())
        galleryElemnts.lastElement().check(matches(isDisplayed())).perform(click())
        galleryElemnts.lastNotification().check(matches(isDisplayed()))
    }

    @After
    fun tearDown() {
        scenario.close()
    }
}
