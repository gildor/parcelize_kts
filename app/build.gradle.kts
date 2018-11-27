plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(28)

    defaultConfig {
        applicationId = "io.qnips.parcelize"

        minSdkVersion(14)
        targetSdkVersion(28)

        versionCode = 1
        versionName = "1.0"
    }
}

androidExtensions {
    isExperimental = true
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.10")
}
