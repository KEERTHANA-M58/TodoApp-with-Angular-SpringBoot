package com.TodoApp.TodoApp;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
@CrossOrigin
@RestController
public class taskcontroller {
    @Autowired
    private taskrepository repo;
    @GetMapping({"/hello"})
    public String helloworld(){
        return "welcome";
    }
    @PostMapping("/api/tasks")
    public task createtask(@RequestBody task t){
       repo.save(t);
        return t;
    }
    @GetMapping("/api/tasks")
    public List<task> getAllTask(){
        return repo.findAll();
    }
    @PutMapping("/api/tasks/{id}")
    public task updatetask(@PathVariable Long id, @RequestBody task t){
        t.setId(id);
        return repo.save(t);
    }
    @DeleteMapping("/api/tasks/{id}")
    public void deleteTask(@PathVariable Long id){
        repo.deleteById(id);
    }
}

    
 
   
