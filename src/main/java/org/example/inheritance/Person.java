package org.example.inheritance;

import lombok.Data;

import java.time.LocalDate;

/**
 * Person - base class
 *
 * @author Vinod John
 * @Date 08.12.2022
 */
@Data
public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;
}
