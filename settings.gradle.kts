buildscript {
    repositories {
        flatDir {
            dirs("${rootProject.projectDir}/libs/")
        }
    }
    dependencies {
        classpath(group = "ru.bejibx.android.gradle", name = "build-extensions", version = "1.0")
    }
}

apply(plugin = "ru.bejibx.settings")

include(":app", ":build-extensions")

rootProject.name = "gradle-build-extensions-test"