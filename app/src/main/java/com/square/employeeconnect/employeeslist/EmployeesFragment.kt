package com.square.employeeconnect.employeeslist

import android.opengl.Visibility
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.square.employeeconnect.R
import com.square.employeeconnect.employeeslist.adapters.EmployeesListAdapter
import com.square.employeeconnect.employeeslist.employeesdata.EmployeeType
import com.square.employeeconnect.employeeslist.employeesdata.employees
import org.w3c.dom.Text

class EmployeesFragment : Fragment() {

    lateinit var employeesListAdapter: EmployeesListAdapter
    lateinit var employeesRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_employees, container, false)
        employeesRecyclerView = rootView.findViewById(R.id.recyclerViewEmployees)
        var sample = rootView.findViewById<TextView>(R.id.sampleText)
        employeesListAdapter = EmployeesListAdapter(context, ArrayList<employees>())

        //Check this do
        employeesRecyclerView.layoutManager = LinearLayoutManager(context)
        employeesRecyclerView.adapter = employeesListAdapter

        val employees = arrayListOf(
            employees(
                uuid = "0d8fcc12-4d0c-425c-8355-390b312b909c",
                full_name = "Justine Mason",
                phone_number = "5553280123",
                email_address = "jmason.demo@squareup.com",
                biography = "Engineer on the Point of Sale team.",
                photo_url_small = "https://s3.amazonaws.com/sq-mobile-interview/photos/16c00560-6dd3-4af4-97a6-d4754e7f2394/small.jpg",
                photo_url_large = "https://s3.amazonaws.com/sq-mobile-interview/photos/16c00560-6dd3-4af4-97a6-d4754e7f2394/large.jpg",
                team = "Point of Sale",
                employee_type = EmployeeType.FULL_TIME
            ),
            employees(
                uuid = "a98f8a2e-c975-4ba3-8b35-01f719e7de2d",
                full_name = "Camille Rogers",
                phone_number = "5558531970",
                email_address = "crogers.demo@squareup.com",
                biography = "Designer on the web marketing team.",
                photo_url_small = "https://s3.amazonaws.com/sq-mobile-interview/photos/5095a907-abc9-4734-8d1e-0eeb2506bfa8/small.jpg",
                photo_url_large = "https://s3.amazonaws.com/sq-mobile-interview/photos/5095a907-abc9-4734-8d1e-0eeb2506bfa8/large.jpg",
                team = "Public Web & Marketing",
                employee_type = EmployeeType.PART_TIME
            ),
            employees(
                uuid = "8623ba77-9d6a-4bcd-bd91-e19ae2c9dba2",
                full_name = "Ryan Gehani",
                phone_number = "5558531970",
                email_address = "rgehani.demo@squareup.com",
                biography = "Product manager for Invoices!",
                photo_url_small = "https://s3.amazonaws.com/sq-mobile-interview/photos/7959987e-0d64-4bf6-8b9e-da78deac3457/small.jpg",
                photo_url_large = "https://s3.amazonaws.com/sq-mobile-interview/photos/7959987e-0d64-4bf6-8b9e-da78deac3457/large.jpg",
                team = "Point of Sale",
                employee_type = EmployeeType.PART_TIME
            )
        )
        employees.sortBy {
            it.team
        }
        employeesListAdapter.setAdapter(employees)
        employeesRecyclerView.visibility = View.VISIBLE
        sample.visibility = View.GONE
        return rootView
    }

    companion object {

    }
}