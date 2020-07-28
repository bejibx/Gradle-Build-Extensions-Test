import ru.bejibx.android.gradle.VersionsDigest as Versions

tasks.wrapper {
    gradleVersion = Versions.gradle
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}