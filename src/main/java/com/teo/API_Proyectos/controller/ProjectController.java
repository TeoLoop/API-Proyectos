package com.teo.API_Proyectos.controller;

import com.teo.API_Proyectos.model.Project;
import com.teo.API_Proyectos.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "*")  // PERMITE PETICIONES DESDE REACT
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping
    public List<Project> getProjects(){
        return projectRepository.findAll();
    }

    @PostMapping
    public Project save(@RequestBody Project project){
        return projectRepository.save(project);
    }

    @PutMapping
    public void update(@RequestBody Project project){
        projectRepository.save(project);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        projectRepository.deleteById(id);
    }


}
