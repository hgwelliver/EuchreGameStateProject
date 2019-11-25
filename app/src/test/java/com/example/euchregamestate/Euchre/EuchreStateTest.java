package com.example.euchregamestate.Euchre;

import org.junit.Test;

import static org.junit.Assert.*;

public class EuchreStateTest {

    @Test
    public void toString1() {
    }

    @Test
    public void arrayToString() {
    }

    @Test
    public void deal() {
    }

    @Test
    /**
     * @author Sierra
     */
    public void isPass() {
        EuchreState testState = new EuchreState();
        testState.gameStage = 1;
        testState.turn = 2;
        testState.isPass(3);
        assertEquals(testState.numPass, 0);
    }

    @Test
    public void isGoingAlone() {
        EuchreState testState = new EuchreState();
        // playerId param will be set to 3
        testState.turn = 3;
        testState.gameStage = 1;
        testState.dealer = 1;
        testState.teamDealer = 0;
        // init whoIsAlone variable to make sure it changes properly
        testState.whoIsAlone = 0;
        // init player1Hand to make sure it clears
        testState.player1Hand.add(0, testState.deck.ace_c);
        testState.player1Hand.add(0, testState.deck.jack_d);
        testState.player1Hand.add(0, testState.deck.ten_c);
        testState.player1Hand.add(0, testState.deck.queen_s);
        testState.player1Hand.add(0, testState.deck.king_s);
        // call isGoingAlone for player 3
        testState.isGoingAlone(3);
        // test to make sure it updates the whoIsAlone variable properly
        assertEquals(testState.whoIsAlone, 3);
        // test to make sure it clears player1's hand
        assertEquals(testState.player1Hand.size(), 0);

    }

    @Test
    public void isOrderUpTrump() {
    }

    @Test
    public void isPickItUp() {
    }

    @Test
    /**
     * @author Haley
     */
    public void isSelectTrump() {
        EuchreState testState = new EuchreState();
        testState.gameStage = 2;
        testState.turn = 1;


        Card.SUIT selected = Card.SUIT.HEARTS;
        Card.SUIT actualSelected = Card.SUIT.HEARTS;

        //testState.isSelectTrump(1);

        assertNotEquals(selected, actualSelected);
    }

    @Test
    public void validMove() {
    }

    @Test
    public void isTrickComplete() {
    }

    @Test
    public void isRoundOver() {
    }
}