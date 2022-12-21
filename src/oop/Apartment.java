package oop;

public class Apartment {

    private int numberOfRooms;
    private int floor;
    private double sqm;
    private String streetName;
    private boolean bath;

    //Custom Constructor
    public Apartment(int numberOfRooms, int floor, double sqm, String streetName, boolean bath){
        this.numberOfRooms = numberOfRooms;
        this.floor = floor;
        this.sqm = sqm;
        this.streetName = streetName;
        this.bath = bath;
    }

    public Apartment(int numberOfRooms, String streetName){
        this.numberOfRooms = numberOfRooms;
        this.streetName = streetName;
    }

    public Apartment(){

    }

    public void printApartmentInfo(){
        System.out.println("Apartment info:");
        System.out.println("Number of rooms: " + numberOfRooms);
        System.out.println("Floor: " + floor);
        System.out.println("m^2: " + sqm);
        System.out.println("Street name: "+ streetName);

        if(bath){
            System.out.println("This apartment has a bath");
        }else {
            System.out.println("This apartment has no bath");
        }
    }


}
