package com.square.employeeconnect.di

import android.app.Application
import com.square.employeeconnect.MainActivityModule
import com.square.employeeconnect.employeeslist.EmployeesModule

class App: Application() {
    private var component: AppComponent? = null

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder()
            .mainActivityModule(MainActivityModule())
            .employeesModule(EmployeesModule())
            .build()
    }

    fun getComponent(): AppComponent? {
        return component
    }
}