buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10")
        classpath(kotlin("gradle-plugin", version = "1.9.0"))
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}