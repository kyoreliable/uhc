plugins {
  `java-platform`
}

javaPlatform {
  allowDependencies()
}

dependencies {
  constraints {
    sequenceOf(":core").forEach {
      api(project(it))
    }
  }
}
