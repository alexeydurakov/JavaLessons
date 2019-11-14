package javaone.lesson_five.homework;

public class Animals {
    protected String typeAnimal;
    protected  int distance;
    protected  float altitude;

    protected Animals(String typeAnimal, int distance, float altitude) {
        this.typeAnimal = typeAnimal;
        this.distance = distance;
        this.altitude = altitude;
    }

    protected void actions() {
        System.out.println(typeAnimal + "same actions");
    }

    protected void result_actions() {
        System.out.println(typeAnimal + " ran " +  distance + " meters" + " and " + " jumped " + altitude + " meters");
    }

}
