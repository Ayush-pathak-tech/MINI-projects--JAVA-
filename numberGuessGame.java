import java.util.Random;
import java.util.Scanner;
public class numberGuessGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd = new Random();
       int  computerGuess=rd.nextInt(1,11);
        int guess = 0;

            System.out.println("Guess Game");
       do { 
        
       System.out.println("Enter your guess");
       guess =sc.nextInt();

       if(guess<computerGuess){
        System.out.println("Too Low! , TRY again ");
       }
       else if(guess>computerGuess){
        System.out.println("Too high, try again ");
       }else{
        System.out.println("yOU wON! ");
       }
       } while (guess!=computerGuess);
    }
    
}
