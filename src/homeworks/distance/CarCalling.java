package homeworks.distance;

import java.util.Scanner;

public class CarCalling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fuel amount in your vehicle");
        float fuel =  scanner.nextFloat();

        System.out.println("Enter your vehicle's fuel usage per 100 km");
        float fuelUsage = scanner.nextFloat();

        System.out.println("Enter how many passengers will be in vehicle");
        int passengers = scanner.nextInt();

        System.out.println("Will you turn on air conditioner? y/n");
        char input = scanner.next().toLowerCase().charAt(0);
        boolean airConditioner = false;

        if(input == 'y'){
            airConditioner = true;
        }

        Car car = new Car(fuel,fuelUsage,passengers,airConditioner);
        System.out.printf("Your vehicle can drive maximum of %.2f kilometers", car.maxDistance());

/*        System.out.println();
        System.out.println(car.maxDistance(100,10,5));*/


    }
}
