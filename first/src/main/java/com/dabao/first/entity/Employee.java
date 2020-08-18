package com.dabao.first.entity;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private String password;
    private String email;
    private int age;
    private boolean admin;
    private int deptId;
}


