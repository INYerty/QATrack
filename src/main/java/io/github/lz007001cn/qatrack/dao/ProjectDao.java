package io.github.lz007001cn.qatrack.dao;

import io.github.lz007001cn.qatrack.model.Project;
import java.util.Optional;

/** Row persistence without project authorization, counters or membership business rules. */
public interface ProjectDao {
    Optional<Project> findById(Long id);
    Optional<Project> findByKey(String projectKey);
    /** Generated ID, timestamps and version come from MySQL; those input fields are ignored. */
    Project insert(Project project);
    /** Updates name/description/status using id + lockVersion; key/creator/createdAt are immutable. */
    Project update(Project project);
}
