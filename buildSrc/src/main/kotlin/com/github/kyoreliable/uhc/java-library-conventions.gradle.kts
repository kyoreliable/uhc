package com.github.kyoreliable.uhc

plugins {
  `java-library`

  id("com.github.kyoreliable.uhc.java-base-conventions")
  id("com.github.kyoreliable.uhc.java-maven-publish-conventions")
}

java {
  withSourcesJar()
  withJavadocJar()
}
