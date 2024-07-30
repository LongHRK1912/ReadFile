plugins {
    alias(libs.plugins.longhrk.android.feature)
    alias(libs.plugins.longhrk.android.library.compose)
    alias(libs.plugins.longhrk.android.library.jacoco)
}
android {
    namespace = "com.longhrk.home"
}

dependencies {
    implementation(projects.core.data)
    implementation(projects.core.domain)

    testImplementation(projects.core.testing)

    androidTestImplementation(libs.bundles.androidx.compose.ui.test)
    androidTestImplementation(projects.core.testing)
}
