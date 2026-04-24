/* 

import java.util.Random;
import java.util.Scanner;

public class Rockpaper {
   public static void main(String[] args) { // Fixed: String[] instead of Strings[]
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    String playAgain = "yes"; // Fixed: String instead of Strings

    String[] choices = {"rock","paper","scissors"}; // Fixed: String[] and spelling

    do { 
        System.out.println("Enter your guess (rock,paper,scissors)");
        String playerChoice = sc.nextLine().toLowerCase(); // Fixed: String instead of Strings
        if((!playerChoice.equals("rock")) && (!playerChoice.equals("paper")) && (!playerChoice.equals("scissors")) ){
            System.out.println("INVALID INPUT!");
            continue; // Skip to next iteration if input is invalid
        }
        
        int random = rd.nextInt(3);
        String computerChoice = choices[random]; // Fixed: String instead of Strings
        System.out.println("Computer choice is : "+computerChoice);

        if(playerChoice.equals(computerChoice)){
            System.out.println("IT IS TIE!");
        }
        // Corrected win conditions
        else if (
            (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
            (playerChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println("YOU WON !");
        } else {
            System.out.println("YOU LOSE!");
        }

        System.out.println("WANNA play again(yes/no)");
        playAgain = sc.nextLine().toLowerCase();
    } while (playAgain.equals("yes"));
    
    System.out.println("THANKS FOR PLAYING");
    sc.close();

    
    }
}

*/