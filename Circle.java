import static java.lang.Math.*;
public class Circle {
    //private properties radius and colour
    private int radius = 2;
    private String colour = "Green";

    //default constructor
    public Circle(){
        this.radius = 2;
        this.colour = "Green";
    }

    //overloaded constructor - external classes can control the size
    public Circle(int radius){
        this.radius = radius;
    }

    //overloaded constructor - allows creation of circles of any size
    //or colour on object creation
    public int getRadius(){
        return radius;
    }
    public String getColour(){
        return colour;
    }
    public void setRadius(int newRadius){
        this.radius = newRadius;
    }
    public void setColour(String newColour){
        this.colour = newColour;
    }
    public Circle(int radius, String colour){
        this.radius = radius;
        this.colour = colour;
    }

    //getArea method
    public void getArea(){
        double area = Math.PI*radius*radius;
        System.out.println("Area = " + area);
    }

    //toString method
    public String toString(){
        System.out.println("Radius = " + radius + ", Colour = " + colour);
        return null;
    }

}
