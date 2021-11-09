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

public class RegisterTest {

    @Rule
    public ActivityTestRule<RegistrationActivity> mActivityTestRule = new ActivityTestRule<>(RegistrationActivity.class);

    @Test
    public void usernamebuttonIsEnabled() {
    String register = "Avgt6677";
    onView(withId(R.id. register_username)).perform(typeText(register),closeSoftKeyboard());
    }

    @Test
    public void emailbuttonIsEnabled() {
    String email = "wn335813@dal.ca";
    onView(withId(R.id. email_reg)).perform(typeText(email),closeSoftKeyboard());
    }

    @Test
    public void passwordbuttonIsEnabled() {
    String pass = "Fw980413?";
    onView(withId(R.id. password)).perform(typeText(pass),closeSoftKeyboard());
    }
}
