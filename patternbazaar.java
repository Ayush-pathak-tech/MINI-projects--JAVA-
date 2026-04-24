
import java.util.Scanner;
public class patternbazaar {
//_____________________________________
public static void squarePattern(int n){
    for(int i=1; i<=n; i++){
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
//_________________________________________
public static void RightTringlePattern(int n){
    for(int i=1; i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
//__________________________________________
public static void PyramidPattern(int n){
    for(int i=1;i<=n;i++){
        for(int j=1; j<=n-i;j++)
            System.out.print("  ");
        for(int k=1; k<=2*i-1; k++)
        System.out.print("* ");
        System.out.println();
        }
    }
//_____________________________________________
public static void dimondPattern(int n){
    for(int i=1; i<=n; i++){// ye to maaan lo ki tumhe 1 row pe lake khada ker dega 
        for(int j=1; j<=n-i; j++) // space print kerana hai  pyramid me  pehle jayada to space print hoga     
        System.out.print(" ");///// 
        for(int k =1; k<=2*i-1; k++)// star print kerna hai (abhi bhi tum row e hi ho space print kerne ke baad aage badhoge star print kerne ke liye
        System.out.print("*");
        System.out.println();
    }
    for (int i = n - 1; i >= 1; i--) {
        for (int j = 1; j <= n - i; j++)
            System.out.print(" ");
        for (int k = 1; k <= 2 * i - 1; k++)
            System.out.print("*");
        System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       boolean validOperation=true;
       String k;
        do { 
            System.out.print("*****************************\n");
        System.out.print("* WELCOM TO PATTERN BAZAAR *\n");
         System.out.print("*****************************\n");
         System.out.println("1.SQUARE PATTERN");
         System.out.println("2.RIGHT TRIANGLE PATTERN");
         System.out.println("3.PYRAMID PATTERN");
         System.out.println("4.DIMOND PATTERN");
         System.out.println("5.exit");
         System.out.println("Pattern number dalo bhai");
         int choose = sc.nextInt();
            System.out.println("Pattern size dalo");
         int n=sc.nextInt();
         switch(choose){
            case 1 -> squarePattern(n);
            case 2 ->RightTringlePattern(n);
            case 3->PyramidPattern( n);
            case 4->dimondPattern(n);
            case 5->validOperation =false;
            default-> System.out.println("INVALID INPUT choose number!");
         }
         if(choose==5){
         System.out.print("---------\n");
         System.out.print("THANK YOU\n");
         System.out.print("---------\n");  
         validOperation = false;
         break;
         }
         System.out.println("Do you wanna play again yes/no");
         k = sc.nextLine();     
        } while (k.equals("khelo"));
    }
}
    

