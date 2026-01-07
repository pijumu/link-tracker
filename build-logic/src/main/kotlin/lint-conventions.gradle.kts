plugins {
    checkstyle
    alias(libs.plugins.spotless)
}


checkstyle {
    toolVersion = libs.versions.checkstyle.version.get()
    configFile = layout.settingsDirectory
        .file("gradle/config/checkstyle/google-checks.xml")
        .asFile
    maxWarnings = 0
    maxErrors = 0
}

spotless {
    java {
        googleJavaFormat()
    }
}