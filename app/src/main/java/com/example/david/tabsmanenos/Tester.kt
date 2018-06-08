package com.example.david.tabsmanenos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.stepstone.stepper.StepperLayout

class Tester : AppCompatActivity() {
        private var mStepperLayout:StepperLayout?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tester)

        mStepperLayout=findViewById<StepperLayout>(R.id.stepperLayout)
        mStepperLayout?.setAdapter(MyStepperAdapterkt(supportFragmentManager,this))
    }
}
