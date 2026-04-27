package tech.annexflow.kotlin.swift.playground

import kotlinx.cinterop.ExperimentalForeignApi
import swiftPMImport.swift.export.import.playground.shared.SwiftExportTestClass

@OptIn(ExperimentalForeignApi::class)
fun test() {
    SwiftExportTestClass(value = "test")
}
