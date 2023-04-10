/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.logging.Level;
import java.util.logging.Logger;
import static junit.framework.Assert.assertFalse;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author samee
 */
public class CardTest {

    public CardTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCompareToGood() {
        try {
            Card card1 = new Card('H', 4);
            Card card2 = new Card('H', 4);
            assertTrue(card1.compareTo(card2));
        } catch (InvalidCardValueException | InvalidCardSuitException ex) {
            Logger.getLogger(CardTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void testCompareToBad() {
        try {
            Card card1 = new Card('S', 7);
            Card card2 = new Card('H', 9);
            assertFalse(card1.compareTo(card2));
        } catch (InvalidCardValueException | InvalidCardSuitException ex) {
            Logger.getLogger(CardTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void testCompareToBoundary() {
        try {
            Card card1 = new Card('C', 1);
            Card card2 = new Card('D', 13);
            assertFalse(card1.compareTo(card2));
        } catch (InvalidCardValueException | InvalidCardSuitException ex) {
            Logger.getLogger(CardTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Good

    @Test
    public void testCompareValueSameValue() {
        try {
            Card card1 = new Card('H', 10);
            Card card2 = new Card('C', 10);
            assertTrue(card1.compareValue(card2));
        } catch (InvalidCardValueException | InvalidCardSuitException ex) {
            Logger.getLogger(CardTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    //Bad
    public void testCompareValueNullCard() {
        try {
            Card card = new Card('H', 7);
            card.compareValue(null);
        } catch (InvalidCardValueException | InvalidCardSuitException ex) {
            Logger.getLogger(CardTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Boundary

    @Test
    public void testCompareValueLowestValue() {
        try {
            Card card1 = new Card('D', 1);
            Card card2 = new Card('S', 1);
            assertTrue(card1.compareValue(card2));
        } catch (InvalidCardValueException | InvalidCardSuitException ex) {
            Logger.getLogger(CardTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Boundary
    @Test
    public void testCompareValueHighestValue() {
        try {
            Card card1 = new Card('C', 13);
            Card card2 = new Card('H', 13);
            assertTrue(card1.compareValue(card2));
        } catch (InvalidCardValueException | InvalidCardSuitException ex) {
            Logger.getLogger(CardTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Test Good case with same suit
    @Test
    public void testCompareSuitSameSuit() {
        try {
            Card card1 = new Card('S', 10);
            Card card2 = new Card('S', 5);
            assertTrue(card1.compareSuit(card2));
        } catch (InvalidCardValueException | InvalidCardSuitException ex) {
            Logger.getLogger(CardTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Test Good case with different suits
    @Test
    public void testCompareSuitDifferentSuit() {
        try {
            Card card1 = new Card('C', 8);
            Card card2 = new Card('H', 2);
            assertFalse(card1.compareSuit(card2));
        } catch (InvalidCardValueException | InvalidCardSuitException ex) {
            Logger.getLogger(CardTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    
    // Test Boundary case with maximum suit value
    @Test
    public void testCompareSuitMaxSuitValue() {
        try {
            Card card1 = new Card('S', 13);
            Card card2 = new Card('S', 7);
            assertTrue(card1.compareSuit(card2));
        } catch (InvalidCardValueException | InvalidCardSuitException ex) {
            Logger.getLogger(CardTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
