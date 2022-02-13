package com.davidholas.bgtr.service;

import com.davidholas.bgtr.persistence.model.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectService {

    List<Project> findProjects();
}
