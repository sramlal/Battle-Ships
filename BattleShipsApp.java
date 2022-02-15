import java.util.Scanner;

public class BattleShipsApp {

    public static void main (String[] args){

        BattleShips battleship = new BattleShips();
        Scanner input = new Scanner(System.in);
        char[][] grid = new char [10][10];
        battleship.placeShips();
        battleship.print();
        int numFires = 0;

        while( !battleship.gameOver()){
            System.out.println("Enter a row from 0-9: ");
            int row = input.nextInt();
            System.out.println("Enter a column from 0-9: ");
            int col = input.nextInt();

            while( !battleship.canFire(row,col) ){
                System.out.println("OOPS! You already hit there!");
                System.out.println("RETRY ANOTHER BLOCK...");
                System.out.println("Enter a row from 0-9: ");
                row = input.nextInt();
                System.out.println("Enter a column from 0-9: ");
                col = input.nextInt();
            }
            battleship.processFire(row,col);
            battleship.print();
            numFires++;

        }   //outer_while

        System.out.println("you have hit all ships in "+ numFires+" fires :) ");
    }

}   //end class
