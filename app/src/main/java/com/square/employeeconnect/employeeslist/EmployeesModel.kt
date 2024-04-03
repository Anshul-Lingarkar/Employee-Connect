package com.square.employeeconnect.employeeslist

import android.util.Log
import com.square.employeeconnect.employeeslist.employeesdata.EmployeeList
import com.square.employeeconnect.network.ApiClient
import com.square.employeeconnect.network.EmployeeService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class EmployeesModel {
    fun getEmployees(listener: OnFinishedListener) {
        val apiService = ApiClient.getClient().create(EmployeeService::class.java)
        val call = apiService.getEmployees()
        call.enqueue(object : Callback<EmployeeList> {
            override fun onResponse(call: Call<EmployeeList>, response: Response<EmployeeList>) {
                if (response.isSuccessful) {
                    listener.onSuccess(response.body())
                } else {
                    listener.onFailure("Failed to fetch the employees data")
                }
            }

            override fun onFailure(call: Call<EmployeeList>, t: Throwable) {
                listener.onFailure(t.message ?: "Error in fetching the data")
            }
        })
    }

    interface OnFinishedListener {
        fun onSuccess(employees: EmployeeList?)
        fun onFailure(message: String)
    }
}