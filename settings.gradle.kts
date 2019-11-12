pluginManagement {
    repositories {
        mavenCentral()
        maven { url = uri("https://kotlin.bintray.com/kotlin-eap") }
        maven { url = uri("https://plugins.gradle.org/m2/") }
    }
}

rootProject.name = "kute"

include("core")
include("ktor")
include("preferences")
include("preferences:api")