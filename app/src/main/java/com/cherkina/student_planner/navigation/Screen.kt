package com.cherkina.student_planner.navigation

import javax.security.auth.Subject

sealed class Screen(val route: String){
    object Home: Screen("home")
    object Details: Screen("details/{subjectId}"){
        fun createRoute(subject: String)="details/$subject"
    }
    object Prifile: Screen("profile")
    object Settings: Screen("settings")
    object Schedule: Screen("schedule")

}