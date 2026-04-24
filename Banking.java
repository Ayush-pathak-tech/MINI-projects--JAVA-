
import java.util.Scanner;

public class Banking {
    static Scanner sc=new Scanner(System.in);

    public static void Showbalanace(double  balance) {
        System.out.println("Your balance is : ");
        System.out.printf("$%.2f",balance);  
    }
    public static double  deposite(double balance){
        System.out.println("enter amount to deposite in your account : ");
        double  amount =sc.nextDouble();
         if(amount<0){
            System.out.println("Amount can't be negative");
            return 0;
         }else{
            return amount;
         }
    }


    public static double Withdraw(double balance){
        System.out.println("Enter amount to withdraw from your account : ");
       double amount = sc.nextDouble();
        if(amount>balance){
            System.out.println("INSUFFUCANT BALANCE!");
            return 0;

        }
        else if(amount<0){
            System.out.println("Amount can't be negative");
            return 0;
        }else{
            return amount;
        }
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in );
        boolean isRunning=true;
        double balance=1000000.2334;

    while (isRunning) {
         System.out.println("***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("****************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposite ");
        System.out.println("3. Withdraw ");
        System.out.println("4. Exit");
        System.out.println("*****************");


        System.out.println("choose btw 1-4");
        int choose=sc.nextInt();

        switch (choose) {
             case 1-> Showbalanace(balance);
        case 2-> balance=balance+deposite(balance);
        case 3-> balance=balance-Withdraw(balance);
       case 4->isRunning=false;
}
System.out.println("Thanks!");
 }
        
    }
    















        
    }
    

