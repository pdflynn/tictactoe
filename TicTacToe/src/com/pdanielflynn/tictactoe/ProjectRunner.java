package com.pdanielflynn.tictactoe;


/**
 * @author pdani
 *
 */
public class ProjectRunner {

    public static boolean update;
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        GamePiece x = new X();
        System.out.println(x.getType());
        
        /*GameBoard board = new GameBoard();
        
        board.setSpace("X", 0, 0);
        board.setSpace("X", 1, 0);
        board.setSpace("X", 2, 0);
        
        board.output();
        
        System.out.println(board.isVictory("X"));
        */
    }

}
