package com.example.experimentlist.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.experimentlist.data.DataProvider
import com.example.experimentlist.data.Experiment

class ExperimentListViewModel : ViewModel() {
    fun getExperimentList():List<Experiment> = DataProvider().getData()
}
