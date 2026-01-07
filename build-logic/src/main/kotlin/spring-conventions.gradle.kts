plugins {
    id("java-common-conventions")
    alias(libs.plugins.spring.boot)
}

dependencies {
    implementation(platform(libs.spring.boot.bom))

    implementation(libs.spring.boot.starter.web)
    testImplementation(libs.spring.boot.starter.test)
}
