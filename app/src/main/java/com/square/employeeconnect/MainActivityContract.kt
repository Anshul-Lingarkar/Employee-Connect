package com.square.employeeconnect

interface MainActivityContract {
    interface View {
        fun refresh();
    }

    interface Presenter {
        fun getData();
    }
}