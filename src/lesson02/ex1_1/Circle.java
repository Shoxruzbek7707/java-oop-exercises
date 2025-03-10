package lesson02.ex1_1;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double r){
        this.radius = r;
        this.color = "red";
    }

    public String getColor(){
        return color;
    }

    public void setRadius(double newRadius){
        this.radius = newRadius;
    }


    public void setColor(String newColor){
        this.color = newColor;
    }

    public String toString(){
        return "Circle[radius= " + radius + " color= " + color + "]";
    }

    public double getRadius(){
        return radius;
    }

    public  double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }
}
