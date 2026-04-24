
import java.util.Scanner;
public class Reccursionrasoi {
    public static int factorial(int fac){              
// factorial(5) = 5 * factorial(4)
// factorial(4) = 4 * factorial(3)
// factorial(3) = 3 * factorial(2)
// factorial(2) = 2 * factorial(1)
// factorial(1) = 1 (base case)
        //❤️‍🔥
        if(fac==0 || fac==1){
            return 1;
        }
        return fac*factorial(fac-1);
    }
    public static int fabonacci(int fab){
        if(fab==0){
            return 0;
        }else if(fab==1){
            return 1;
        }
        return fabonacci(fab-1)+fabonacci(fab-2);
//         fibonacci(5)
// = fibonacci(4) + fibonacci(3)
// fibonacci(4) = fibonacci(3) + fibonacci(2)
// fibonacci(3) = fibonacci(2) + fibonacci(1)
// fibonacci(2) = fibonacci(1) + fibonacci(0)
// fibonacci(2) = 1 + 0 = 1
// fibonacci(3) = fibonacci(2) + fibonacci(1)
//             = 1 + 1 = 2
// fibonacci(4) = fibonacci(3) + fibonacci(2)
//             = 2 + 1 = 3
// fibonacci(5) = fibonacci(4) + fibonacci(3)
//             = 3 + 2 = 5
    }
    public static void starPattern(int str){
//    Call stack progression (going down):
// 1️⃣ starPattern(3) calls → starPattern(2) str =3
// 2️⃣ starPattern(2) calls → starPattern(1)  str = 2
// 3️⃣ starPattern(1) calls → starPattern(0)--->str=1
// 4️⃣ starPattern(0) hits base case → returns
//__________________________________________________
// Step	Function call	Does this first	Then prints
// 1	starPattern(3)	calls starPattern(2)	waits
// 2	starPattern(2)	calls starPattern(1)	waits
// 3	starPattern(1)	calls starPattern(0)	waits
// 4	starPattern(0)	hits base → returns	 ---> ghum ke starPrint 1 ko dekhne lagega aur uske pass chala jaega 
// 5	starPattern(1)	resumes → prints 1 star  	*
// 6	starPattern(2)	resumes → prints 2 stars	* *
// 7	starPattern(3)	resumes → prints 3 stars	* * *
if(str==0){
    return;
}
starPattern(str-1);   // printing right trangle 
for(int i=0;i<str;i++){
    System.out.print("* ");
}
System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🍳 Welcome to Recursion Rasoi!\n");
        System.out.println("1. Factorial Dish❤️‍🔥");
         System.out.println("2. Fibonacci Fry😧");
       System.out.println("3.🎀 Star Pattern Serve");

      System.out.print("Enter your choice: ");
        int choose = sc.nextInt();
        switch(choose) {
            case 1-> {
                System.out.print("Enter number for factorial : ");
                int fac=sc.nextInt();
                System.out.println(factorial(fac));
            }
            case 2->{
                System.out.print("Enter number for fabonacci: ");
                int fab=sc.nextInt();
                System.out.println(fabonacci(fab));
            }
            case 3 -> {
                System.out.println("Enter size of pattern: ");
                int str = sc.nextInt();
                starPattern(str);
            }
            default -> {
                System.out.println("INVALID INPUT!");
            }
        }
       System.out.println("\n===> THANK YOU for visiting Reccursion  Rasoi! <===");    
    }
    
}
