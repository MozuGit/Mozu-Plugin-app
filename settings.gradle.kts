pluginManagement {
    repositories {
        google()
        maven {
            url = uri("https://mirrors.tencent.com/nexus/repository/maven-tencent/")
        }
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.10.0"
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
        maven { url = uri("https://mirrors.tencent.com/nexus/repository/maven-tencent/") }
        maven { url = uri("https://mirrors.tencent.com/repository/maven/MLivePlatform") }
        maven { url = uri("https://mirrors.tencent.com/repository/maven/MLivePlatform-SNAPSHOT") }
    }
}

rootProject.name = "MozuPlugin"
include(":androidApp")
include(":shared")
include(":h5App")
include(":miniApp")