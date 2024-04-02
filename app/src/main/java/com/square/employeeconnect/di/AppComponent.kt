package com.square.employeeconnect.di

import com.square.employeeconnect.MainActivity
import com.square.employeeconnect.MainActivityModule
import com.square.employeeconnect.employeeslist.EmployeesContract
import com.square.employeeconnect.employeeslist.EmployeesFragment
import com.square.employeeconnect.employeeslist.EmployeesModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MainActivityModule::class, EmployeesModule::class])
interface AppComponent {
   fun inject(target: MainActivity?)
   fun inject(target: EmployeesFragment?)
}