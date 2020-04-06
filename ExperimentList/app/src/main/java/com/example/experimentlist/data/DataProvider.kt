package com.example.experimentlist.data

class DataProvider {
    fun getData() {
        listOf<Data>(
            Data("exp_1","treatment_1"),
            Data("exp_2","treatment_2"),
            Data("exp_3","treatment_3"),
            Data("exp_4","treatment_4"),
            Data("exp_5","treatment_5"),
            Data("exp_6","treatment_6")
        )
        return
    }
}