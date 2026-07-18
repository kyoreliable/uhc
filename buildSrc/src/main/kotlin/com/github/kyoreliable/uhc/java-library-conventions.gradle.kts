package com.github.kyoreliable.uhc

plugins {
  `java-library`
  id("com.github.kyoreliable.uhc.java-base-conventions")
}

java {
  withSourcesJar()
  withJavadocJar()
}
