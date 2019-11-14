package javaone.lesson_five.homework.chaild_classes;

public class SmallDog extends Dog {
    public SmallDog(String typeAnimal, int distance, float altitude, int swimmingDistance) {
        super(typeAnimal, distance, altitude, swimmingDistance);
    }

    public void after_actions(){
        System.out.println("tired and shaking");
    };
}
