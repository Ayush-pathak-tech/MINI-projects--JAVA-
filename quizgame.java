import java.util.Scanner;

public class quizgame {
    public static void main(String[] args) {
        
        String[] questions = {"What is the main function of router?",
                              "Which part of the computer is considered the brain",
                              "What year was Facebook lunched?",
                              "Who is known as the father of computer?",
                              "What was the first programming language?"};

        String[][] options ={{"1.Storing files","2.Encrypting data","3.Directing internet traffic","4.Managing passwords "},
                             {"1.CPU","2.HD","3.RAM","4.GPU"},
                             {"1.2000","2.2004","3.2006","4.2008"},
                             {"1.Steve jobs","2.Bill gates","3.Alan Turing","4.Charles Babbage"},
                             {"1.COBOL","2.C","3.Fortrain","4.Assembly"}};
                             
                             


        int answer[] ={3,1,2,4,3};
        int score= 0;
        
        System.out.println("Welcom to quiz game");

        for(int i=0; i<questions.length; i++){// hamare saare questions print honge
            System.out.println(questions[i]);
            for(String option : options[i]){
                System.out.println(option);
            }

        Scanner sc = new Scanner(System.in);
        System.out.println("ENter guess");
        int guess =sc.nextInt();
       

        if(guess==answer[i]){
            System.out.println("CORRECT!");
             score++;

        }else{
            System.out.println("WRONG!");
        }
    }
    System.out.println("your final score is "+score+" of "+questions.length);



    }
}
