package org.example;

/**
 * Dog model
 *
 * @author Vinod John
 * @Date 08.12.2022
 */
public class Dog {
    private String name;
    private int age;
    private boolean isMale;
    private String race;
    private float weight;

    public Dog(String name, int age, boolean isMale, String race, float weight) throws Exception {
        if(name.isEmpty()) {
            throw new Exception("Name cannot be empty");
        }

        if(age < 0) {
            throw new Exception("Invalid age");
        }

        if(race.isEmpty()) {
            throw new Exception("Race cannot be empty!");
        }

        if(weight < 1) {
            throw new Exception("Invalid weight!");
        }

        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.race = race;
        this.weight = weight;
    }

    public Dog(boolean isMale, String race) throws Exception {
        this("Caspar", 3, isMale, race, 4.5f);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
