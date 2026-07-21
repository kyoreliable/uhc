package com.github.kyoreliable.uhc.dominion;

import com.github.kyoreliable.uhc.UltraHardcore;
import com.github.kyoreliable.uhc.dominion.qualifier.UltraHardcoreDominion;
import com.github.kyoreliable.uhc.dominion.scheduler.DominionSchedulerGuiceModule;
import com.google.inject.AbstractModule;
import dev.dominion.ecs.api.Dominion;

public final class DominionGuiceModule extends AbstractModule {

  @Override
  protected void configure() {
    this.bind(Dominion.class)
        .annotatedWith(UltraHardcoreDominion.class)
        .toInstance(Dominion.create(UltraHardcore.NAMESPACE));

    this.install(new DominionSchedulerGuiceModule());
  }
}
