package javaone.lesson_five.homework.chaild_classes;

import javaone.lesson_five.homework.Animals;

public class Horse extends Animals {

    private int swimmingDistance;

    public Horse(String typeAnimal,int distance, float altitude, int swimmingDistance) {
        super(typeAnimal, distance, altitude);
        this.swimmingDistance = swimmingDistance;
    }

    @Override
    protected void actions() {
        System.out.println(typeAnimal + " Can run, swimming and jump over obstacles");
    }

    @Override
    protected void result_actions() {
        System.out.println(typeAnimal  + " ran " +  distance + " meters" +
                " and " + " jumped " + altitude + " meters" +
                " and " + " swam " + swimmingDistance + " meters");
    }
}
