import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
//// Class Exercise 1 - String Comparison: Input two strings: Compare two strings and determine if they are equal, ignoring case sensitivity.
////Example : “Arya” not equals “arya”
        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter first string:");
//        String str1 = scanner.nextLine();
//        str1 = str1.toLowerCase();
//        System.out.println("please enter 2nd string:");
//        String str2 = scanner.nextLine();
//        str2 = str2.toLowerCase();
//        System.out.println(str1.equals(str2));
//// Class Exercise 2 - Create a program that takes a name as input and formats it as "LAST NAME, FIRST NAME." For example, if the input is "John Smith," the output should be "SMITH, JOHN"
//        System.out.println("please enter your full name:");
//        String fullname = scanner.nextLine();
//        int spaceindex = fullname.indexOf(" ");
//        String firstname = fullname.substring(0, spaceindex);
//        firstname = firstname.toUpperCase();
//        String lastname = fullname.substring(spaceindex + 1);
//        lastname = lastname.toUpperCase();
//        System.out.println("your name is: " + lastname + " " + firstname);
//
////Class Exercise 3 - will take input from customer age
////if age > 18 we will print - you are adult
//// if age < 18 we will print - you are young.
//
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("enter your age");
////        int age = scanner.nextInt();
////
////        if (age > 18) {
////            System.out.println("you are adult!");
////        } else {
////            System.out.println("you are young");
////        }
//
//
//
//// Class Exercise 4 - will take input from the user it will be car speed.
////if speed is higher than 120 - we will print "too fast"
////if speed lower than 60 - we will print "too slow"
////if the speed is between 60 and 120 we will print "good driver!"
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("enter your speed");
////        int speed = scanner.nextInt();
////        if (speed >= 120) {
////            System.out.println("too fast");
////        } else if (speed <= 60) {
////            System.out.println("too slow");
////        } else {
////            System.out.println("good driver!");
////        }
////        if (speed > 60 && speed < 120) {
////            System.out.println("good driver!");
////        } else {
////            System.out.println("bad driver");
////        }
//
//
//////        Get two ages of two brothers as input
////        For example:
////        Tomer’s age and Dany’s age.
////        If Tomer’s age is higher - print:
////              “Tomer is an older brother”
////        If Dany’s age is higher - print:
////              “Dany is an older brother”
////        If the ages are equal - print:
////          “Tomer and Dany are twins!”
//
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("enter age of Dany");
////        int danyAge = scanner.nextInt();
////        System.out.println("enter age of Tomer");
////        int tomerAge = scanner.nextInt();
////        if (danyAge > tomerAge) {
////            System.out.println("Dany is an older brother");
////        } else if (danyAge < tomerAge) {
////            System.out.println("Tomer is an older brother");
////        } else { //dany == tomer
////            System.out.println("Tomer and Dany are twins");
////        }
////        System.out.println("end of the program");
////
//
//// Class Excrise 5 - Ask user to provide the number:
////If the number is Even :
////Print “Even”
////If the number is Odd :
////Print “Odd”
////Hint: use modulo
//        System.out.println("please enter a number:");
//        int newnum = scanner.nextInt();
//        if (newnum % 2 == 0) {
//            System.out.println("Even number");
//        } else {
//            System.out.println("Odd number");
//        }
//// ternary operator - variable = (condition) ? expressionTrue : expressionFalse;
//
//// Class Excrise 6 - Ask user to provide grade and give verbal rating
//
//        System.out.println("please enter a grade:");
//        int grade = scanner.nextInt();
//        if (grade < 55) {
//            System.out.println("bilti maspik");
//            }
//        else if ( grade >=55 && grade < 65 ) {
//            System.out.println("Bad");
//            }
//        else if ( grade >=65 && grade < 75 ) {
//            System.out.println("Cimapt Tov");
//        }
//        else if ( grade >=75 && grade < 85 ) {
//            System.out.println("Tov");
//        }
//        else if ( grade >=85 && grade < 95 ) {
//            System.out.println("Tov Meod");
//        }
//        else if ( grade >=95 ) {
//            System.out.println("Excellent");
//        }
//// example for short if else of the above:
//// String grade = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 60 ? "D" : "F";
//// System.out.println(grade); // prints "B"
//
//
//// Class Excrise 7 - Ask user to provide num day of the week and print the day
//        System.out.println("please enter day of the week in number [1-7]:");
//        int day = scanner.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Today is Sunday");
//                break;
//            case 2:
//                System.out.println("Today is Monday");
//                break;
//            case 3:
//                System.out.println("Today is Tuesday");
//                break;
//            case 4:
//                System.out.println("Today is Wednesday");
//                break;
//            case 5:
//                System.out.println("Today is Thursday");
//                break;
//            case 6:
//                System.out.println("Today is Friday");
//                break;
//            case 7:
//                System.out.println("Today is Saturday");
//                break;
//            default:
//                System.out.println("Not a good number");
//        }
// Class Excrise 8 -Rock,Paper,Scissors game.
//Take player name ; Take move from player  (0-Rock,1-Paper,2-Scissors)
//Make random computer move from 0 to 2.
//Show what player choose and what computer choose and who is winner
//In case of the same choice print ”draw”

        System.out.println("We are going to play Rock,Paper,Scissors game.\n");
        System.out.println("please select game type: 1 - Player vs Computer, 2 - Player vs Player, 3 - Computer vs Computer\n");
        int move1 = 0;
        int move2 = 0;
        int comp_move1;
        int comp_move2;
        int player1_move1;
        int player2_move2;
        String player1_name = "";
        String player2_name = "";
        int game_type = scanner.nextInt();
        switch (game_type) {
            case 1:
                System.out.println("You selected Player vs Computer");
                System.out.println("Player 1 - Please enter your name\n");
                player1_name = scanner.next();
                System.out.println("Player 1- please select your move (0-Rock,1-Paper,2-Scissors):\n");
                player1_move1 = scanner.nextInt();
                comp_move1 = (int) (Math.random() * 3);
                move1 = player1_move1;
                move2 = comp_move1;
                player2_name = "Computer1";
                break;
            case 2:
                System.out.println("You selected Player vs Player");
                System.out.println("Player 1 - Please enter your name\n");
                player1_name = scanner.next();
                System.out.println("Player 1- please select your move (0-Rock,1-Paper,2-Scissors):\n");
                player1_move1 = scanner.nextInt();
                System.out.println("Player 2 - Please enter your name\n");
                player2_name = scanner.next();
                System.out.println("Player 2- please select your move (0-Rock,1-Paper,2-Scissors):\n");
                player2_move2 = scanner.nextInt();
                move1 = player1_move1;
                move2 = player2_move2;
                break;
            case 3:
                System.out.println("You selected Computer vs Computer");
                comp_move1 = (int) (Math.random() * 4 -1);
                comp_move2 = (int) (Math.random() * 5 -2);
                move1 = comp_move1;
                move2 = comp_move2;
                player1_name = "Computer1";
                player2_name = "Computer2";
                break;
            default:
                System.out.println("not a good choice");
        }

        switch (move1) {
            case 0:
                System.out.println(player1_name + " move is Rock");
                break;
            case 1:
                System.out.println(player1_name + " move is Paper");
                break;
            case 2:
                System.out.println(player1_name + " move is Scissors");
                break;
            default:
                System.out.println("not a good choice");
        }
        switch (move2) {
            case 0:
                System.out.println(player2_name + " move is Rock");
                break;
            case 1:
                System.out.println(player2_name + " move is Paper");
                break;
            case 2:
                System.out.println(player2_name + " move is Scissors");
                break;
            default:
                System.out.println("not a good choice");
        }
        String winner;
        String result = Integer.toString(move1) + Integer.toString(move2);

        if (result.equals("01") || result.equals("12") || result.equals("20")) {
            winner = player2_name;
        } else if (result.equals("02") || result.equals("10") || result.equals("21")) {
            winner = player1_name;
        } else {
            winner = "DRAW";
        }

        System.out.println("And the winner is :" + winner);
    }
}