plugins {
    id("multiplatform-setup")
    id("android-setup")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                api(project(":common:blog:api"))
                implementation(project(":common:core"))
            }
        }
    }
}