
/* Scenario: Designing a Shape Hierarchy

You are tasked with designing a Java program to model geometric shapes in a graphics application. 
The goal is to create a hierarchy of shapes, each with common properties and behaviors while 
allowing for specific details of individual shapes. Explain how you would use abstract classes and 
interfaces to achieve this goal.

Provide an abstract class named Shape that includes common attributes shared by all shapes, 
such as color, position, and area. Describe the purpose of these attributes and how they should be 
defined in the Shape class.

Create an interface named Drawable that defines a method draw() to ensure that all shapes can be 
drawn on the screen. Explain the role of this interface and how it's implemented by various shape 
classes.

Design at least three concrete shape classes (e.g., Circle, Rectangle, Triangle) that extend the 
Shape class and provide specific implementations for attributes and methods. Discuss each shape 
class's unique properties and how they inherit or override properties and methods from the Shape 
class.

Describe how you would use constructors in the concrete shape classes to initialize their 
properties and how constructors from the Shape class can be leveraged to reduce code duplication.

Explain how polymorphism can be applied to treat instances of various shape classes as instances 
of the Shape class, allowing for a more generalized approach to working with shapes.

Discuss the advantages of using an abstract class and an interface in this scenario and how they 
help maintain a clear and organized code structure while promoting code reuse and extensibility.

Please provide an example of how you would create instances of different shapes, set their 
properties, and call their draw() method, demonstrating how the abstract class and interface work 
together in your design. 
*/

// Abstract class to represent common attributes of all shapes
abstract class Shape{
    private String color;
    private int x;
    private int y;

    // Constructor to initialize color, x, and y
    public Shape(String color, int x, int y){
        super();
        this.color = color;
        this.x = x;
        this.y = y;
    }

    //Default constructor
    public Shape(){
        super();
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }

    // Abstract method to calculate the area of the shape
    public abstract double calculateArea();
}

//Interface for drawable objects
interface Drawable{
    void draw();
}

//Concrete Circle class
class Circle extends Shape implements Drawable{
    private double radius;

    public Circle(String color, int x, int y, double radius){
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle at (" + getX() + " , " + getY() + ") with radius " + radius);
    }

    @Override
    public double calculateArea() {
        return (Math.PI * radius * radius);
    }
    
}

//Concrete Rectangle class
class Rectangle extends Shape implements Drawable{
    private double height;
    private double width;

    public Rectangle(String color, int x, int y, double height, double width){
        super(color, x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
       System.out.println("Drawing a Rectangle at (" + getX() + " , " + getY() + ") with height " + height + " and width " + width);
    }

    @Override
    public double calculateArea() {
       return (height * width);
    }
    
}

public class Question4 {
    public static void main(String[] args) {
        // Create an instance of the Circle class
        Circle circle = new Circle("Black", 5, 10, 12.5);
        circle.draw();
        System.out.println("Area of the Circle is: " + circle.calculateArea());

        // Create an instance of the Rectangle class
        Rectangle rct = new Rectangle("Light Blue", 10, 15, 10, 12);
        rct.draw();
        System.out.println("Area of the Rectangle: " + rct.calculateArea());
    }
}
