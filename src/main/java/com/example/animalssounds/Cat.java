package com.example.animalssounds;

public class Cat extends Animal{
    public Cat(String speech) {
        super(speech);
    }
    public static String catSpeaks()
    {
        speech = "Мяу";
        System.out.println(speech);
        return speech;
    }

}
