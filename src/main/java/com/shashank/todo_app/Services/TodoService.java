package com.shashank.todo_app.Services;

import com.shashank.todo_app.Repositories.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public void addTodo(String description , LocalDate targetDate) {
        todos.add(new Todo(++counter , "Shashank" , description , targetDate , false));
    }

    public void deleteTodo(int id) {

        todos.removeIf(todo -> todo.getId() == id);
    }

    public Todo getById(int id) {

        Optional<Todo> res = todos.stream().filter(todo -> todo.getId() == id).findFirst();

        return res.orElse(null);
    }
}
