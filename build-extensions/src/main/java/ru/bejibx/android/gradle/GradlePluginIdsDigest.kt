package ru.bejibx.android.gradle

object GradlePluginIdsDigest {

    object Android {
        const val application = "com.android.application"
        const val library = "com.android.library"

        operator fun contains(element: String): Boolean {
            return element == application || element == library
        }
    }

    object Kotlin {
        const val android = "android"
        const val androidExtensions = "android.extensions"
        const val java = "jvm"
        const val annotationProcessor = "kapt"

        operator fun contains(element: String): Boolean {
            return element.startsWith("org.jetbrains.kotlin")
        }
    }

    object Java {
        const val library = "java-library"
    }
}