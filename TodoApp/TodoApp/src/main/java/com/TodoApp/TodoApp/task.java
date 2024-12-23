package com.TodoApp.TodoApp;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="todotask")
public class task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private boolean completed;
    public task() {
    }
    public task(long id, String description, boolean completed) {
        this.id = id;
        this.description = description;
        this.completed = completed;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    /*public void save(task t) {
        
        //throw new UnsupportedOperationException("Unimplemented method 'save'");
    }*/
    
    
}
