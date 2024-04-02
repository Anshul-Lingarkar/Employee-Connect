package com.square.employeeconnect.employeeslist.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.square.employeeconnect.R
import com.square.employeeconnect.employeeslist.employeesdata.employees

class EmployeesListAdapter(var context: Context?, var employeesList: List<employees>): RecyclerView.Adapter<EmployeesListAdapter.EmployeesListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeesListViewHolder {
        val employeesView = LayoutInflater.from(context).inflate(R.layout.employees_card_view, parent, false)
        return EmployeesListViewHolder(employeesView, context)
    }

    override fun getItemCount(): Int {
        return employeesList.size
    }

    override fun onBindViewHolder(holder: EmployeesListViewHolder, position: Int) {
        val pos = employeesList.get(position)
        holder.bind(pos)
    }

    fun setAdapter(list: List<employees>) {
        employeesList = list
        notifyDataSetChanged()
    }

    class EmployeesListViewHolder(itemView: View, private var context: Context?) : RecyclerView.ViewHolder(itemView) {
        fun bind(empl: employees) {
            itemView.findViewById<TextView>(R.id.employeeName).text = empl.full_name
            itemView.findViewById<TextView>(R.id.employeeTeam).text = empl.team
            var profile = itemView.findViewById<ImageView>(R.id.employeePhoto)
            context?.let {
                Glide.with(it)
                    .load(empl.photo_url_large)
                    .into(profile)
            }
        }
    }
}
