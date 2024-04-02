package com.square.employeeconnect.network

import com.square.employeeconnect.employeeslist.employeesdata.employees
import retrofit2.http.GET
import retrofit2.http.Path

interface EmployeeService {
    /*@GET("/users")
    suspend fun getUsers(
        @Query("per_page") per_page: Int,
        @Query("page") page: Int
    ): List<employees>*/

    @GET("/sq-mobile-interview/employees.json")
    suspend fun getEmployees(): List<employees>
}