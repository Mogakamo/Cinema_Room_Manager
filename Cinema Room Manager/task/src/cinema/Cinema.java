package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        //global variables
        int price;
        int tickets;

        // Write your code here
        System.out.println("Cinema:");
        System.out.println("  1 2 3 4 5 6 7 8");
        System.out.println("1 S S S S S S S S");
        System.out.println("2 S S S S S S S S");
        System.out.println("3 S S S S S S S S");
        System.out.println("4 S S S S S S S S");
        System.out.println("5 S S S S S S S S");
        System.out.println("6 S S S S S S S S");
        System.out.println("7 S S S S S S S S");

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of rows: \n");
        int rows = keyboard.nextInt();
        System.out.println("Enter the number of seats in each row: \n");
        int seats = keyboard.nextInt();

        if (seats < 60) {
            
        }



    }
}