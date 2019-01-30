package com.pdanielflynn.tictactoe;

//test 


public class GameBoard {

    private GamePiece[][] board;

    public static final int DRAW = 0;
    public static final int X_VICTORY = 1;
    public static final int O_VICTORY = 2;
    

    public GameBoard() {
        board = new GamePiece[3][3];
        resetGameBoard();
    }


    /**
     * Resets the game board to blank GamePieces
     */
    public void resetGameBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = new Blank();
            }
        }

    }


    /**
     * Sets a space at (x, y) to the specified GamePiece type
     * 
     * @param type
     *            The string representation of X or O
     * @param x
     *            The x-coordinate of the GamePiece to create
     * @param y
     *            The y-coordinate of the GamePiece to create
     * @return True if successful, false if a GamePiece already occupies the
     *         position
     */
    public boolean setSpace(String type, int x, int y) {
        if (board[x][y].getClass() == Blank.class && (type.equals("X") || type.equals("O"))) {
            System.out.println("Set coordinate " + x + ", " + y + " to "
                + type);
            if (type.equals("X")) {
                board[x][y] = new X();
            }
            else if (type.equals("O")) {
                board[x][y] = new O();
            }
            return true;
        }
        else if (!type.equals("X") || !type.equals("O")) {
            System.out.println("Failed to set space: Invalid argument!");
            return false;
        }
        else {
            System.out.println(
                "Failed to set space: A GamePiece already occupies this spot!");
            return false;
        }
    }

    
    public GamePiece[][] getBoard() {
        return this.board;
    }

    /**
     * Displays a String representation of the game board
     */
    public void output() {
        
        System.out.printf("%-8s%-8s%-8s\n", 
            this.getBoard()[0][0].toString(), this.getBoard()[1][0].toString(), this.getBoard()[2][0].toString());
        System.out.println();
        System.out.printf("%-8s%-8s%-8s\n", 
            this.getBoard()[0][1].toString(), this.getBoard()[1][1].toString(), this.getBoard()[2][1].toString());
        System.out.println();
        System.out.printf("%-8s%-8s%-8s\n", 
            this.getBoard()[0][2].toString(), this.getBoard()[1][2].toString(), this.getBoard()[2][2].toString());
        
    }
    
    /**
     * 
     */
    public boolean isVictory(String type) {
        //TODO: Implement diagonal checking
        
        //Check horizontal rows
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                if (!board[i][j].getType().equals(type)) {
                    break;
                }
                if (i == 2) {
                    return true;
                }
            }
        }
        
        //Check vertical columns
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                if (!board[j][i].getType().equals(type)) {
                    break;
                }
                if (i == 2) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
}
