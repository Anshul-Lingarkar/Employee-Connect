package com.square.employeeconnect

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.square.employeeconnect.di.App
import com.square.employeeconnect.employeeslist.EmployeesFragment
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