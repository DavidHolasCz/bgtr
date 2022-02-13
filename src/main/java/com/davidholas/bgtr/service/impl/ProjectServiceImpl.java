package com.davidholas.bgtr.service.impl;

import com.davidholas.bgtr.persistence.model.Project;
import com.davidholas.bgtr.persistence.repository.ProjectRepository;
import com.davidholas.bgtr.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public List<Project> findProjects() {
        return projectRepository.findAll();
    }
}
