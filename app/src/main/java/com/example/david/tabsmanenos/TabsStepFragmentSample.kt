package com.example.david.tabsmanenos

import android.support.v4.app.Fragment
import com.stepstone.stepper.Step
import android.os.Bundle
import android.view.ViewGroup
import android.view.LayoutInflater
import com.stepstone.stepper.VerificationError
import android.support.annotation.NonNull
import android.view.View


class TabsStepFragmentSample:Fragment(),Step{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //initialize your UI

        return inflater.inflate(R.layout.tabs_step_fragment1, container, false)
    }

    override fun verifyStep(): VerificationError? {
        //return null if the user can go to the next step, create a new VerificationError instance otherwise
        return null
    }

    override fun onSelected() {
        //update UI when selected
    }

    override fun onError(error: VerificationError) {
        //handle error inside of the fragment, e.g. show error on EditText
    }
}