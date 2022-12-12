package org.example.inheritance;

import lombok.Data;

/**
 * Teacher - derived/child class
 *
 * @author Vinod John
 * @Date 08.12.2022
 */
@Data
public class Teacher extends Person{
    private float yearsOfExperience;
    private String address;


    public String printTeacher() {
        return "Teacher first name: " + super.getFirstName() +
                "last name: " + super.getLastName() +
                "address: " + address +
                "Full name:" + super.getFullName();
    }
}
