package com.intrfaces;


public interface Drawable {

    double PI = 3.14159; // implicitly public, static, and final

    void draw(); // implicitly public and abstract

    default void printMessage() {
        System.out.println("This is a drawable object.");
    }
}
