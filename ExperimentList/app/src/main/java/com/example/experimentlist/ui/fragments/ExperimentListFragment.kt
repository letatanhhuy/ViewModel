package com.example.experimentlist.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.experimentlist.R
import com.example.experimentlist.data.Experiment
import com.example.experimentlist.ui.adapters.ExperimentListAdapter
import com.example.experimentlist.ui.viewmodels.ExperimentListViewModel
import kotlinx.android.synthetic.main.experiment_list_fragment.*



class ExperimentListFragment : Fragment() {

    private lateinit var viewModel: ExperimentListViewModel
    private lateinit var experimentListRecyclerView: RecyclerView
    private lateinit var experimentListAdapter: ExperimentListAdapter
    private val experimentLayoutManager = LinearLayoutManager(context)
    private lateinit var experimentList:List<Experiment>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.experiment_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ExperimentListViewModel::class.java)

        experimentList = viewModel.getExperimentList()
        experimentListAdapter = ExperimentListAdapter(experimentList)
        experimentListRecyclerView = expListRecyclerView

        experimentListRecyclerView.apply {
            layoutManager = experimentLayoutManager
            adapter = experimentListAdapter
        }

        searchExperimentView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextChange(newText: String?): Boolean {
                experimentList = if (newText.isNullOrEmpty()) {
                    viewModel.getExperimentList()
                } else {
                    viewModel.getExperimentList().filter {
                        it.experimentName.contains(newText)
                    }
                }
                experimentListAdapter.data = experimentList
                experimentListAdapter.notifyDataSetChanged()
                return true
            }

            override fun onQueryTextSubmit(query: String?): Boolean {
                experimentList = if (query.isNullOrEmpty()) {
                    viewModel.getExperimentList()
                } else {
                    viewModel.getExperimentList().filter {
                        it.experimentName.contains(query)
                    }
                }
                experimentListAdapter.notifyDataSetChanged()
                return true
            }
        })
    }

}
