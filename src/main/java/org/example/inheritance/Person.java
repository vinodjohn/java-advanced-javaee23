package org.example.inheritance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

/**
 * Person - base/parent class
 *
 * @author Vinod John
 * @Date 08.12.2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;

    @Override
    public String toString() {
        return "SDA inheritance example: Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                '}';
    }

    public String getFirstName() {
        return "Vinod SDA";
    }

    protected String getFullName() {
        return firstName + lastName;
    }
}
