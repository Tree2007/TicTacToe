import javax.imageio.metadata.IIOMetadataNode;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    //Variables accessible to the whole class
    private static String [][] board = new String[3][3];

    //Where the game is running

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean win = false;
        boolean validMove = false;
        int r;
        int c;
        String playerOne = "X";
        String playerTwo = "O";
        System.out.println("Welcome to Tic Tac Toe!");
        clearBoard();
        displayBoard();
        do {
            do {
                r = InputHelper.getRangedInt(scan, "Please move your row:", 1, 3);
                c = InputHelper.getRangedInt(scan, "Please move your col:", 1, 3);
                validMove = isValidMove(r, c);
            } while (!validMove);
            board[r - 1][c - 1] = playerOne;
            displayBoard();
            if (isWin(playerOne)) {
                System.out.println("You won!");
            } else if (isTie()) {
                System.out.println("You tied");
            } else {
                do {
                    r = InputHelper.getRangedInt(scan, "Player two, move your row:", 1, 3);
                    c = InputHelper.getRangedInt(scan, "Player two, move your row:", 1, 3);
                    validMove = isValidMove(r, c);
                } while (!validMove);
                board[r - 1][c - 1] = playerTwo;
                displayBoard();
                if (isWin(playerTwo)) {
                    System.out.println("You won!");
                } else if (isTie()) {
                    System.out.println("You tied");
                }
            }
        }while(!win);
    }





        //Displays the board

    private static void displayBoard() {
            for (String[] strings : board) {
                for (int c = 0; c < board[0].length; c++) {
                    System.out.print(strings[c] + "  ");
                }
                System.out.println();
            }
        }

        //clears the board by setting all data points to -

    private static void clearBoard() {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                board[r][c] = "-";
            }
        }
    }

    //Checks for valid move

    private static boolean isValidMove(int r, int c) {
       if (board[r - 1][c - 1].equalsIgnoreCase("-")) {
            return true;
       } else {
           System.out.println("You can not make that move");
           return false;
       }
    }

    //checks for winning moves

    private static boolean isWin(String player){
        boolean win = false;
        if (isColWin(player) || isDiagonalWin(player) || isRowWin(player)) {
            win = true;
        }
        return win;
    }

    //Checks for a win in the colum section

    private static boolean isColWin(String player){
        boolean colWin = false;
        for (int c = 0; c < board[0].length; c++) {
                if (board[0][c].equalsIgnoreCase(player) && board[1][c].equalsIgnoreCase(player) && board[2][c].equalsIgnoreCase(player)) {
                    colWin = true;
                } else {
                    colWin = false;
                    break;
                }

            if (colWin) {
                break;
            }
        }
        return colWin;
    }

    //Checks if there is a winning row

    private static boolean isRowWin(String player){
        boolean rowWin = false;
        for (int r = 0; r < board.length; r++) {

                if (board[r][0].equalsIgnoreCase(player) && board[r][1].equalsIgnoreCase(player) && board[r][2].equalsIgnoreCase(player)) {
                    rowWin = true;
                }
                else {
                    break;
                }

        }
        return rowWin;
    }

    //Checks to see if there is a win diagonally

    private static boolean isDiagonalWin(String player){
        boolean diagWin = false;
        int c = 0;

        for (int r = 0; r < board.length; r++) {

        }
        return diagWin;
    }

    //Checks for a tie

    private static boolean isTie(){
        boolean tie = false;
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
            if (board[r][c].equalsIgnoreCase("-")){
                tie = false;
            } else {
                tie = true;
            }
            }
        }
        return tie;
    }




}