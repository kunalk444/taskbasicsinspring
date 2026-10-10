package com.example.taskbasicsinspring;

import org.springframework.stereotype.Component;


public class Tasks {


    Tasks(){}



    private int id;
    private String serviceName;

    public int getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    Tasks(int id , String serviceName){
        this.id = id;
        this.serviceName = serviceName;
    }

}
