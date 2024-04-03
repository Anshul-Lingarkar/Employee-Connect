package com.squareuptest.employeeconnect.network

import com.squareuptest.employeeconnect.employeeslist.employeesdata.EmployeeList
import retrofit2.Call
import retrofit2.http.GET

interface EmployeeService {
    @GET("employees.json")
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

    //Failure response
    @GET("employees_.json")
    fun getEmployees(): Call<EmployeeList>
     */
}