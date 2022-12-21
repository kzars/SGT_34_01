package oop;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }

    private boolean isValid(double s1, double s2, double s3){
/*        if(s1 + s2 > s3 && s1 + s3> s2 && s2 + s3 > s1){
            return true;
        }else {
            return false;
        }*/
        return s1 + s2 > s3 && s1 + s3> s2 && s2 + s3 > s1;
    }

    public double areaTriangle(){
        double area = 0;
        if(isValid(side1,side2,side3)){
            double halfPer = (side1 + side2 + side3) /2;
            area = Math.sqrt(halfPer * (halfPer-side1) * (halfPer-side2) * (halfPer-side3));
            System.out.println("Triangle area: " + area);
        } else {
            System.out.println("Triangle is not valid");
        }
        return area;
    }

}
