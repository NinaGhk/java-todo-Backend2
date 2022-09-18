package com.example.backend.Controller;

import com.example.backend.Modul.toDo;
import com.example.backend.Service.toDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todo")

public class toDoController {

     private toDoService service;

     @Autowired
     public toDoController(toDoService service){
          this.service = service;
     }
     @GetMapping
     public List<toDo> getToDo(){
          return service.getTodo();
     }

}
