package com.example.assignment1

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


class espressoTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(loginPage::class.java)


    @Test
    fun testLoginNavigatesToProfilePage() {
        onView(withId(R.id.button1)).perform(click())

        onView(withId(R.id.searchButton)).check(matches(isDisplayed()))
    }


    @Test
    fun testSignupNavigatesToSignupPage() {
        onView(withId(R.id.signupbutton)).perform(click())

        onView(withId(R.id.logo)).check(matches(isDisplayed()))
    }

}