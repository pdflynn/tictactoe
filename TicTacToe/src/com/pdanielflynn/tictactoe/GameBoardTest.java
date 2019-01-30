/**
 * 
 */
package com.pdanielflynn.tictactoe;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author pdani
 *
 */
class GameBoardTest {

    private GameBoard board;
    /**
     * Sets up the test fixture
     */
    @BeforeEach
    void setUp() {
        board = new GameBoard();
        board.resetGameBoard();        
    }


    /**
     * Tests for an X-victory in the first row
     */
    @Test
    void testIsVictory1() {
        board.setSpace("X", 0, 0);
        board.setSpace("X", 1, 0);
        board.setSpace("X", 2, 0);
        board.output();
        assertTrue(board.isVictory("X"));
    }
    /**
     * Tests for an X-victory in the third row
     */
    @Test
    void testIsVictory2() {
        board.setSpace("X", 0, 2);
        board.setSpace("X", 1, 2);
        board.setSpace("X", 2, 2);
        board.output();
        assertTrue(board.isVictory("X"));
    }
    /**
     * Tests for an O-victory in the second column
     */
    @Test
    void testIsVictory3() {
        board.setSpace("O", 1, 0);
        board.setSpace("O", 1, 1);
        board.setSpace("O", 1, 2);
        board.output();
        assertTrue(board.isVictory("O"));
    }

}
