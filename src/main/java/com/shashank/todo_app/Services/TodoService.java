package com.shashank.todo_app.Services;

import com.shashank.todo_app.Repositories.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();
    private static int counter = 0;

    static {
        todos.add(new Todo(++counter , "Shashank" , "SpringBoot" , LocalDate.now().plusYears(1) , false));
        todos.add(new Todo(++counter , "Shashank" , "Java" , LocalDate.now().plusYears(2) , false));
        todos.add(new Todo(++counter , "Shashank" , "Azure" , LocalDate.now().plusYears(3) , false));
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public void addTodo(String description) {
        todos.add(new Todo(++counter , "Shashank" , description , LocalDate.now().plusYears(3) , false));
    }

    public void deleteTodo(int id) {

        todos.removeIf(todo -> todo.getId() == id);
    }
}
