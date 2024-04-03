package com.squareuptest.employeeconnect.employeeslist

import com.squareuptest.employeeconnect.employeeslist.adapters.EmployeesListAdapter
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