package com.example.experimentlist.data

class DataProvider {
    fun getData():List<Experiment> =
        listOf(
            Experiment("exp_1_this_will_be_super_super_super_super_long","treatment_1_this_will_be_super_super_super_super_long"),
            Experiment("exp_2_this_will_be_super_super_super_super_long","treatment_2"),
            Experiment("exp_3","treatment_3_this_will_be_super_super_super_super_long"),
            Experiment("exp_4_this_will_be_super_super_super_super_long","treatment_4"),
            Experiment("exp_5","treatment_5_this_will_be_super_super_super_super_long"),
            Experiment("exp_6_this_will_be_super_super_super_super_long","treatment_6")
        )
}