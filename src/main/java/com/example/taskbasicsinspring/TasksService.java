package com.example.taskbasicsinspring;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
class TasksService {

    //private final Tasks;
    private final HashMap<Integer , Tasks > map = new HashMap<>();
    public void addTask(Tasks task){
        Tasks t1 = new Tasks(task.getId() , task.getServiceName());
        map.put(task.getId() , t1);

    }

    public List<Tasks> getTasks(){
        return new ArrayList<>(map.values());
    }

    public boolean deleteTask(int id){
        return (map.remove(id)!=null);
    }

}
