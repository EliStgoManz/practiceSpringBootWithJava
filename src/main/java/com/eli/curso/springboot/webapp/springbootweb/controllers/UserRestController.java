package com.eli.curso.springboot.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.eli.curso.springboot.webapp.springbootweb.models.User;
import com.eli.curso.springboot.webapp.springbootweb.models.dto.UserDto;

import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class UserRestController {


    /**
     *
     */
    @GetMapping(path="/details")
    public UserDto details() {

       
        User user=new User("Elí","Santiago");


        UserDto userDto= new UserDto();
        userDto.setUser(user.getName());
        userDto.setLastname(user.getLastname());
        userDto.setTitle("Hola Mundo con Spring Boot");

        return userDto;
    }
    
    

    @GetMapping(path="/details-map")
    public Map<String,Object>detailsMap(){
        
        User user=new User("Eli", "Santiago");
       Map<String,Object> body=new HashMap<>();
       body.put("title","hola Amigos, soy");
       body.put("user",user);
       return body;
    }


}

