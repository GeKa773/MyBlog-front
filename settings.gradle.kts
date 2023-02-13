pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MyBlog-front"
include(":androidApp")
include(":common:user:api")
include(":common:user:presentation")
include(":common:user:data")
include(":common:user:compose")
include(":common:blog:api")
include(":common:blog:presentation")
include(":common:blog:data")
include(":common:blog:compose")
include(":common:core")
include(":common:umbrella-compose")
include(":common:umbrella-ios")