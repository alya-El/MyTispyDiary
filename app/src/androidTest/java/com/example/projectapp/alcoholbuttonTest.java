package com.example.projectapp;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.longClick;
import static androidx.test.espresso.action.ViewActions.pressImeActionButton;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class alcoholbuttonTest {

    @Rule
    public ActivityTestRule<actvity_alcohol> mActivityTestRule = new ActivityTestRule<>(actvity_alcohol.class);

    @Test
    public void beerbuttonIsClickable() {
        onView(withId(R.id. beer_button)).perform(click());
    }

    @Test
    public void whiskeybuttonIsClickable() {
        onView(withId(R.id. whiskey_button)).perform(click());
    }

    @Test
    public void winebuttonIsClickable() {
        onView(withId(R.id. wine_button)).perform(click());
    }

    @Test
    public void rumbuttonIsClickable() {
        onView(withId(R.id. rum_button)).perform(click());
    }

}


