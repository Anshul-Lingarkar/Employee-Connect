package com.square.employeeconnect.employeeslist

import com.square.employeeconnect.employeeslist.adapters.EmployeesListAdapter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class EmployeesModule() {
    @Provides
    fun provideEmployeesPresenter(): EmployeesContract.Presenter {
        return EmployeesPresenter()
    }

    @Provides
    fun provideEmployeesModel(): EmployeesModel {
        return EmployeesModel()
    }

}