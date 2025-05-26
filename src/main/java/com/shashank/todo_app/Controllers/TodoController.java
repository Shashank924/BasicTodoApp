package com.shashank.todo_app.Controllers;

import com.shashank.todo_app.Models.Todo;
import com.shashank.todo_app.Services.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;

@Controller
@SessionAttributes("username")
public class TodoController {

    TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping( value = "/todos-page" , method = RequestMethod.GET)
    public String gotoTodosPage(ModelMap modelMap) {
        modelMap.put("Todos" , todoService.getTodos());
        return "todosPage";
    }

    @RequestMapping( value = "/add-todos" , method = RequestMethod.GET)
    public String addTodos(ModelMap modelMap) {
        modelMap.put("todo" , new Todo(0, (String) modelMap.get("name"),"Default Desc", LocalDate.now().plusYears(1) , false));
        return "add-todos";
    }

    @RequestMapping( value = "/add-todos" , method = RequestMethod.POST)
    public String goToTodosPage(ModelMap modelMap , Todo todo) {

        todoService.addTodo(todo.getDescription() , todo.getTargetDate());

        return "redirect:todos-page";
    }

    @RequestMapping("/delete-todo")
    public String deleteTodos(@RequestParam int id) {

        System.out.println(id);

        todoService.deleteTodo(id);

        return "redirect:todos-page";
    }

    @RequestMapping(value = "/update-todo" , method = RequestMethod.GET)
    public String updateTodos(ModelMap modelMap , @RequestParam int id) {
        Todo todo = todoService.getById(id);
        modelMap.put("todo" , todo);
        return "add-todos";
    }

    @RequestMapping(value = "/update-todo" , method = RequestMethod.POST)
    public String showUpdatedTodos(Todo todo) {

        todoService.deleteTodo(todo.getId());

        todoService.addTodo(todo.getDescription() , todo.getTargetDate());

        return "redirect:todos-page";
    }
}
