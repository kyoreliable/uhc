plugins {
  com.github.kyoreliable.uhc.`extension-conventions`
}

dependencies {
  api(platform(libs.cloud.bom))
  compileOnlyApi(libs.bundles.cloud)
}
