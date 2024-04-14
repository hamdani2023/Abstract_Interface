package com.intrfaces;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mustapha
 */
public class Square extends Shape implements Drawable, Resizable {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Draw a square with side: " + side);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void resize(double percentage) {
        side *= (1 + percentage / 100);
        System.out.println("Resized square to side: " + side);
    }

    public double getSide() {
        return side;
    }
}
