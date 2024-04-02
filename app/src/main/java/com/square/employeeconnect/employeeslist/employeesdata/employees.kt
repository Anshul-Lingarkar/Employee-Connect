package com.square.employeeconnect.employeeslist.employeesdata

data class employees(
    var uuid: String,
    var full_name: String,
    var phone_number: String?,
    var email_address: String,
    var biography: String,
    var photo_url_small: String?,
    var photo_url_large: String?,
    var team: String,
    var employee_type: EmployeeType       //Need to make a enum
)

enum class EmployeeType {
    FULL_TIME,
    PART_TIME,
    CONTRACTOR
}