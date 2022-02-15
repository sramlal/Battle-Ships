
import java.util.Scanner;
import java.util.Random;

public class BattleShips {

    private char[][] grid = new char [10][10];


    public void print(){

        System.out.println("    0   1   2   3   4   5   6   7   8   9 ");
        for( int r = 0; r < grid.length; r++ ){
            System.out.println(r +" ");
            for(int c = 0; c < grid[r].length; c++){
                if(grid[r][c] == 'M' || grid[r][c] == 'H'){
                    System.out.print("[" + grid[r][c] + "]");
                }else{
                    System.out.print("[ ]");
                }
            }   //inner for
        }   //outer for

    }   //print

    public void placeShips(){
/*
        int ship1_col = (int) (Math.random() * 10);     int ship1_row = (int) (Math.random() * 6);
        int ship2_col = (int) (Math.random() * 10);     int ship2_row = (int) (Math.random() * 7);
        int ship3_col = (int) (Math.random() * 10);     int ship3_row = (int) (Math.random() * 8);
        int ship4_col = (int) (Math.random() * 10);     int ship4_row = (int) (Math.random() * 8);
        int ship5_col = (int) (Math.random() * 10);     int ship5_row = (int) (Math.random() * 9);

        //ship_1
        for( int col = ship1_col; col < ship1_col + 5; col++ ){
            grid[ship1_row][col] = 'S';
        }
        //ship_2
        for( int col = ship2_col; col < ship2_col + 4; col++ ){
            grid[ship2_row][col] = 'S';
        }
        //ship_3
        for( int col = ship3_col; col < ship3_col +3; col++){
            grid[ship3_row][col] = 'S';
        }
        //ship_4
        for( int col = ship4_col; col < ship4_col +3; col++){
            grid[ship4_row][col] = 'S';
        }
        //ship_5
        for( int col = ship5_col; col < ship5_col +2; col++){
            grid[ship5_row][col] = 'S';
        }*/

        for(int i = 5; i >1; i--){
            boolean done = false;

            while(!done){

                int ranR = (int) (Math.random() * 10);
                int ranC = (int) (Math.random() * (i+1));

                for(int j = 0; j < i; j++ ){
                    if(grid[ranR][ranC + j] != 'S')
                        grid[ranR][ranC + j] = 'S';
                    else {
                        done =false;
                        break;
                    }
                }
                done = true;

            }
        }

    }   //placeShips


    public  boolean canFire(int row, int col){
        if(grid[row][col] == 'H' || grid[row][col] == 'M' ) {
            return false;
        }else {
            return true;
        }

    }   //canFire

    public void processFire( int row, int col){
        if( canFire(row, col)){
            if( grid[row][col] == 'S'){
                grid[row][col] = 'H';
                System.out.println("You got a hit!");
            }else{
                grid[row][col] = 'M';
                System.out.println("Try Again! You got a miss :(");
            }
        }else{
            grid[row][col] = grid[row][col];
        }

    }   //  processFire

    public boolean gameOver(){
        int count = 0;
        for( int r = 0; r < grid.length; r++){
            for( int col = 0; col < grid[r].length; col++ ){
                if ( grid[r][col] == 'H' ){
                    count++;
                }
            }
        }
        return count == 17;
    }    //gameOver


}   // END OF CLASS


