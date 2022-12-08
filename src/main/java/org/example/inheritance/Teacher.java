package org.example.inheritance;

import lombok.Data;

/**
 * Teacher - derived class
 *
 * @author Vinod John
 * @Date 08.12.2022
 */
@Data
public class Teacher extends Person{
    private float yearsOfExperience;
    private String address;
}
