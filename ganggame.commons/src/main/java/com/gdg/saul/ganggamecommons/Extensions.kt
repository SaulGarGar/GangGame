package com.gdg.saul.ganggamecommons

import android.service.media.MediaBrowserService
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowId

/**
 * Created by saul on 30/07/17.
 */

fun ViewGroup.inflate(layoutResId: Int, attachToRoot: Boolean = false ): View{
    return LayoutInflater.from(context).inflate(layoutResId,this,attachToRoot)
}