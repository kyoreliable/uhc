package com.github.kyoreliable.uhc

plugins {
  id("com.github.kyoreliable.uhc.java-library-conventions")
}

dependencies {
  compileOnly(project(":core"))
}
