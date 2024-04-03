package com.square.employeeconnect.employeeslist

import com.square.employeeconnect.employeeslist.adapters.EmployeesListAdapter
import com.square.employeeconnect.employeeslist.employeesdata.EmployeeList

class EmployeesPresenter() : EmployeesModel.OnFinishedListener, EmployeesContract.Presenter {

    lateinit var employeesListAdapter: EmployeesListAdapter
    var employeesModel: EmployeesModel = EmployeesModel()
    lateinit var employeesView: EmployeesFragment

    override fun setView(employeesView: EmployeesFragment) {
        this.employeesView = employeesView
    }

    override fun requestDataFromServer() {
        employeesModel.getEmployees(this)
    }

    override fun onSuccess(employees: EmployeeList?) {
        if (employees?.employees?.isEmpty() == true) {
            employeesView.showEmptyView()
        } else {
            //Logic here to check if EmployeeList is well formed
            val isWellFormed = checkWellFormedEmployeeList(employees)
            // Logic here to group and sort the EmployeeList and then send to adapter
            if (isWellFormed) {
                val sortedEmployeesList = employees?.employees?.sortedBy { it.team }
                employeesView.setDataToRecyclerView(
                    sortedEmployeesList ?: emptyList(),
                    employeesListAdapter
                )
            } else {
                employeesView.showEmptyView()
            }
        }
    }

    override fun checkWellFormedEmployeeList(employees: EmployeeList?): Boolean {
        if (employees?.employees != null) {
            for (employee in employees.employees) {
                if (employee.fullName.isNullOrBlank() ||
                    employee.phoneNumber.isNullOrBlank() ||
                    employee.team.isNullOrBlank()
                ) {
                    return false
                }
            }
        }
        return true
    }

    override fun setAdapter(employeesAdapter: EmployeesListAdapter) {
        employeesListAdapter = employeesAdapter
    }

    override fun onFailure(message: String) {
        employeesView.showEmptyView()
        employeesView.onResponseFailure(message)
    }

    override fun refreshData() {
        employeesView.showRefreshingIndicator()
        employeesView.hideRefreshingIndicator()
    }
}