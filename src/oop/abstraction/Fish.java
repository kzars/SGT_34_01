package oop.abstraction;

public class Fish extends Pet{

    private int waterChangesInWeek;

    public Fish(String color, String eat, String place, int averageAge, int waterChangesInWeek){
        super(color,eat,place,averageAge);
        this.waterChangesInWeek = waterChangesInWeek;
    }

    public void printPetInfo(){
        System.out.println("Color: " + color);
        System.out.println("Eat: " + eat);
        System.out.println("Place: " + place);
        System.out.println("Lifespan: " + averageAge);
        System.out.println("Water changes in a week: " + waterChangesInWeek);
    }

}
