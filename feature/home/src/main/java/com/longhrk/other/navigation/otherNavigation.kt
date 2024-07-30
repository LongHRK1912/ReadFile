package com.longhrk.other.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.longhrk.other.OtherScreen

const val OTHER_ROUTE = "other_route"

fun NavController.navigateToOther(navOptions: NavOptions? = null) =
    navigate(OTHER_ROUTE, navOptions)

fun NavGraphBuilder.otherScreen(
) {
    composable(
        route = OTHER_ROUTE,
    ) {
        OtherScreen()
    }
}
