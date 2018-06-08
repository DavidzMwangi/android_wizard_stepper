package com.example.david.tabsmanenos

import android.content.Context
import com.stepstone.stepper.viewmodel.StepViewModel
import android.support.annotation.NonNull
import android.os.Bundle
import android.support.annotation.IntRange
import android.support.v4.app.FragmentManager
import com.stepstone.stepper.Step
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter


class MyStepperAdapterkt(fm: FragmentManager, context: Context) : AbstractFragmentStepAdapter(fm, context) {

//    override fun createStep(position: Int): Step {
//        val step = StepFragmentSample()
//        val b = Bundle()
//        b.putInt(CURRENT_STEP_POSITION_KEY, position)
//        step.arguments = b
//        return step
//    }
//
//    override fun getCount(): Int {
//        return 3
//    }
//
//    override fun getViewModel(@IntRange(from = 0) position: Int): StepViewModel {
//        //Override this method to set Step title for the Tabs, not necessary for other stepper types
//        return StepViewModel.Builder(context)
//                .setTitle("hello") //can be a CharSequence instead
//                .create()
//    }


    override fun getViewModel(@IntRange(from = 0) position: Int): StepViewModel {
        val builder = StepViewModel.Builder(context)
                .setTitle("Hello")
        if (position == 1) {
            builder.setSubtitle("Optional")
        }
        return builder
                .create()
    }

    override fun createStep(position: Int): Step {

        val step = StepFragmentSample()
        val b = Bundle()
        b.putInt("1", position)
        step.arguments = b
        return step
//        when (position) {
//            0 -> return StepFragmentSample.newInstance(R.layout.fragment_step)
//            1 -> return StepFragmentSample.newInstance(R.layout.fragment_step2)
//            2 -> return StepFragmentSample.newInstance(R.layout.fragment_step3)
//            else -> throw IllegalArgumentException("Unsupported position: " + position)
//        }
    }

    override fun getCount(): Int {
        return 3
    }
}