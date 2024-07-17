package com.eli.curso.springboot.webapp.springbootweb.models;

public class User {

    private String user;
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    private String name;
    private String lastname;

   public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
  
   

    

}
