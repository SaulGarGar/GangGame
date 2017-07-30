package com.gdg.saul.ganggamecommons

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by saul on 30/07/17.
 */

abstract class BaseFragment : Fragment(){

    override fun onCreateView(inflater:LayoutInflater,container:ViewGroup?, savedIntenceState:Bundle?): View?{
        val view :View? = container?.inflate(getLayout())
        return view
    }
    abstract fun getLayout(): Int
}