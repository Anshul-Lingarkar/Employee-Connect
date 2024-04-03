package com.squareuptest.employeeconnect.employeeslist.employeesdata

import com.google.gson.annotations.SerializedName

data class employees(
    @SerializedName("uuid") val uuid: String? = null,
    @SerializedName("full_name") val fullName: String? = null,
    @SerializedName("phone_number") val phoneNumber: String? = null,
    @SerializedName("email_address") val emailAddress: String? = null,
    @SerializedName("biography") val biography: String? = null,
    @SerializedName("photo_url_small") val photoUrlSmall: String? = null,
    @SerializedName("photo_url_large") val photoUrlLarge: String? = null,
    @SerializedName("team") val team: String? = null,
    @SerializedName("employee_type") val employeeType: EmployeeType? = null
)

data class EmployeeList(
    @SerializedName("employees") val employees: List<employees>
)

enum class EmployeeType {
    FULL_TIME,
    PART_TIME,
    CONTRACTOR
}