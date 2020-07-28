package ru.bejibx.android.gradle

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings
import org.gradle.kotlin.dsl.maven
import ru.bejibx.android.gradle.DependenciesDigest as Deps
import ru.bejibx.android.gradle.GradlePluginIdsDigest as Plugins

class SettingsConfigurationPlugin : Plugin<Settings> {

    override fun apply(target: Settings) {
        target.pluginManagement {

            resolutionStrategy {
                eachPlugin {
                    val module = when (requested.id.id) {
                        in Plugins.Android -> Deps.androidGradlePlugin
                        in Plugins.Kotlin -> Deps.Kotlin.gradlePlugin
                        else -> null
                    }
                    if (module != null) {
                        useModule(module)
                    }
                }
            }

            repositories {
                google()
                jcenter()
                gradlePluginPortal()
                maven("https://plugins.gradle.org/m2/")
            }
        }
    }
}