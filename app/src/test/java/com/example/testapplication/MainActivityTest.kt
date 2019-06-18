package com.example.testapplication

import android.app.Application
import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlinx.android.synthetic.main.activity_main.*
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    lateinit var activityScenario: ActivityScenario<MainActivity>

    @Before
    fun setUp() {
        ApplicationProvider.getApplicationContext<Application>().setTheme(R.style.AppTheme)
        activityScenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @After
    fun tearDown() {
        activityScenario.close()
    }

    @Test
    fun `this is a test`() {
        activityScenario.onActivity {

        }
    }

    private fun layoutRecyclerView(recyclerView: RecyclerView) {
        recyclerView.measure(0,0)
        recyclerView.layout(0,0,500,1000)
    }
}