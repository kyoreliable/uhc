package com.github.kyoreliable.uhc

plugins {
  `maven-publish`
}

publishing {
  publications {
    create<MavenPublication>("maven") {
      from(components["java"])
    }
  }
}
