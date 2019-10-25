/**
 * Part 1 - Let the user solve the maze
 */
import java.util.Scanner;
public class MazeRunner {
    // Create a new "Maze" in your MazeRunner class like so:
    public static Maze myMap = new Maze();
    public static int userSteps = 0;

    public static void main(String[] args) {
        intro();
        myMap.printMap();
        // Returns true if the mentioned space is free, false if there is a wall
        while (myMap.didIWin() == false) {
            //Part 2
            String direction = userMove();
            //Part 3 – Watch out for pits
            if (direction.equals("R") || direction.equals("L") || direction.equals("U") || direction.equals("D")) {
                navigatePit(direction);
            }
        }
        if (myMap.didIWin() == true) {
            System.out.print("Congratulations, you made it out alive!");
            System.out.println("and you did it in " + userSteps + " moves");
        }

    }

    /**
     * Welcome the user to Maze Runner and show them the current state of the Maze in a method
     */
    public static void intro() {
        System.out.println("Welcome to Maze Runner!");
        System.out.println("Here is your current position:");

    }

    /**
     * offer your user a way to enter in which direction users would like to move, Right (R), Left (L), Up (U) or Down (D).in a new method
     */

    public static String userMove() {
        // take in desired direction of move, and check if that direction is valid and possible
        Scanner input = new Scanner(System.in);
         String direction;
        do {
                System.out.print("Where would you like to move? (R, L, U, D) ");
                direction = input.next();
            if(direction.equals("R")) {
                if (myMap.canIMoveRight()) {
                    myMap.moveRight();
                    myMap.printMap();
                    movesMessage(++MazeRunner.userSteps);
                } else {
                    System.out.println("Sorry, you've hit a wall.");
                }
            } else if (direction.equals("L")) {
                if (myMap.canIMoveLeft()) {
                    myMap.moveLeft();
                    myMap.printMap();
                    movesMessage(++MazeRunner.userSteps);
                } else {
                    System.out.println("Sorry, you've hit a wall.");
                }
            } else if (direction.equals("U")) {
                if (myMap.canIMoveUp()) {
                    myMap.moveUp();
                    myMap.printMap();
                    movesMessage(++MazeRunner.userSteps);
                } else {
                    System.out.println("Sorry, you've hit a wall.");
                }
            } else {
                if (myMap.canIMoveDown()) {
                    myMap.moveDown();
                    myMap.printMap();
                    movesMessage(++MazeRunner.userSteps);
                } else {
                    System.out.println("Sorry, you've hit a wall.");
                }
            }
            movesMessage(++MazeRunner.userSteps);
                break;
            } while(direction.matches("[RLUD]") == false);
            return direction;
    }

    /**
    * Part 2 move limit: add the limitation that users will only have 100 steps to move before the exit to the maze closes
     */
    public static int movesMessage(int moves) {
        //print message after certain numbers of moves
        // count moves
        if (moves == 50) {
            System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes");
        } else if (moves == 75) {
            System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
        } else if (moves == 90) {
            System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
        } else if (moves == 100) {
            System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
        } else if (moves ==101) {
            System.out.println("Sorry, but you didn't escape in time- you lose!");
        }
   return moves;
    }
    /**
    * Part3 Watch out for pits and let users know if there is a pit in front of them.
     */
    public static void navigatePit(String direction) {
        Scanner input = new Scanner(System.in);
        // Takes in the direction String the user entered in and returns if there is a pit ahead
        if(myMap.isThereAPit(direction) == true) {
            System.out.print("Watch out! There's a pit ahead, jump it?  ");
            String jump = input.next();
            if(jump.startsWith("y")) {
                // Will jump over a pit in the direction given, skipping that space and landing 2 spaces over in the direction specified.
                myMap.jumpOverPit(direction);
            } else {
                System.out.println("Sorry, but you didn't jump- you lose!");
                System.exit(0);
            }
        }
    }

}