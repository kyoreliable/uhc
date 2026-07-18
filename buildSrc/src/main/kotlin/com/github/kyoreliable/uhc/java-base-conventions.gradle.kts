package com.github.kyoreliable.uhc

plugins.withType<JavaPlugin> {
  extensions.getByType<JavaPluginExtension>().apply {
    toolchain {
      languageVersion = JavaLanguageVersion.of(25)
    }
  }
}
