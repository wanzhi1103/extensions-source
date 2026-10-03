plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "eu.kanade.tachiyomi.extension.zh.lovemeizi"
    compileSdk = 35

    defaultConfig {
        minSdk = 21
    }
}

dependencies {
    implementation(project(":core"))
}
