package com.example.animalssounds;

public class Animal {
     String speech;

    public Animal(String speech) {
        this.speech = speech;
    }

    public String speak(){ return speech;}

    public enum AnimalType {
        cat, dog, rooster;
    }

}
