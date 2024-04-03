package com.square.employeeconnect.employeeslist

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
import com.square.employeeconnect.R
import com.square.employeeconnect.di.App
import com.square.employeeconnect.employeeslist.adapters.EmployeesListAdapter
import com.square.employeeconnect.employeeslist.employeesdata.employees
import javax.inject.Inject

class EmployeesFragment : Fragment(), EmployeesContract.View, OnRefreshListener,
    EmployeesListAdapter.OnItemClickListener {

    lateinit var employeesListAdapter: EmployeesListAdapter
    lateinit var employeesRecyclerView: RecyclerView
    lateinit var emptyView: LinearLayout
    lateinit var apiLoader: ProgressBar
    lateinit var mSwipeRefreshLayout: SwipeRefreshLayout

    @Inject
    lateinit var presenter: EmployeesContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Dagger setup
        (requireActivity().application as App).getComponent()?.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_employees, container, false)

        //Setup all the views on the fragment
        employeesRecyclerView = rootView.findViewById(R.id.recyclerViewEmployees)
        mSwipeRefreshLayout = rootView.findViewById(R.id.swipe_refresh_layout)
        emptyView = rootView.findViewById(R.id.emptyView)
        apiLoader = rootView.findViewById(R.id.apiLoader)

        //Setting up the pull-to-refresh
        mSwipeRefreshLayout.setOnRefreshListener(this)
        employeesListAdapter = EmployeesListAdapter(context, ArrayList(), this)

        employeesRecyclerView.layoutManager = LinearLayoutManager(context)

        //Setting up the adapter for recycler view
        employeesRecyclerView.adapter = employeesListAdapter
        presenter.setAdapter(employeesListAdapter)
        presenter.setView(this)
        presenter.requestDataFromServer()
        mSwipeRefreshLayout.setOnRefreshListener {
            // Perform API call when user pulls to refresh
            presenter.requestDataFromServer()
            mSwipeRefreshLayout.isRefreshing = false
        }
        apiLoader.visibility = View.VISIBLE
        employeesRecyclerView.visibility = View.GONE
        emptyView.visibility = View.GONE
        return rootView
    }

    override fun setDataToRecyclerView(
        employees: List<employees>,
        employeesAdapter: EmployeesListAdapter
    ) {
        //Showing the Employees list when it has been received from the API call and it is not empty
        apiLoader.visibility = View.GONE
        employeesRecyclerView.visibility = View.VISIBLE
        employeesAdapter.setAdapter(employees)
    }

    override fun onResponseFailure(message: String) {
        //Showing the error message after API call
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

    override fun showRefreshingIndicator() {
        mSwipeRefreshLayout.isRefreshing = true
    }

    override fun hideRefreshingIndicator() {
        mSwipeRefreshLayout.isRefreshing = false
    }

    override fun showEmptyView() {
        //Showing the empty view incase of API failure, empty response or malformed employee details
        apiLoader.visibility = View.GONE
        emptyView.visibility = View.VISIBLE
    }

    override fun onRefresh() {
        // Not required for this implementation
    }

    override fun onItemClick(employee: employees) {
        //Showing Employee Biography for each employees on clicking the list item.
        Toast.makeText(context, "Employee Biography: ${employee.biography}", Toast.LENGTH_LONG)
            .show()
    }

}