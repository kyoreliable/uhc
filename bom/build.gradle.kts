plugins {
  `java-platform`
}

dependencies {
  constraints {
    sequenceOf(":core", ":extension:adventure", ":extension:command:cloud").forEach {
      api(project(it))
    }
  }
}
