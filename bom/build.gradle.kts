plugins {
  `java-platform`
}

javaPlatform {
  allowDependencies()
}

dependencies {
  constraints {
    sequenceOf(":core", ":extension:adventure").forEach {
      api(project(it))
    }
  }
}
