plugins {
  com.github.kyoreliable.uhc.`java-library-conventions`
}

dependencies {
  api(platform(libs.guava.bom))
  compileOnlyApi(libs.bundles.guava)

  api(platform(libs.guice.bom))
  compileOnlyApi(libs.bundles.guice)

  compileOnlyApi(libs.jspecify)

  compileOnlyApi(libs.spigot.api) {
    exclude("commons-lang", "commons-lang")
    exclude("com.google.code.gson", "gson")
    exclude("org.yaml", "snakeyaml")
  }

  compileOnlyApi(libs.dominion.ecs.engine)
}
