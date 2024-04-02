package com.square.employeeconnect.network

import com.square.employeeconnect.employeeslist.employeesdata.EmployeeList
import retrofit2.Call
import retrofit2.http.GET

interface EmployeeService {
    @GET("employees.json")
    fun getEmployees(): Call<EmployeeList>
}