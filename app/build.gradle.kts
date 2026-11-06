plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "app.kaleenbhaiya.tradingpltracker"
    compileSdk = 35

    defaultConfig {
        applicationId = "app.kaleenbhaiya.tradingpltracker"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
