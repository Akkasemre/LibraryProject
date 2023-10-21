package com.example.LibraryProject.entities.Enums;

public enum RoleType {

    ANONYMOUS("Anonymous"),
    MEMBER("Member"),
    EMPLOYEE("Employee"),
    ADMIN("Admin");


    public final String name;

    RoleType(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
