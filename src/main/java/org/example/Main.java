package org.example;

import org.example.inheritance.Teacher;

/**
 * @author Vinod John
 * @Date ${DATE}
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog(false, "BULL DOG");
        System.out.println(dog.getAge());

        Dog dog1 = new Dog("", 0, true, "GERMAN SHEPPERD", 5);
        System.out.println(dog1.getAge());


        Teacher teacher = new Teacher();
        teacher.setFirstName("Vinod");
        teacher.setLastName("John");
        teacher.setEmail("vinod@gmail.com");
        teacher.setYearsOfExperience(4.5f);

        System.out.println(teacher.getFirstName());
    }
}