plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    // precompile plugins
    implementation(libs.lombok.plugin)
    implementation(libs.spring.boot.plugin)
    implementation(libs.spotbugs.plugin)
    implementation(libs.spotless.plugin)
}