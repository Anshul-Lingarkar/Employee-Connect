package com.squareuptest.employeeconnect.di

import android.app.Application
import com.squareuptest.employeeconnect.BaseActivityModule
import com.squareuptest.employeeconnect.employeeslist.EmployeesModule

class App : Application() {
    private var component: AppComponent? = null

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder()
            .baseActivityModule(BaseActivityModule())
            .employeesModule(EmployeesModule())
            .build()
    }

    fun getComponent(): AppComponent? {
        return component
    }
}