package com.TodoApp.TodoApp;
import org.springframework.data.jpa.repository.JpaRepository;
public interface taskrepository extends JpaRepository<task,Long> {    
}