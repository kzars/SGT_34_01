package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Integer> salaryMap = new HashMap<>();

        //Add values to Map
        salaryMap.put("Bob", 900);
        salaryMap.put("John", 920);
        //salaryMap.put("John", 1000);

        System.out.println(salaryMap);

        //Get value from key
        System.out.println("John's salary: " + salaryMap.get("John"));

        //Get all key values
        System.out.println(salaryMap.keySet());

        //Size
        System.out.println(salaryMap.size());

        //Check if map contains key
        System.out.println(salaryMap.containsKey("Tony"));

        //Check if map contains value
        System.out.println(salaryMap.containsValue(920));

        //Remove key/value pair
        salaryMap.remove("Bob");
        System.out.println(salaryMap);

        //Example

        Map<String, String> capitalCity = new HashMap<>();
        capitalCity.put("Estonia","Tallinn");
        capitalCity.put("Latvia","Riga");
        capitalCity.put("Finland","Helsinki");

        System.out.println(capitalCity.get("Finland"));

        for (Map.Entry<String, String> entry: capitalCity.entrySet()){
            System.out.println(entry.getKey() + " has a capital city of " + entry.getValue());
        }






    }
}
