package com.davidholas.bgtr.persistence.repository;

import com.davidholas.bgtr.persistence.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
