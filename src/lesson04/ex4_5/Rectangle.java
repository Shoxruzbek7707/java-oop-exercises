package lesson04.ex4_5;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width,double length){
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return  2 * (length * width);
    }

    @Override
    public String toString() {
        return super.toString() + ",width= " + width + ",length= " + length + "]";
    }
}
