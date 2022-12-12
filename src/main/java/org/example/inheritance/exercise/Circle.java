package org.example.inheritance.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Circle - child class of Shape
 *
 * @author Vinod John
 * @Date 12.12.2022
 */
@Data
@AllArgsConstructor
public class Circle extends Shape {
    private float radius;
    private float area;
}
