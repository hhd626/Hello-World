import java.util.Scanner;
public class TravelPlanner1 {
    public static void main (String[] args)
    {
        greeting();
        timeBudget();
        timeDifference();
        countryArea();
    }

    public static void greeting(){
        Scanner input = new Scanner(System.in);
        // asking users name and destination.
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name?" );
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to?" );
        String city = input.nextLine();
        System.out.println("Great!" + " " +  city + " sounds like a great trip");
        System.out.println("************\n");
    }

    public static void timeBudget(){
      Scanner input = new Scanner(System.in);
      // asking for travel time and budget
        System.out.print("How many days are they going to spend in their destination?");
       int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip?");
        int money = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination?");
        String currSymbol = input.next();
        System.out.print("How many" +" " + currSymbol + " "+"are there in 1 USD?");
        double currRate = input.nextDouble();
        System.out.println(" ");
        System.out.println("If you are travelling for" + " " + days + " days that is the same as" + " " + days*24 + " "+ "hours or" + " "+ days*24*60 + " "+"minutes" );
        System.out.println("If you are going to spend $" + money + " USD that means per day you can spend up to $" + (int)((double)money/days*100)/100.0 + "USD");
        System.out.println("Your total budget in " +currSymbol + " is " + (double)money*currRate + " " + currSymbol + ", which per day is " + (int)(((double)money*currRate/days)*100)/100.0 + currSymbol);
        System.out.println("************\n");
    }

    public static void timeDifference(){
        Scanner input = new Scanner(System.in);
        // ask the user about the time difference between their home and where they are going.
        System.out.print("What is the time difference, in hours, between your home and your destination?");
        int time = input.nextInt();
        if (time >0) {
            System.out.println("That means that when it is midnight at home it will be " + time + ":00 in your travel destination " + "and when it is noon at home it will be " + (12+time)%24+ ":00");
        } else {   
            System.out.println("That means that when it is midnight at home it will be " + (24+time) + ":00 in your travel destination and when it is noon at home it will be " + (12+time)+ ":00" );
        }
        System.out.println("************\n");
    }

    public static void countryArea(){
        Scanner input = new Scanner(System.in);
        // report distances between user's home to destination
        System.out.print(" What is the square area of your destination country in km^2?");
        int distance = input.nextInt();
        System.out.println("In miles^2 that is " + ((int) ((distance * 0.62137*0.62137)*10)/10.0));
        System.out.println("************\n");
    }
}
