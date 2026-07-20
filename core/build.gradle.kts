plugins {
  com.github.kyoreliable.uhc.`java-library-conventions`
}

dependencies {
  api(platform(project(":bom")))

  api(platform(libs.guava.bom))
  compileOnlyApi(libs.bundles.guava)

  api(platform(libs.guice.bom))
  compileOnlyApi(libs.bundles.guice)

  compileOnlyApi(libs.jspecify)
  compileOnlyApi(libs.dominion.ecs.engine)
}
