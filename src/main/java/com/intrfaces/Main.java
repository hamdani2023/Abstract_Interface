package com.intrfaces;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mustapha
 */
public class Main {

    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        Rectangle r = new Rectangle(4.0, 3.0);
        Square s = new Square(2.0);

        c.draw();
        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Circle Perimeter: " + c.getPerimeter());
        c.printMessage();

        r.draw();
        System.out.println("Rectangle Area: " + r.getArea());
        System.out.println("Rectangle Perimeter: " + r.getPerimeter());
        r.resize(10);  // Resize rectangle by 10%

        s.draw();
        System.out.println("Square Area: " + s.getArea());
        System.out.println("Square Perimeter: " + s.getPerimeter());
        s.resize(20);  // Resize square by 20%
    }
}
