@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.example.myawesomeapp

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myawesomeapp.element.*
import com.example.myawesomeapp.step.*
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MyAwesomeTests {
    val homeMenuSteps = HomeMenuSteps()
    val navbarMenuSteps = NavbarMenuSteps()
    val slideshowMenuSteps = SlideshowMenuSteps()
    val galleryMenuSteps = GalleryMenuSteps()
    private lateinit var scenario: ActivityScenario<MainActivity>

    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun slideshowTest() {
        homeMenuSteps.navbarClick()
        navbarMenuSteps.slideshowNavbarButtonClick()
        slideshowMenuSteps.slideshowHeaderCheck()
        slideshowMenuSteps.slideshowTextCheck()
    }

    @Test
    fun profileCheckTest() {
        homeMenuSteps.homeHeaderCheck()
        homeMenuSteps.navbarClick()
        navbarMenuSteps.profileElementsCheck()
        navbarMenuSteps.homeNavbarButtonClick()
    }

    @Test
    fun notificationCheck() {
        homeMenuSteps.homeFabClick()
        homeMenuSteps.homeNotificationCheck()
    }

    @Test
    fun galleryCheck() {
        homeMenuSteps.navbarClick()
        navbarMenuSteps.galleryNavbarButtonClick()
        Thread.sleep(4000)
        galleryMenuSteps.galleryHeaderCheck()
        galleryMenuSteps.firstElementTitleClick()
        galleryMenuSteps.firstElementNotificationCheck()
        galleryMenuSteps.lastElementTitleClick()
        galleryMenuSteps.lastElementNotificationCheck()
    }

    @After
    fun tearDown() {
        scenario.close()
    }
}
