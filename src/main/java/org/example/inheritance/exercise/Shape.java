package org.example.inheritance.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * Shape - Parent class
 * @author Vinod John
 * @Date 12.12.2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shape {
    private String name;
    private int size;
    private LocalDate createdDate;
}
