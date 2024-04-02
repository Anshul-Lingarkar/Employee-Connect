package com.square.employeeconnect.di

import com.square.employeeconnect.BaseActivity
import com.square.employeeconnect.BaseActivityModule
import com.square.employeeconnect.employeeslist.EmployeesFragment
import com.square.employeeconnect.employeeslist.EmployeesModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [BaseActivityModule::class, EmployeesModule::class])
interface AppComponent {
    fun inject(target: BaseActivity?)
    fun inject(target: EmployeesFragment?)
}