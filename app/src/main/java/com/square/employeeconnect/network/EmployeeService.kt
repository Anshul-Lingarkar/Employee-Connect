package com.square.employeeconnect.network

import com.square.employeeconnect.employeeslist.employeesdata.EmployeeList
import retrofit2.Call
import retrofit2.http.GET

interface EmployeeService {
    @GET("employees'.json")
    fun getEmployees(): Call<EmployeeList>

    /*
    For testing purposes
    //Correct response
    @GET("employees.json")
    fun getEmployees(): Call<EmployeeList>

    //Empty response
    @GET("employees_empty.json")
    fun getEmployees(): Call<EmployeeList>

    //Malformed response
    @GET("employees_malformed.json")
    fun getEmployees(): Call<EmployeeList>

    //Failure message
    @GET("employees_.json")
    fun getEmployees(): Call<EmployeeList>
     */
}