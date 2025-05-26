package com.shashank.todo_app.Services;

import com.shashank.todo_app.Models.Todo;
import com.shashank.todo_app.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void deleteTodo(int id) {
        todoRepository.deleteTodo(id);
    }

    public void addTodo(String description, LocalDate targetDate) {
        todoRepository.saveObject(description , targetDate);
    }

    public Todo getById(int id) {
        return todoRepository.getById(id);
    }

    public List<Todo> getTodos() {
        return todoRepository.getAllTodos();
    }
}
