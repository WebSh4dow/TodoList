package com.jarmison.todolistDesafio.controller;

import com.jarmison.todolistDesafio.model.Task;
import com.jarmison.todolistDesafio.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TaskController {
    @Autowired
    TaskService taskService;

    @PostMapping("/tasks")
    @ResponseStatus(HttpStatus.CREATED)

    public Task createdTask(@RequestBody Task task) {
        return taskService.createdTask(task);

    }

    @GetMapping("/tasks")
    @ResponseStatus(HttpStatus.OK)

    public List<Task>getAllTasks(){
        return taskService.listAllTask();
        }

    @GetMapping("/tasks/{id}")
    @ResponseStatus(HttpStatus.OK)

    public ResponseEntity<Task> getTaskById(@PathVariable(value = "id") Long id){
        return taskService.findTaskById(id);
    }

    @PutMapping("/tasks/{id}")
    @ResponseStatus(HttpStatus.OK)

    public ResponseEntity<Task>updateTaskById(@PathVariable(value = "id") Long id, @RequestBody Task task){
        return taskService.updateTaskById(task,id);
    }


    @DeleteMapping ("/tasks/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)

    public ResponseEntity<Object> deleteTaskById(@PathVariable(value = "id") Long id){
        return taskService.deletedById(id);
    }

    }

