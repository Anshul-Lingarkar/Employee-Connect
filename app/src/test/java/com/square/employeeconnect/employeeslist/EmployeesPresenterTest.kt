package com.square.employeeconnect.employeeslist

import com.square.employeeconnect.employeeslist.employeesdata.EmployeeList
import com.square.employeeconnect.employeeslist.employeesdata.EmployeeType
import com.square.employeeconnect.employeeslist.employeesdata.employees
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.Mockito.`when`

class EmployeesPresenterTest {

    lateinit var presenter: EmployeesPresenter
    lateinit var view: EmployeesFragment

    @Before
    fun initial_setup() {
        presenter = EmployeesPresenter()
        view = EmployeesFragment()
    }

    fun getWelformedEmployeesData(): EmployeeList {
        val employees = arrayListOf(
            employees(
                uuid = "0d8fcc12-4d0c-425c-8355-390b312b909c",
                fullName = "Justine Mason",
                phoneNumber = "5553280123",
                emailAddress = "jmason.demo@squareup.com",
                biography = "Engineer on the Point of Sale team.",
                photoUrlSmall = "https://s3.amazonaws.com/sq-mobile-interview/photos/16c00560-6dd3-4af4-97a6-d4754e7f2394/small.jpg",
                photoUrlLarge = "https://s3.amazonaws.com/sq-mobile-interview/photos/16c00560-6dd3-4af4-97a6-d4754e7f2394/large.jpg",
                team = "Point of Sale",
                employeeType = EmployeeType.FULL_TIME
            ),
            employees(
                uuid = "a98f8a2e-c975-4ba3-8b35-01f719e7de2d",
                fullName = "Camille Rogers",
                phoneNumber = "5558531970",
                emailAddress = "crogers.demo@squareup.com",
                biography = "Designer on the web marketing team.",
                photoUrlSmall = "https://s3.amazonaws.com/sq-mobile-interview/photos/5095a907-abc9-4734-8d1e-0eeb2506bfa8/small.jpg",
                photoUrlLarge = "https://s3.amazonaws.com/sq-mobile-interview/photos/5095a907-abc9-4734-8d1e-0eeb2506bfa8/large.jpg",
                team = "Public Web & Marketing",
                employeeType = EmployeeType.PART_TIME
            ),
            employees(
                uuid = "8623ba77-9d6a-4bcd-bd91-e19ae2c9dba2",
                fullName = "Ryan Gehani",
                phoneNumber = "5558531970",
                emailAddress = "rgehani.demo@squareup.com",
                biography = "Product manager for Invoices!",
                photoUrlSmall = "https://s3.amazonaws.com/sq-mobile-interview/photos/7959987e-0d64-4bf6-8b9e-da78deac3457/small.jpg",
                photoUrlLarge = "https://s3.amazonaws.com/sq-mobile-interview/photos/7959987e-0d64-4bf6-8b9e-da78deac3457/large.jpg",
                team = "Point of Sale",
                employeeType = EmployeeType.PART_TIME
            )
        )
        return EmployeeList(employees)
    }

    fun getMalformedEmployeesData(): EmployeeList {
        val employees = arrayListOf(
            employees(
                uuid = "0d8fcc12-4d0c-425c-8355-390b312b909c",
                phoneNumber = "5553280123",
                emailAddress = "jmason.demo@squareup.com",
                biography = "Engineer on the Point of Sale team.",
                photoUrlSmall = "https://s3.amazonaws.com/sq-mobile-interview/photos/16c00560-6dd3-4af4-97a6-d4754e7f2394/small.jpg",
                photoUrlLarge = "https://s3.amazonaws.com/sq-mobile-interview/photos/16c00560-6dd3-4af4-97a6-d4754e7f2394/large.jpg",
                team = "Point of Sale",
                employeeType = EmployeeType.FULL_TIME
            ),
            employees(
                uuid = "a98f8a2e-c975-4ba3-8b35-01f719e7de2d",
                fullName = "Camille Rogers",
                emailAddress = "crogers.demo@squareup.com",
                biography = "Designer on the web marketing team.",
                photoUrlSmall = "https://s3.amazonaws.com/sq-mobile-interview/photos/5095a907-abc9-4734-8d1e-0eeb2506bfa8/small.jpg",
                photoUrlLarge = "https://s3.amazonaws.com/sq-mobile-interview/photos/5095a907-abc9-4734-8d1e-0eeb2506bfa8/large.jpg",
                team = "Public Web & Marketing",
                employeeType = EmployeeType.PART_TIME
            ),
            employees(
                uuid = "8623ba77-9d6a-4bcd-bd91-e19ae2c9dba2",
                fullName = "Ryan Gehani",
                phoneNumber = "5558531970",
                emailAddress = "rgehani.demo@squareup.com",
                biography = "Product manager for Invoices!",
                photoUrlSmall = "https://s3.amazonaws.com/sq-mobile-interview/photos/7959987e-0d64-4bf6-8b9e-da78deac3457/small.jpg",
                photoUrlLarge = "https://s3.amazonaws.com/sq-mobile-interview/photos/7959987e-0d64-4bf6-8b9e-da78deac3457/large.jpg",
                employeeType = EmployeeType.PART_TIME
            )
        )
        return EmployeeList(employees)
    }

    @Test
    fun `verify the checkWellFormedEmployeeList method in presenter`() {
        val employeeList = getWelformedEmployeesData()
        assertEquals(true, presenter.checkWellFormedEmployeeList(employeeList))
    }

    @Test
    fun `verify the checkWellFormedEmployeeList method in presenter with malformed data`() {
        val employeeList = getMalformedEmployeesData()
        assertEquals(false, presenter.checkWellFormedEmployeeList(employeeList))
    }
}