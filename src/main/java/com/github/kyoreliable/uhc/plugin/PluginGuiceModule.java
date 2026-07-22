package com.github.kyoreliable.uhc.plugin;

import com.google.inject.AbstractModule;
import org.bukkit.plugin.Plugin;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class PluginGuiceModule extends AbstractModule {

  private final Plugin plugin;

  public PluginGuiceModule(final Plugin plugin) {
    this.plugin = plugin;
  }

  @Override
  protected void configure() {
    this.bind(Plugin.class).annotatedWith(UltraHardcorePlugin.class).toInstance(this.plugin);
  }
}
