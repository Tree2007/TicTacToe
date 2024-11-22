import javax.imageio.metadata.IIOMetadataNode;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    //Variables accessible to the whole class
    private static String [][] board = new String[3][3];

    //Where the game is running

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validMove = false;
        System.out.println("Welcome to Tic Tac Toe!");
        clearBoard();
        displayBoard();
        do {
            int r = InputHelper.getRangedInt(scan, "Please move your row:", 1, 3);
            int c = InputHelper.getRangedInt(scan, "Please move your col:", 1, 3);
            validMove = isValidMove(r, c);
        } while (!validMove);

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
       boolean validMove = false;
       if (board[r][c].equalsIgnoreCase("-")) {
            validMove = true;
       }else
           System.out.println("You can not make that move");

       return validMove;
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
            for (int r = 0; r < board.length; r++) {

            }

    }
        return colWin;
    }

    //Checks if there is a winning row

    private static boolean isRowWin(String player){
        boolean rowWin = false;

        return rowWin;
    }

    //Checks to see if there is a win diagonally

    private static boolean isDiagonalWin(String player){
        boolean diagWin = false;

        return diagWin;
    }

    //Checks for a tie

    private static boolean isTie(){
        boolean tie = false;

        return tie;
    }




}