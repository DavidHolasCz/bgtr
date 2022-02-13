package com.davidholas.bgtr.web;

import com.davidholas.bgtr.api.ProjectsApi;
import com.davidholas.bgtr.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class ProjectController implements ProjectsApi {

    @Autowired
    private ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @Override
    public ResponseEntity<List> getProjects() {
        return ok(projectService.findProjects());
    }
}
