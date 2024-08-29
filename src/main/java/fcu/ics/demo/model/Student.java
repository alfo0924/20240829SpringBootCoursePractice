package fcu.ics.demo.model;

import lombok.Data;

@Data
public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private String email;
    private String birthday;
}