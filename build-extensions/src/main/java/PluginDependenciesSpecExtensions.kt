import org.gradle.kotlin.dsl.kotlin
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec
import ru.bejibx.android.gradle.GradlePluginIdsDigest as Plugins

val PluginDependenciesSpec.androidApplication: PluginDependencySpec
    get() = id(Plugins.Android.application)

val PluginDependenciesSpec.androidLibrary: PluginDependencySpec
    get() = id(Plugins.Android.library)

val PluginDependenciesSpec.kotlinAndroid: PluginDependencySpec
    get() = kotlin(Plugins.Kotlin.android)

val PluginDependenciesSpec.kotlinAndroidExtensions: PluginDependencySpec
    get() = kotlin(Plugins.Kotlin.androidExtensions)

val PluginDependenciesSpec.kotlinJvm: PluginDependencySpec
    get() = kotlin(Plugins.Kotlin.java)

val PluginDependenciesSpec.kotlinApt: PluginDependencySpec
    get() = kotlin(Plugins.Kotlin.annotationProcessor)

val PluginDependenciesSpec.javaLibrary: PluginDependencySpec
    get() = id(Plugins.Java.library)