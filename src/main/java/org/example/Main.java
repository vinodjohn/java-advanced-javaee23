package org.example;

import org.example.inheritance.Person;
import org.example.inheritance.Student;
import org.example.inheritance.Teacher;

import java.time.LocalDate;

/**
 * @author Vinod John
 * @Date ${DATE}
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog(false, "BULL DOG");
        System.out.println(dog.getAge());

       // Dog dog1 = new Dog("", 0, true, "GERMAN SHEPPERD", 5);
        //System.out.println(dog1.getAge());


        //INHERITANCE
        Teacher teacher = new Teacher();
        teacher.setFirstName("Vinod");
        teacher.setLastName("John");
        teacher.setEmail("vinod@gmail.com");
        teacher.setYearsOfExperience(4.5f);

        System.out.println(teacher.printTeacher());

        Student student = new Student(true);
        System.out.println(student.toString());

        Person person = new Student("Tony", "Stark", LocalDate.of(2022, 12, 11), "vinod@gmail.com", true);
        System.out.println(person.toString());
        System.out.println(person.getFirstName());

        Person person1 = new Person("Mark", "Antony", LocalDate.of(2022, 05, 12), "mark@gmail.com");
        System.out.println(person1.toString());
        printWithPrefix("My person-1:", person1);
    }


    private static void printWithPrefix(String prefix, Object object) {
        System.out.println(prefix + object);
    }
}