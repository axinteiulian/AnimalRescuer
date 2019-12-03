package org.fasttrackit;

public class Animal {

    String animalName;
    int age;
    int hungerlevel;
    int moodlevel;
    String foodName;
    String recreationalActivity;

    public Animal(String animalName, int age, int hungerlevel, int moodlevel, String foodName, String recreationalActivity) {
        this.animalName = animalName;
        this.age = age;
        this.hungerlevel = hungerlevel;
        this.moodlevel = moodlevel;
        this.foodName = foodName;
        this.recreationalActivity = recreationalActivity;
    }

    public Animal() {

    }
}
