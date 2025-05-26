package com.shashank.todo_app.Repositories;

import com.shashank.todo_app.Models.Todo;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Repository
public class TodoRepository {

    private EntityManager entityManager;

    @Autowired
    public TodoRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public void saveObject(String description , LocalDate targetDate) {
        System.out.println(description);
        Todo todo = new Todo(0 , "Shashank" , description , targetDate , false);
        entityManager.persist(todo);
    }

    public List<Todo> getAllTodos() {
        return entityManager.createQuery("SELECT t FROM Todo t", Todo.class).getResultList();
    }

    @Transactional
    public void deleteTodo(int id) {
        entityManager.remove(entityManager.find(Todo.class , id));
    }

    public Todo getById(int id) {
        Todo res = entityManager.find(Todo.class , 1);
        return res;
    }
}
