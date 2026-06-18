plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.compose.compiler)
}

group = "com.example.app"
version = "0.0.1"

kotlin {
    jvmToolchain(libs.versions.jvm.toolchain.get().toInt())
}

android {
    namespace = "$group"

    compileSdk = libs.versions.android.sdk.compile.get().toInt()
    defaultConfig {
        applicationId = "$group"

        minSdk = libs.versions.android.sdk.min.get().toInt()
        targetSdk = libs.versions.android.sdk.target.get().toInt()

        versionCode = libs.versions.smarthome.app.code.get().toInt()
        versionName = "$version"
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(projects.shared.library)

    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.appcompat)

    implementation(libs.koin.compose)
    implementation(libs.koin.compose.viewmodel)
}
