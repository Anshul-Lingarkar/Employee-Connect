package com.squareuptest.employeeconnect

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.squareuptest.employeeconnect.BaseActivityContract
import com.squareuptest.employeeconnect.R
import com.squareuptest.employeeconnect.di.App
import com.squareuptest.employeeconnect.employeeslist.EmployeesFragment
import javax.inject.Inject

class BaseActivity : AppCompatActivity(), BaseActivityContract.View {

    @Inject
    lateinit var presenter: BaseActivityContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as App).getComponent()?.inject(this)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, EmployeesFragment())
            .commit()
        setContentView(R.layout.activity_main)
    }

    override fun launchEmployeesFragment() {
        //Do task called by presenter
    }
}