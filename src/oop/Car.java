package oop;

public class Car {

    //Fields
    private String color;
    private String brand;
    private int maxSpeed;

    public void setColor(String color){
        this.color = color;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setMaxSpeed(int maxSpeed){
        if(maxSpeed >= 30){
            this.maxSpeed = maxSpeed;
        }else {
            System.out.println("Invalid input");
        }
    }

    public String getColor(){
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    //Method
    public void printCarInfo(){
        System.out.println("Car info: ");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Max speed: " + maxSpeed);
    }


}
