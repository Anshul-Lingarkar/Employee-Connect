package com.square.employeeconnect

import com.square.employeeconnect.employeeslist.EmployeesContract
import com.square.employeeconnect.employeeslist.EmployeesFragment
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {
    @Provides
    fun provideMainActivityPresenter(): MainActivityContract.Presenter {
        return MainActivityPresenter()
    }
}