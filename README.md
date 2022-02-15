# Battle-Ships
This is a console based battle ships game.

public static void print() that prints out the current state of the grade. It prints out a blank square if
there is no hit or miss in that array position, otherwise it prints the character in that position.

public static void placeShips() that randomly places the ships on the grid. It does this by assigning a ’S’
character in each slot of the array that contains a item of the ship. The method first picks two random
numbers to represent the start position of the ship and then fills the appropriate number of slots in the
array with ’S’ characters.

public static void canFire(int row, int col) that returns true if the square specified by row and col has
not been fired on before, false otherwise.

public static void processFire(int row, int col) that is given the row and column of the square in which
the player wants to fire. The method then assigns a ’H’ to this square if it contains part of a ship or it
assigns a ’M’ if it does not.

public static boolean gameOver() that returns true if all ships have been hit, false otherwise.

The main method is in the BattleShipsApp class.

