plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

version = "1.0"
group = "ru.bejibx.android.gradle"

gradlePlugin {
    plugins {
        create("gradleSettingsConfig") {
            id = "ru.bejibx.settings"
            implementationClass = "ru.bejibx.android.gradle.SettingsConfigurationPlugin"
        }
    }
}

rootProject.tasks.named("init") {
    dependsOn("refreshBuildExtensions")
}

rootProject.tasks.register<Copy>("refreshBuildExtensions") {

    val jarTask = tasks["jar"]
    check(jarTask != null) {
        "Failed to find \"jar\" task in build extensions child project!"
    }

    dependsOn(jarTask)
    from(jarTask.outputs)
    into(File(rootProject.projectDir, "libs"))
}