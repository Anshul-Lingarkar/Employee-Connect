package com.squareuptest.employeeconnect.di

import com.squareuptest.employeeconnect.BaseActivity
import com.squareuptest.employeeconnect.BaseActivityModule
import com.squareuptest.employeeconnect.employeeslist.EmployeesFragment
import com.squareuptest.employeeconnect.employeeslist.EmployeesModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [BaseActivityModule::class, EmployeesModule::class])
interface AppComponent {
    fun inject(target: BaseActivity?)
    fun inject(target: EmployeesFragment?)
}