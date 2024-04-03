package com.squareuptest.employeeconnect.employeeslist

import com.squareuptest.employeeconnect.employeeslist.adapters.EmployeesListAdapter
import com.squareuptest.employeeconnect.employeeslist.employeesdata.EmployeeList
import com.squareuptest.employeeconnect.employeeslist.employeesdata.employees

interface EmployeesContract {
    interface View {
        fun setDataToRecyclerView(employees: List<employees>, employeesAdapter: EmployeesListAdapter)
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