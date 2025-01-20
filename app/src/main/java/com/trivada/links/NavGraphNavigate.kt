package com.trivada.links

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.trivada.links.screens.MainScreen

@Composable
fun NavGraphNavigate(context : Context, navController: NavHostController) {
    NavHost(navController = navController, startDestination = "MainScreen") {
        composable("MainScreen") {
            MainScreen(navController = navController)
        }
//        composable(route = "DetailsScreen/{title}/{content}",
//            arguments = listOf(
//                navArgument("title") { type = NavType.StringType },
//                navArgument("content") { type = NavType.StringType })
//        ) {
//            backStackEntry ->
//            val title = backStackEntry.arguments?.getString("title") ?: ""
//            val content = backStackEntry.arguments?.getString("content") ?: ""
//            DetailsScreen(navController, title, content)
//        }
    }
}




