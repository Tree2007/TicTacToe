import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        //blank 2x2 array
        String [][] arr = new String[3][3];

        //prints the base template of tic tac toe
        System.out.println("please enter int values into the array:");
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
            arr[r][c] = "-";
            }
        }

        //printing data
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                System.out.print(arr[r][c] + "  ");
            }
            System.out.println();
        }
    }
}