package com.example.taskbasicsinspring;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
class TaskController {

    private TasksService tasksService;

    TaskController(){tasksService = new TasksService();}

    @GetMapping("/tasks/viewTasks")
    public List<Tasks> viewTasks(){
        return tasksService.getTasks();
    }

    @PostMapping("/tasks/addTasks")
    public void addTasks(@RequestBody Tasks task){
        System.out.println(task.getId());
        tasksService.addTask(task);
    }

    @DeleteMapping("/tasks/deleteTasks/{id}")
    public boolean deleteTask(@PathVariable int id){

        return tasksService.deleteTask(id);

    }
}
