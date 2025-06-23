package me.doug.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.doug.todolist.model.Todo;
import me.doug.todolist.service.TodoService;

@RestController
@RequestMapping("/api/todo")
@CrossOrigin
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping()
    public List<Todo> getAll() {
        return todoService.findAll();
    }

    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return todoService.save(todo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        todoService.delete(id);
    }

}
