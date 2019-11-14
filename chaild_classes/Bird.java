package javaone.lesson_five.homework.chaild_classes;

import javaone.lesson_five.homework.Animals;

public class Bird extends Animals {

    public Bird(String typeAnimal, int distance, float altitude) {
        super(typeAnimal, distance, altitude);
    }

    @Override
    protected void actions() {
        System.out.println(typeAnimal + " Can run and jump over obstacles");
    }
}
