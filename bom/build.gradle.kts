plugins {
  `java-platform`
}

javaPlatform {
  allowDependencies()
}

dependencies {
  constraints {
    api(libs.jspecify)
  }
}
