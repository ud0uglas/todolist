package me.doug.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.doug.todolist.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
