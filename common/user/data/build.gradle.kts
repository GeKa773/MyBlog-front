plugins {
    id("multiplatform-setup")
    id("android-setup")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                api(project(":common:user:api"))
                implementation(project(":common:core"))
            }
        }
    }
}