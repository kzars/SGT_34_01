package oop.inheritance;

class Vehicle{
    protected String brand;
    public void honk(){
        System.out.println("Tu Tu");
        System.out.println("My brand is: " + brand);
    }
}

class Bike extends Vehicle{
    public void honk(){
        System.out.println("Bip Bip");
        System.out.println("My brand is: " + brand);
    }
}
public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.brand = "Tesla";
        vehicle.honk();

        Bike bike = new Bike();
        bike.brand = "Cube";
        bike.honk();
    }
}
