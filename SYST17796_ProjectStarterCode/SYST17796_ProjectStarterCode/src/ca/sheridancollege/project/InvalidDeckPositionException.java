/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author samee
 */
public class InvalidDeckPositionException extends Exception {

    private int positionIdentifier = 0;

    public InvalidDeckPositionException(int inValidPosition) {

        positionIdentifier = inValidPosition;

        System.out.println("Invalid Position" + inValidPosition);

    }

    private InvalidDeckPositionException() {
        System.out.println("Invalid Position");
    }

    public String toString() {

        return ("Attempted to get a card from a position not in Deck" + " " + this.positionIdentifier);
    }

    public int getPositionValue() {
        return positionIdentifier;
    }
}//End class
