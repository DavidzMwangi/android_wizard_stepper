package com.example.david.tabsmanenos

import com.stepstone.stepper.VerificationError
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import com.stepstone.stepper.Step


class StepFragmentSample : Fragment(), Step {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_tester, container, false)
    }


   override fun verifyStep(): VerificationError? {
        //return null if the user can go to the next step, create a new VerificationError instance otherwise
        return null
    }

   override fun onSelected() {
        //update UI when selected
    }

    override   fun onError(error: VerificationError) {
        //handle error inside of the fragment, e.g. show error on EditText
    }

}