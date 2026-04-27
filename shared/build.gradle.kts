import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
}

kotlin {
    applyDefaultHierarchyTemplate()

    android {
        namespace = "tech.annexflow.kotlin.swift.playground"

        compileSdk {
            version = release(37)
        }

        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_21)
        }
    }

    iosArm64()
    iosSimulatorArm64()

    swiftPMDependencies {
        @Suppress("OPT_IN_USAGE")
        localSwiftPackage(
            directory = project.layout.projectDirectory.dir("SwiftExportPackage"),
            products = listOf("SwiftExportPackage"),
        )
    }

    swiftExport {
        moduleName = "SharedKit"
        flattenPackage = "tech.annexflow.kotlin.swift.playground"
    }
}
