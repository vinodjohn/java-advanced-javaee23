package org.example.inheritance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

/**
 * Student - derived/child class
 *
 * @author Vinod John
 * @Date 08.12.2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Student extends Person {
    private boolean hasPassed;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, String email, boolean hasPassed) {
        super(firstName, lastName, dateOfBirth, email); // Calls to Parent class's constructor
        this.hasPassed = hasPassed;
    }

    public String getFirstName() {
        return "John SDA";
    }
}
