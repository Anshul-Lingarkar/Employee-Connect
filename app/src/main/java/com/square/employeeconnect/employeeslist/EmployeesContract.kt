package com.square.employeeconnect.employeeslist

import com.square.employeeconnect.employeeslist.adapters.EmployeesListAdapter
import com.square.employeeconnect.employeeslist.employeesdata.EmployeeList
import com.square.employeeconnect.employeeslist.employeesdata.employees

interface EmployeesContract {
    interface View {
        fun setDataToRecyclerView(employees: EmployeeList?, employeesAdapter: EmployeesListAdapter)
        fun onResponseFailure(message: String)
        fun showRefreshingIndicator()
        fun hideRefreshingIndicator()
        fun showEmptyView()
    }

    interface Presenter {
        fun refreshData()
        fun setView(employeesView: EmployeesFragment)
        fun setAdapter(employeesAdapter: EmployeesListAdapter)
        fun requestDataFromServer()
        fun checkWellFormedEmployeeList(employees: EmployeeList?): Boolean
    }
}