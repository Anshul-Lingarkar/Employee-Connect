package com.square.employeeconnect.employeeslist

interface EmployeesContract {
    interface View {
        fun refresh();
    }

    interface Presenter {
        fun getData();
    }

    interface Model {
        fun getEmployees()
    }
}