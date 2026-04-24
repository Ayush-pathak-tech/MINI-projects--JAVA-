import java.util.Scanner;
public class Quizstation {
   static Scanner sc = new Scanner(System.in);
public static void computerScience(){
        String question[]={ "What is the size of int in Java?",
                            "Which keyword is used to inherit a class in Java?",
                            " Which of these is not a Java primitive type?",
                            "What is the default value of a boolean variable in Java?",
                            "Which method is the entry point of a Java program?",
                            ". Which package contains the Scanner class?",
                            "Which of these is used to handle exceptions in Java?",
                            "Which keyword is used to create an object?",
                            "Which operator is used for comparing two values in Java?",
                            "Which of these is a loop control structure in Java?"
                          };
                                //Decision-making: if, switch
// Loops: for, while, do-while
// Branching: break, continue, return
         String options[][] ={{"1) 8 bits." ,"2) 16 bits.", "3) 32 bits." ,"4) 64 bits"},
                              {"1) implement.","2) extends.","3) inherits.","4) interface"},
                              {"1) int.","2) boolean.","3) String.","4) double"},
                              {"1) true." ,"2) 0." ,"3) false.","4) null."},
                              {"1) start()." , "2) init().","3) main().","4) run()"},
                              {"1) java.io.", "2) java.util.","3) java.lang.", "4) java.awt"},
                              {"1) catch.","2) throw.", "3) try-catch.","4) error"},
                              {"1) class.", "2) this.", "3) new." , "4) void"},
                              {"1) =.","2) ==.","3) :=.","4) equals"},
                              {"1) if.", "2) switch.","3) for." ,"4) break"}
                              };
         int answer[]={3,2,3,3,3,2,3,3,2,3 };         
         int score=0;     
          
          for(int i=0;i<question.length;i++)  {
            System.out.println(question[i]);
            for(String option : options[i]){
                System.out.println(option);
           }
           System.out.println("Enter you answer");
           int guess = sc.nextInt();

           if(guess==answer[i]){
            System.out.println("CORECT!");
            score++;

           }else{
            System.out.println("WRONG!");
           }
          }    
          System.out.println("Your score is: "+score+" from "+question.length);
    }


public static void ComputerNetwork1()
{
String question[] = {
    "1. What does one-bit parity check detect?",
    "2. Which of the following is true about even parity?",
    "3. What is the main limitation of single-bit parity?",
    "4. CRC is primarily used for:",
    "5. Which polynomial is used in CRC-16?",
    "6. What is the minimum Hamming distance required to correct single-bit errors?",
    "7. 2D parity can detect:",
    "8. What is the Hamming distance between 1010 and 0011?",
    "9. Which is better at detecting burst errors?",
    "10. In CRC, which operation is used for division?",
     "11. Which of these is true for CRC?",
    "12. Hamming code can:",
    "13. What is the minimum Hamming distance for single error detection?",
    "14. What is the purpose of parity bits in Hamming code?",
    "15. CRC uses which math basis?",
    "16. Which error can single parity detect?",
    "17. Which type of error is hard to detect with parity?",
    "18. A code with distance d can detect up to:",
    "19. A code with distance d can correct up to:",
    "20. 2D parity can detect which error patterns well?"
};

String options[][] = {
    {"1) All single-bit errors", "2) All two-bit errors", "3) All odd-number errors", "4) All burst errors"},
    {"1) Number of 1s is even", "2) Number of 0s is even", "3) Only one 1", "4) Parity bit is always 0"},
    {"1) Can't detect odd errors", "2) Can't detect even errors", "3) Can't detect multiple errors", "4) Can't detect any errors"},
    {"1) Error correction", "2) Compression", "3) Error detection", "4) Encryption"},
    {"1) x^16 + x^12 + x^5 + 1", "2) x^16 + x^15 + 1", "3) x^16 + x^12 + x^5 + x + 1", "4) x^16 + x^14 + 1"},
    {"1) 1", "2) 2", "3) 3", "4) 4"},
    {"1) Only single-bit errors", "2) Only double-bit errors", "3) All single-bit and some double-bit", "4) Only burst errors"},
    {"1) 1", "2) 2", "3) 3", "4) 4"},
    {"1) Single parity", "2) CRC", "3) Checksum", "4) Even parity"},
    {"1) AND", "2) OR", "3) XOR", "4) ADD"},
     {"1) Correct errors", "2) Encrypt data", "3) Detect errors", "4) Compress data"},
    {"1) Only detect errors", "2) Detect and correct errors", "3) Encrypt data", "4) Compress data"},
    {"1) 1", "2) 2", "3) 3", "4) 4"},
    {"1) Data storage", "2) Error detection", "3) Error correction", "4) Both 2 and 3"},
    {"1) Polynomial division", "2) Addition", "3) Multiplication", "4) Subtraction"},
    {"1) Odd-bit errors", "2) Even-bit errors", "3) All errors", "4) No errors"},
    {"1) Single-bit", "2) Even-bit", "3) Odd-bit", "4) Burst"},
    {"1) d errors", "2) d-1 errors", "3) d-1 bits", "4) d bits"},
    {"1) (d-1)/2 errors", "2) d/2 errors", "3) floor((d-1)/2) errors", "4) d errors"},
    {"1) Random single-bit errors", "2) All even-bit errors", "3) Single-bit and some double-bit", "4) Only burst >5 bits"}
};

int answer[] = {1, 1, 3, 3, 3, 3, 3, 3, 2, 3, 3, 2, 2, 4, 1, 1, 2, 2, 3, 3};



 int score1=0;  
 int score2=0;   
          
          for(int i=0;i<question.length;i++)  {
            System.out.println(question[i]);
            for(String option : options[i]){
                System.out.println(option);
           }
           System.out.println("Enter you answer");
           int guess = sc.nextInt();
           sc.nextLine();

           if(guess==answer[i]){
            System.out.println("CORECT!");
            score1++;
           }else{
            System.out.println("WRONG!");
           }
          }    
          

          System.out.println("Do you wanna play quiz 2 of Computer Network II");
          String reply = sc.nextLine().toLowerCase();
          if(reply.equals("play") || reply.equals("yes") || reply.equals("play again")){
            ComputerNetwork2();
            
            int total= score1+score2;
            System.out.println("Total Score of Computer Network: "+total+" from 40 questions");

           }else{
            System.out.println("Your score is: "+score1+" from 20 quetions in Computer Network 1");
          }   
    }


public static void ComputerNetwork2(){
    String question[] = {
    "21. What is the primary goal of error detection codes?",
    "22. Which of these can detect burst errors effectively?",
    "23. The CRC remainder depends on:",
    "24. What does 'generator polynomial' mean in CRC?",
    "25. Hamming distance between 0000 and 1111 is:",
    "26. In even parity, parity bit ensures:",
    "27. Which error can Hamming code correct?",
    "28. Minimum Hamming distance for double error detection?",
    "29. CRC detects errors by checking:",
    "30. In 2D parity, parity is computed over:",
     "31. What does Hamming code add to data bits?",
    "32. Purpose of parity bits in Hamming code?",
    "33. Which error is CRC especially good at detecting?",
    "34. In CRC calculation, which operation is repeatedly used?",
    "35. What is the CRC remainder when data is error-free?",
        "36. Which of these has higher error detection capability?",
    "37. Minimum Hamming distance for correcting 2-bit errors?",
    "38. One-bit parity fails to detect:",
    "39. Which of these is used in CRC calculations?",
    "40. Which layer typically handles error detection in OSI?"
};

String options[][] = {
    {"1) Compression", "2) Detection of errors", "3) Encryption", "4) Data replication"},
    {"1) One-bit parity", "2) CRC", "3) Hamming code", "4) None"},
    {"1) Data and key", "2) Data and generator polynomial", "3) Only key", "4) Only parity bit"},
    {"1) Divisor in binary division", "2) Quotient in division", "3) Remainder", "4) Data bits"},
    {"1) 2", "2) 3", "3) 4", "4) 1"},
    {"1) Odd number of 1s", "2) Even number of 1s", "3) Equal 0s and 1s", "4) All 0s"},
    {"1) Single-bit error", "2) Double-bit error", "3) All errors", "4) No errors"},
    {"1) 1", "2) 2", "3) 3", "4) 4"},
    {"1) Division result", "2) Remainder", "3) Sum of bits", "4) Parity bit"},
    {"1) Rows only", "2) Columns only", "3) Rows and columns", "4) Neither"},
     {"1) Nothing", "2) Extra data bits", "3) Redundant parity bits", "4) Encryption key"},
    {"1) Encrypt data", "2) Detect and correct errors", "3) Compress data", "4) Increase speed"},
    {"1) Random errors", "2) Single-bit errors", "3) Burst errors", "4) No errors"},
    {"1) AND", "2) OR", "3) XOR", "4) Addition"},
    {"1) All 1s", "2) 0", "3) Random bits", "4) 1"},
    {"1) Single parity", "2) 2D parity", "3) CRC", "4) None"},
    {"1) 3", "2) 4", "3) 5", "4) 6"},
    {"1) Single-bit errors", "2) Even-bit errors", "3) Odd-bit errors", "4) Burst errors"},
    {"1) Polynomial division", "2) Addition", "3) Subtraction", "4) Multiplication"},
    {"1) Application", "2) Data Link", "3) Transport", "4) Network"}
};

int answer[] = {2, 2, 2, 1, 3, 2, 1, 3, 2, 3, 3, 2, 3, 3, 2, 3, 5, 2, 1, 2};
int score2=0;     
          
          for(int i=0;i<question.length;i++)  {
            System.out.println(question[i]);
            for(String option : options[i]){
                System.out.println(option);
           }
           System.out.println("Enter you answer");
           int guess = sc.nextInt();
           sc.nextLine();

           if(guess==answer[i]){
            System.out.println("CORECT!");
            score2++;
           }
           else{
            System.out.println("WRONG!");
            System.out.println("Right answer is "+answer[i]);
            
           }
          }      
    }

public static void Java() {
    String question[] = {
    "1. Which keyword is used to define a class in Java?",
    "2. What is the default value of a reference type in Java?",
    "3. Which of these is a valid Java data type?",
    "4. Which method is the entry point of a Java program?",
    "5. What does JVM stand for?",
    "6. What is the output of: System.out.println(10 + 20 + \"30\")?",
    "7. Which of the following is not a Java keyword?",
    "8. How is memory for an object allocated in Java?",
    "9. Which access modifier makes a method accessible within the same package?",
    "10. Which loop guarantees at least one execution?",
    "11. Which of these is not an OOP concept?",
    "12. Which keyword prevents inheritance?",
    "13. What is method overloading?",
    "14. What is method overriding?",
    "15. Which of these allows dynamic method dispatch?",
    "16. What is encapsulation?",
    "17. Which operator is used to create an object?",
    "18. What is 'this' keyword?",
    "19. Which keyword is used for inheritance?",
    "20. What is the superclass of all classes in Java?",
    "21. Which keyword is used to call the constructor of the superclass?",
    "22. Which method is called when an object is garbage collected?",
    "23. Which block is always executed even if an exception is thrown?",
    "24. What is the purpose of try-catch?",
    "25. Which exception is checked at compile time?",
    "26. What is the parent class of Exception class?",
    "27. Which keyword is used to throw an exception?",
    "28. Which of these is a runtime exception?",
    "29. What is the output type of hashCode() method?",
    "30. Which collection allows duplicate elements?",
};

String options[][] = {
    {"1) function", "2) class", "3) Class", "4) class"},
    {"1) null", "2) 0", "3) garbage", "4) undefined"},
    {"1) real", "2) int", "3) num", "4) digit"},
    {"1) main()", "2) start()", "3) public static void main", "4) main"},
    {"1) Java Variable Manager", "2) Java Virtual Machine", "3) Java Verified Mode", "4) Java Visual Monitor"},
    {"1) 1030", "2) 102030", "3) 3030", "4) 3030"},
    {"1) static", "2) finalize", "3) delete", "4) volatile"},
    {"1) Stack", "2) Queue", "3) Heap", "4) Static"},
    {"1) public", "2) private", "3) protected", "4) default"},
    {"1) while", "2) for", "3) do-while", "4) if"},
    {"1) Encapsulation", "2) Polymorphism", "3) Compilation", "4) Inheritance"},
    {"1) static", "2) final", "3) abstract", "4) private"},
    {"1) Same method name with different parameters", "2) Same method in different classes", "3) Changing return type only", "4) Using static methods"},
    {"1) Changing method name", "2) Same method name in child with different body", "3) Changing variable", "4) Removing method"},
    {"1) Overloading", "2) Static methods", "3) Overriding", "4) final methods"},
    {"1) Binding code and data together", "2) Hiding data", "3) Multiple inheritance", "4) Using interfaces"},
    {"1) new", "2) create", "3) make", "4) object"},
    {"1) Refers to parent object", "2) Refers to current object", "3) Creates new object", "4) Deletes object"},
    {"1) implements", "2) extends", "3) inherits", "4) import"},
    {"1) String", "2) Object", "3) System", "4) Class"},
    {"1) super", "2) this", "3) parent", "4) base"},
    {"1) destroy()", "2) finalize()", "3) delete()", "4) clean()"},
    {"1) try", "2) catch", "3) finally", "4) throw"},
    {"1) Looping", "2) Error detection", "3) Exception handling", "4) Synchronization"},
    {"1) NullPointerException", "2) IOException", "3) ArithmeticException", "4) ArrayIndexOutOfBoundsException"},
    {"1) Throwable", "2) Error", "3) RuntimeException", "4) Object"},
    {"1) throws", "2) throw", "3) catch", "4) final"},
    {"1) NullPointerException", "2) IOException", "3) ClassNotFoundException", "4) InterruptedException"},
    {"1) String", "2) int", "3) long", "4) float"},
    {"1) Set", "2) Map", "3) List", "4) None"}
};

int answer[] = {4, 1, 2, 3, 2, 1, 3, 3, 4, 3,3, 2, 1, 2, 3, 1, 1, 2, 2, 2,1, 2, 3, 3, 2, 1, 2, 1, 2, 3};

 int score1=0;  
 int score2=0;   
          
          for(int i=0;i<question.length;i++)  {
            System.out.println(question[i]);
            for(String option : options[i]){
                System.out.println(option);
           }
           System.out.println("Enter you answer");
           int guess = sc.nextInt();
           sc.nextLine();

           if(guess==answer[i]){
            System.out.println("CORECT!");
            score1++;
           }
           else{
            System.out.println("WRONG!");
            System.out.println("CORRECT answer is : "+answer);
           }
          }    
          

          System.out.println("Do you wanna play quiz 2 of JAVA II");
          String reply = sc.nextLine().toLowerCase();
          if(reply.equals("play") || reply.equals("yes") || reply.equals("play again")){
            Java2();
            int total= score1+score2;
            System.out.println("Total Score of Java : "+total+" from 50 questions");
           }
           else{
            System.out.println("Your score is: "+score1+" from 20 quetions in Java 1");
          }
}
    
public static void Java2(){
    String question[] = {
    "31. Which interface is used to implement sorting in Java?",
    "32. What does equals() method compare?",
    "33. Which collection stores key-value pairs?",
    "34. What is the default capacity of ArrayList?",
    "35. Which method is used to remove all elements from a List?",
    "36. What is the output of 5 >> 1 in Java?",
    "37. Which keyword is used to prevent a method from being overridden?",
    "38. Which interface does ArrayList implement?",
    "39. What is the return type of compareTo() in Java?",
    "40. What is autoboxing in Java?",
    "41. Which method is used to start a thread in Java?",
    "42. Which interface must be implemented to create a thread?",
    "43. Which keyword is used to synchronize a block of code?",
    "44. What is the state of a thread after start() is called?",
    "45. Which exception is thrown when thread is interrupted?",
    "46. Which collection is thread-safe?",
    "47. Which Java feature allows multiple methods with same name?",
    "48. Which keyword is used to inherit from a class?",
    "49. Which of these is a marker interface?",
    "50. Which of these provides dynamic method dispatch?"
};

String options[][] = {
    {"1) Comparable", "2) Comparator", "3) Sortable", "4) Orderable"},
    {"1) Object identity", "2) Value equality", "3) Memory location", "4) Address"},
    {"1) List", "2) Map", "3) Set", "4) Array"},
    {"1) 5", "2) 8", "3) 10", "4) 0"},
    {"1) clear()", "2) removeAll()", "3) delete()", "4) empty()"},
    {"1) 10", "2) 3", "3) 2", "4) 5"},
    {"1) abstract", "2) final", "3) static", "4) void"},
    {"1) Set", "2) Collection", "3) List", "4) Queue"},
    {"1) boolean", "2) int", "3) String", "4) float"},
    {"1) Converting int to double", "2) Converting object to primitive", "3) Converting primitive to object", "4) None"},
     {"1) execute()", "2) start()", "3) run()", "4) init()"},
    {"1) Runnable", "2) Threadable", "3) Executor", "4) Callable"},
    {"1) sync", "2) synchronized", "3) mutex", "4) threadsafe"},
    {"1) New", "2) Running", "3) Runnable", "4) Blocked"},
    {"1) InterruptedException", "2) IOException", "3) ThreadException", "4) IllegalStateException"},
    {"1) ArrayList", "2) HashMap", "3) Vector", "4) HashSet"},
    {"1) Inheritance", "2) Overloading", "3) Overriding", "4) Encapsulation"},
    {"1) inherits", "2) extends", "3) implements", "4) imports"},
    {"1) Serializable", "2) Comparator", "3) Runnable", "4) Cloneable"},
    {"1) Static methods", "2) Overloading", "3) Overriding", "4) final methods"}
};

int answer[] = {1, 2, 2, 3, 1, 3, 2, 3, 2, 3,2, 1, 2, 3, 1, 3, 2, 2, 1, 3};

int score2=0;     
          for(int i=0;i<question.length;i++)  {
            System.out.println(question[i]);
            for(String option : options[i]){
                System.out.println(option);
           }
           System.out.println("Enter you answer");
           int guess = sc.nextInt();
           sc.nextLine();

           if(guess==answer[i]){
            System.out.println("CORECT!");
            score2++;
           }else{
            System.out.println("WRONG!");
            System.out.println("Right answer is "+answer[i]);
           }
          }    
          
    }






    public static void main(String[] args) {
        int score1=0;
        int score2=0;
        System.out.println("\n                                                   WELCOME TO QUIZ STATION😎                                             \n");
        System.out.println("1.Computer Science");
        System.out.println("2.Computer Network");
        System.out.println("3.Java ");
        System.out.println("4.DSA");
        System.out.println("5.Digital Logic (basics)");

        System.out.println("choose subject");
        int choose = sc.nextInt();
        if(choose==4 || choose==5){
            System.out.println("SORRY! currently i am working on it");
            return;
        }
        switch (choose) {
            case 1-> computerScience();
            case 2-> ComputerNetwork1();
            case 3 -> Java();
            // case 4-> DSA();
            // case 5-> DigitalLogic();
            default-> System.out.println("INVALID INPUT!"); 
        }
    }
}






    
    
