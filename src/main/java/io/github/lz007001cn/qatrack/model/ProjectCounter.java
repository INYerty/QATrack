package io.github.lz007001cn.qatrack.model;

/** Current persisted row; no business behavior. Generated fields come from MySQL. */
public record ProjectCounter(
        Long projectId,
        CounterEntityType entityType,
        Long nextValue) { }
