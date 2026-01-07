import com.github.spotbugs.snom.Effort

plugins {
    alias(libs.plugins.spotbugs)
}

dependencies {
    spotbugsPlugins(libs.findsecbugs)
    spotbugsPlugins(libs.bug.pattern)
}


spotbugs {
    showProgress = true
    effort = Effort.MAX
    excludeFilter = layout.settingsDirectory
        .file("gradle/config/spotbugs/spotbugs-excludes.xml")
        .asFile
}