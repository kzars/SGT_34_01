package homeworks.distance;

public class Car extends Vehicle{

    private boolean airConditioner;

    public Car (float fuel, float fuelUsage, int passengers, boolean airConditioner){
        super(fuel,fuelUsage,passengers);
        this.airConditioner = airConditioner;
    }

    public float maxDistance(){
        float airConditionerAdd;
        if(airConditioner){
           airConditionerAdd = 1.1f;
        }else {
           airConditionerAdd = 1f;
        }

        //Passenger impact calculation
        float usage = fuelUsage * (1 + passengers * 0.05f);

        float maxDistance = fuel / (usage * airConditionerAdd) * 100;
        return maxDistance;
    }
}
