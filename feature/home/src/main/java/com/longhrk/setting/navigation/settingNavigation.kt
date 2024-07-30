package com.longhrk.setting.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.longhrk.other.OtherScreen
import com.longhrk.setting.SettingScreen

const val SETTING_ROUTE = "setting_route"

fun NavController.navigateToSetting(navOptions: NavOptions? = null) =
    navigate(SETTING_ROUTE, navOptions)

fun NavGraphBuilder.settingScreen(
) {
    composable(
        route = SETTING_ROUTE,
    ) {
        SettingScreen()
    }
}
