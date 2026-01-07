plugins {
    java
    alias(libs.plugins.lombok)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(libs.versions.java.version.get())
    }
}

dependencies {
    // testing
    testImplementation(platform(libs.junit.bom))

    testImplementation(libs.junit.jupiter.api)
    testRuntimeOnly(libs.junit.jupiter.engine)
    testRuntimeOnly(libs.junit.platform.launcher)
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
