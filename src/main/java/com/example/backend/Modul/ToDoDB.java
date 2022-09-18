package com.example.backend.Modul;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ToDoDB {

    private Map<String, toDo> toDaMap=new HashMap<>();

    public List<toDo> foundToDo() {
        return new ArrayList<>(toDaMap.values());
    }

}
