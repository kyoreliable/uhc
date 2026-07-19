plugins {
  com.github.kyoreliable.uhc.`java-library-conventions`
}

dependencies {
  api(platform(project(":bom")))

  api(platform(libs.guava.bom))
  api(libs.bundles.guava)

  api(platform(libs.guice.bom))
  api(libs.bundles.guice)
}
