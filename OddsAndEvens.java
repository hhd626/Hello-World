import java.util.*;
public class OddsAndEvens {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Let's play a game called \"Odds and Evens\"");   //intro
        //take in the users name, odds or evens
        System.out.print("What is your name?");
        String name = input.nextLine();
        //randomizer
        System.out.print("Hi" + name +", which do you choose? (O)dds or (E)vens?");
        String randomizer = input.next();

        if (randomizer.equals("O")){
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else if (randomizer.equals("E")) {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }
        System.out.println("- - - - - - - - - - - -");
        System.out.println();
        //take in the number of "fingers" the user would like to play, and uses
        System.out.print("How many \"fingers\" do you want put out?");
        int userNumber = input.nextInt();
        //the random generator to decide what the computer will play
        Random random = new Random();
        int computerNumber = random.nextInt( 6);
        System.out.println("The computer plays " + computerNumber + "  \"fingers\".");
        System.out.println("- - - - - - - - - - - -");
        System.out.println();
         //adds the 2 integers together and produces the sum
        int sum = userNumber + computerNumber;
        System.out.println( userNumber + "+" + computerNumber + " = " + sum);
        if (sum % 2 ==0){
            System.out.println( sum + " is...even!");
        } else {
            System.out.println(sum + " is...odd!");
        }

        //who wins
        //decided whether the final answer is even or odd, and declares a winner.
        if(userNumber%2==1 & sum%2==1) {
            System.out.println("That means " + name + " wins!");
        } else if (userNumber%2==1 & sum%2==0){
            System.out.println("That means computer wins!");
        } else if (userNumber%2==0 & sum%2==0){
            System.out.println("That means " + name + " wins!");
        } else {
            System.out.println("That means computer wins!");
        }
        System.out.println("- - - - - - - - - - - -");
        System.out.println();
    }
}

