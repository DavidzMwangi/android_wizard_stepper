package com.example.david.tabsmanenos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.stepstone.stepper.StepperLayout

class TabsActivity : AppCompatActivity() {

    private var mStepperLayout:StepperLayout?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tabs)

        mStepperLayout = findViewById<StepperLayout>(R.id.stepperLayout)
        mStepperLayout?.setAdapter(TabsStepperAdapter(supportFragmentManager, this))
    }
}
