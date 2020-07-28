package ru.bejibx.android.gradle

object VersionsDigest {

    /**
     * Gradle is an open-source build automation tool focused on flexibility and performance.
     *
     * [Documentation](https://docs.gradle.org/current/userguide/userguide.html)
     *
     * [Github](https://github.com/gradle/gradle)
     *
     * [Apache 2.0 License](https://github.com/gradle/gradle/blob/master/LICENSE)
     *
     * [Changelog](https://gradle.org/releases/)
     */
    const val gradle = "6.5.1"

    /**
     * [Changelog](https://github.com/JetBrains/kotlin/blob/master/ChangeLog.md)
     */
    const val kotlin = "1.3.72"

    /**
     * [Changelog](https://developer.android.com/studio/releases/gradle-plugin)
     */
    const val androidGradlePlugin = "4.0.1"

    /**
     * [Documentation](https://developer.android.com/jetpack/androidx)
     *
     * Latest versions of each packet can be found [here](https://developer.android.com/jetpack/androidx/versions).
     *
     * Latest releases can be found [here](https://developer.android.com/jetpack/androidx/versions/stable-channel).
     */
    object AndroidX {

        /**
         * [androidx.tech](https://androidx.tech/artifacts/core/core-ktx/)
         *
         * [Changelog](https://developer.android.com/jetpack/androidx/releases/core)
         */
        const val coreKtx = "1.3.1"

        /**
         * [androidx.tech](https://androidx.tech/artifacts/appcompat/appcompat/)
         *
         * [Changelog](https://developer.android.com/jetpack/androidx/releases/appcompat)
         */
        const val appcompat = "1.1.0"
    }
}

object DependenciesDigest {

    const val androidGradlePlugin = "com.android.tools.build:gradle:${VersionsDigest.androidGradlePlugin}"

    object Kotlin {

        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${VersionsDigest.kotlin}"

        object StdLib {
            const val jdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${VersionsDigest.kotlin}"
            const val jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${VersionsDigest.kotlin}"
        }
    }

    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:${VersionsDigest.AndroidX.appcompat}"
        const val coreKtx = "androidx.core:core-ktx:${VersionsDigest.AndroidX.coreKtx}"
    }
}