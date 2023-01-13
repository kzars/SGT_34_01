package tasks.grocery;

//TODO
// 1. addGroceryItem
// 2. printGroceryList
// 3. removeGroceryItem
// 4. modifyGroceryItem
// 5. searchItem

import java.util.ArrayList;
import java.util.regex.Pattern;

public class GroceryList {

    //Field
    private ArrayList<String> groceryList = new ArrayList<>();

    //Methods
    // Adding new items to the list
    public void addGroceryItem(String item){
        if(checkIfValid(item)){
            groceryList.add(item);
        }else {
            System.out.println("Item name is not valid");
        }
    }

    //Print all list items
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    //Remove Grocery item
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0){
            groceryList.remove(position);
            System.out.println(item + " was deleted");
        }else {
            System.out.println("Item is not in the list");
        }
    }

    //Modify Grocery list item
    public void modifyGroceryItem(int position, String newItem){
        if(checkIfValid(newItem)){
            if(position >= 0 && position < groceryList.size()){
                groceryList.set(position,newItem);
                System.out.println("Grocery item " + groceryList.get(position) + " were modified");
            }else {
                System.out.println("Items position is not valid");
            }
        }else {
            System.out.println("Item name is not valid");
        }
    }

    //Searching item in the list
    public boolean searchItem(String searchItem){
        if (findItem(searchItem) >= 0){
            return true;
        }else {
            return false;
        }
    }

    // Delete all items
    public void deleteAllItems(){
        groceryList.clear();
        System.out.println("All items in the list are deleted");
    }

    //Returning items index
    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    //Check if item is valid
    private boolean checkIfValid(String item){
        return Pattern.matches("[a-zA-Z]+[.0-9a-zA-Z]",item);
    }

}
