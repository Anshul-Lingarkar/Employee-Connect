package com.square.employeeconnect

import android.util.Log

class MainActivityPresenter: MainActivityContract.Presenter {
    override fun getData() {
        Log.d("@@@@@@@@@@@@@@@@@@@", "Presenter and injection working correctly")
    }
}