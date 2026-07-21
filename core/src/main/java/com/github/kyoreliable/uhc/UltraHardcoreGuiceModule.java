package com.github.kyoreliable.uhc;

import com.google.inject.AbstractModule;
import org.bukkit.plugin.Plugin;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class UltraHardcoreGuiceModule extends AbstractModule {

  private final Plugin plugin;

  public UltraHardcoreGuiceModule(final Plugin plugin) {
    this.plugin = plugin;
  }

  @Override
  protected void configure() {
    this.bind(Plugin.class).annotatedWith(UltraHardcorePlugin.class).toInstance(this.plugin);
  }
}
