package org.example.inheritance;

import lombok.Data;

/**
 * Student- derived class
 *
 * @author Vinod John
 * @Date 08.12.2022
 */
@Data
public class Student extends Person{
    private boolean hasPassed;
}
