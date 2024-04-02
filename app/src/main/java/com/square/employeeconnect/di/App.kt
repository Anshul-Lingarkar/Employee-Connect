package com.square.employeeconnect.di

import android.app.Application
import com.square.employeeconnect.BaseActivityModule
import com.square.employeeconnect.employeeslist.EmployeesModule

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