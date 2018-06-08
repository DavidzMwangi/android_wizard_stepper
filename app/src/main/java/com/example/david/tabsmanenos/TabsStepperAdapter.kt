package com.example.david.tabsmanenos

import android.content.Context
import android.support.v4.app.FragmentManager
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter
import com.stepstone.stepper.viewmodel.StepViewModel
import android.support.annotation.NonNull
import android.os.Bundle
import android.support.annotation.IntRange
import com.stepstone.stepper.Step


class TabsStepperAdapter(fm:FragmentManager,c:Context): AbstractFragmentStepAdapter(fm,c) {

    override fun createStep(position: Int): Step {
        val step = StepFragmentSample()
        val b = Bundle()
        b.putInt("Position", position)
        step.arguments = b
        return step
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getViewModel(@IntRange(from = 0) position: Int): StepViewModel {
        //Override this method to set Step title for the Tabs, not necessary for other stepper types
        return StepViewModel.Builder(context)
                .setTitle("Page") //can be a CharSequence instead
                .create()
    }
}