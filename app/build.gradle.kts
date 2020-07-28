import ru.bejibx.android.gradle.DependenciesDigest as Deps

plugins {
    androidApplication
    kotlinAndroid
    kotlinAndroidExtensions
}

android {
    compileSdkVersion(29)

    defaultConfig {
        applicationId = "ru.bejibx.android.gradle"
        minSdkVersion(21)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(Deps.Kotlin.StdLib.jdk7)
    implementation(Deps.AndroidX.appcompat)
    implementation(Deps.AndroidX.coreKtx)
}