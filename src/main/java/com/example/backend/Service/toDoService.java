package com.example.backend.Service;

import com.example.backend.Modul.ToDoDB;
import com.example.backend.Modul.toDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class toDoService {

    private ToDoDB toDoDB;

    @Autowired
    public  toDoService (ToDoDB toDoDB){
        this.toDoDB = toDoDB;
    }

    public List<toDo> getTodo() {
        return toDoDB.foundToDo();
    }
}

