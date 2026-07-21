plugins {
  `java-platform`
  `maven-publish`
}

dependencies {
  constraints {
    sequenceOf(":core", ":extension:adventure", ":extension:command:cloud").forEach {
      api(project(it))
    }
  }
}

publishing {
  publications {
    create<MavenPublication>("maven") {
      from(components["javaPlatform"])
    }
  }
}
