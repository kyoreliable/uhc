package com.github.kyoreliable.uhc.dominion.scheduler;

import com.github.kyoreliable.uhc.dominion.UltraHardcoreDominion;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import dev.dominion.ecs.api.Dominion;
import dev.dominion.ecs.api.Scheduler;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class DominionSchedulerGuiceModule extends AbstractModule {

  @Provides
  @Singleton
  public Scheduler provideScheduler(final @UltraHardcoreDominion Dominion dominion) {
    return dominion.createScheduler();
  }
}
