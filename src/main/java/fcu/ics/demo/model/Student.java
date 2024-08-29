package fcu.ics.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private String email;
    private String birthday;


}