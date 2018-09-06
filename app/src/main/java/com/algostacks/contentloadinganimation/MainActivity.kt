package com.algostacks.contentloadinganimation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.facebook.shimmer.ShimmerFrameLayout

class MainActivity : AppCompatActivity() {


    private var mShimmerViewContainer: ShimmerFrameLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShimmerViewContainer = findViewById(R.id.shimmer_view_container)
    }

    override fun onResume() {
        super.onResume()
        mShimmerViewContainer!!.startShimmer()
    }

    override fun onPause() {
        mShimmerViewContainer!!.stopShimmer()
        super.onPause()

    }
}
