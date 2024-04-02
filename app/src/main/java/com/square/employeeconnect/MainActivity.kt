package com.square.employeeconnect

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.square.employeeconnect.di.App
import com.square.employeeconnect.employeeslist.EmployeesFragment
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainActivityContract.View {

    @Inject
    lateinit var presenter: MainActivityContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //dependency injection
        (application as App).getComponent()?.inject(this)

        //AndroidInjection.inject(this)

        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, EmployeesFragment())
            .commit()
    }

    override fun onStart() {
        super.onStart()
        presenter.getData()
    }

    override fun refresh() {
        // To Do - pull to refresh
        Log.d("@@@@@@@@@@@@@@@@@@@", "Presenter and injection working correctly")
    }
}