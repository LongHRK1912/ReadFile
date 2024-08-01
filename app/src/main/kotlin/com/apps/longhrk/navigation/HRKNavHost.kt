package com.apps.longhrk.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.apps.longhrk.ui.HRKAppState
import com.longhrk.home.navigation.HOME_ROUTE
import com.longhrk.home.navigation.homeScreen
import com.longhrk.other.navigation.otherScreen
import com.longhrk.setting.navigation.settingScreen

@Composable
fun HRKNavHost(
    appState: HRKAppState,
    onShowSnackbar: suspend (String, String?) -> Boolean,
    modifier: Modifier = Modifier,
    startDestination: String = HOME_ROUTE,
) {
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        homeScreen()
        otherScreen()
        settingScreen()
    }
}
