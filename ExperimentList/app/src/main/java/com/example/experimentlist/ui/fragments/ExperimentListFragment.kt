package com.example.experimentlist.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider

import com.example.experimentlist.R
import com.example.experimentlist.ui.viewmodel.ExperimentListViewModel

class ExperimentListFragment : Fragment() {

    companion object {
        fun newInstance() = ExperimentListFragment()
    }

    private lateinit var viewModel: ExperimentListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.experiment_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ExperimentListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
