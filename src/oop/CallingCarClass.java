package oop;

import java.util.Scanner;

public class CallingCarClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter car's brand");
        String brand = scanner.nextLine();
        System.out.println("Please enter car's color");
        String color = scanner.nextLine();
        System.out.println("Please enter car's max speed");
        int maxSpeed = scanner.nextInt();

        //Create a new car class object
        //Set field values we got from user
        //Car printCarInfo method to get the information about the car

        Car car1 = new Car();
        car1.setColor(color);
        car1.setBrand(brand);
        car1.setMaxSpeed(maxSpeed);
        car1.printCarInfo();

        //Get max speed
        System.out.println("max speed " + car1.getMaxSpeed());

        if (car1.getMaxSpeed() >= 300){
            System.out.println("Sports car");
        }else {
            System.out.println("Regular car");
        }

    }
}
