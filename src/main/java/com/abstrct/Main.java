/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abstrct;

/**
 *
 * @author mustapha
 */
public class Main {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myLion = new Lion();
        Animal mySnake = new Snake();
        myAnimal.sound(); // Outputs: Some sound
        myLion.sound(); // Outputs: Roar
        mySnake.sound(); // Outputs: Hiss
    }
}
