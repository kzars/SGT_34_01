package oop;

public class CallingGift {
    public static void main(String[] args) {

        //Creating a gift object
        Gift gift1 = new Gift();

        gift1.setPrice(129.99f);
        gift1.setSize('L');
        gift1.setMaterial("Plastic");
        gift1.setForChildren(false);

        System.out.println(gift1.getPrice());

        gift1.gifting("Teddy", "Happy christmas teddy!");
        gift1.gifting("Bob", "Here you go!");


    }
}
