package com.example.experimentlist.ui.adapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.experimentlist.R
import com.example.experimentlist.data.Experiment
import kotlinx.android.synthetic.main.experiment_row.view.*

class ExperimentListAdapter(var data:List<Experiment>) : RecyclerView.Adapter<ExperimentListAdapter.ExperimentViewHolder>() {

    class ExperimentViewHolder(v:View) : RecyclerView.ViewHolder(v)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExperimentViewHolder {
        return ExperimentViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.experiment_row, parent, false))
    }

    override fun onBindViewHolder(holder: ExperimentViewHolder, position: Int) {
        holder.itemView.txtExpName.text = data[position].experimentName
        holder.itemView.txtTreatmentName.text = data[position].treatmentName
    }

    override fun getItemCount(): Int {
        return data.size
    }
}