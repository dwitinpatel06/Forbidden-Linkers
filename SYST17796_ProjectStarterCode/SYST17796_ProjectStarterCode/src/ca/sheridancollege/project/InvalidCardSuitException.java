/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @date 10-April-2023
 */
public class InvalidCardSuitException extends Exception {

    private char suitIdentifier = '?';

    public InvalidCardSuitException(char invalidSuit) {

        suitIdentifier = invalidSuit;

        System.out.println("Invalid suit" + " " + invalidSuit);
    }

    private InvalidCardSuitException() {
        System.out.println("Invalid suit");
    }

    public String toString() {

        return ("Attempted to create card with invalid suit argument" + " " + this.suitIdentifier);

    }

    public char getSuitDesignator() {

        return suitIdentifier;
    }
}
