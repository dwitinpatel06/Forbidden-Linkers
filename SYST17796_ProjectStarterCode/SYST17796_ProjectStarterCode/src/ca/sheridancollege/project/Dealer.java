/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author samee
 */
import java.io.Serializable;

public class Dealer implements Serializable {

    private Hand hand = new Hand();

    // Determines if dealer has a blackjack
    public boolean isBlackjack() {
        if (getHand().calculateTotal() == 21) {
            return true;
        } else {
            return false;
        }
    }

    // This automates the dealer's play
    public void dealerPlay(Deck deck) {
        System.out.println();
        while (getHand().calculateTotal() <= 16) {
            System.out.println("Dealer has " + getHand().calculateTotal() + " and hits");
            getHand().addCard(deck.nextCard());
            System.out.println("Dealer " + this.getHandString(true, false));
        }
        if (getHand().calculateTotal() > 21) {
            System.out.println("Dealer busts. " + this.getHandString(true, false));
        } else {
            System.out.println("Dealer stands. " + this.getHandString(true, false));
        }
    }

    // Adds a card o the dealer's hand
    public void addCard(Card card) {
        getHand().addCard(card);

    }

    // Gets the dealer's hand as a string
    public String getHandString(boolean isDealer, boolean hideHoleCard) {
        String str = "Cards:" + getHand().toString(isDealer, hideHoleCard);

        return str;
    }

    // Calculates the dealer's hand total
    public int calculateTotal() {
        return getHand().calculateTotal();
    }

    // Clears the dealer's hand
    public void clearHand() {
        getHand().clearHand();
    }

    // Peeks the dealer's face-down card
    public boolean peek() {
        return getHand().dealerPeek();
    }

    /**
     * @return the hand
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * @param hand the hand to set
     */
    public void setHand(Hand hand) {
        this.hand = hand;
    }
}
