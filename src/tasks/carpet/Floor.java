package tasks.carpet;

public class Floor {
    private double length;
    private double width;

    public Floor(double length, double width){
        if(length >= 0){
            this.length = length;
        }else {
            this.length = 0;
        }

        if (width >= 0){
            this.width = width;
        }else {
            this.width = 0;
        }
    }

    public double getArea(){
        return length * width;
    }

}
