package com.mustafa.navigationcomponents

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    protected abstract fun getActivity(): String

    protected abstract fun calculate(v1:Int,v2:Int)

}