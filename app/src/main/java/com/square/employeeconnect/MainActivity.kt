package com.square.employeeconnect

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.square.employeeconnect.employeeslist.EmployeesFragment

class MainActivity : AppCompatActivity(), MainActivityContract.View {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, EmployeesFragment())
            .commit()
    }

    override fun refresh() {
        // To Do - pull to refresh
    }
}