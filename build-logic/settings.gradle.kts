plugins {
    id("dev.panuszewski.typesafe-conventions") version "0.10.0"
}

typesafeConventions {
    // enable or disable auto dependency for every alias(...) plugin declaration in a convention plugin
    // set it to 'false' if you prefer to add plugin marker dependencies manually (you can use the pluginMarker helper method for that)
    autoPluginDependencies = false
}