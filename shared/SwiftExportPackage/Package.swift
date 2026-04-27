// swift-tools-version:5.9

import PackageDescription

let package = Package(
    name: "SwiftExportPackage",
    platforms: [.iOS("15.0")],
    products: [
        .library(name: "SwiftExportPackage", targets: ["SwiftExportPackage"]),
    ],
    targets: [
        .target(
            name: "SwiftExportPackage",
            path: "Sources",
        )
    ]
)
