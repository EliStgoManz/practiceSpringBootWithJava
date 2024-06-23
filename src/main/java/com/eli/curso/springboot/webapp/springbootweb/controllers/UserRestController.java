package com.eli.curso.springboot.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String,Object>details(){
        Map<String,Object> body=new HashMap<>();

       body.put("title","hola Mundo Javita");
       body.put("name","Eli");
       body.put("lastname", "Manzano");
       return body;
    }


}

