/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author samee
 */
public class InvalidCardValueException extends Exception {

    private int valueIdentifier = 0;

    public InvalidCardValueException(int invalidValue) {

        valueIdentifier = invalidValue;

        System.out.println("Invalid value " + invalidValue);
    }

    private InvalidCardValueException() {

        System.out.println("Invalid value");
    }

    public String toString() {

        return ("Attempted to create card with invalid suit argument" + " " + this.valueIdentifier);
    }

    public int getValue() {

        return valueIdentifier;
    }

} //End class

