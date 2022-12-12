package org.example.inheritance.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Rectangle - Child class of Shape
 *
 * @author Vinod John
 * @Date 12.12.2022
 */
@Data
@AllArgsConstructor
public class Rectangle extends Shape{
    private int length;
    private int width;
}
