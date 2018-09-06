package com.algostacks.contentloadinganimation

import android.app.Application
import com.android.volley.RequestQueue

class MyApplication: Application() {

    private final val TAG: String = this.javaClass.simpleName

    private var mRequestQueue: RequestQueue? = null


    companion object {
        var mInstance: MyApplication? = null
    }

    override fun onCreate() {
        super.onCreate()
        mInstance = this
    }

}