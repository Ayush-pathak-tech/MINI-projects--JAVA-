
import java.util.Random;
import java.util.Scanner;
public class tictac {
    public static void printGame(char[][] gameBoard){
        for(char[] row : gameBoard){
            for(char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    //---------------------------------------------------------------------

    public static void placePiece(char[][] gameBoard, int pos,String user){
        char symble=' ';
        if(user.equals("player ")){
            symble='X';
        }
        else if(user.equals("cpu")){
            symble='0';
        }
        switch (pos) {
        case 1-> gameBoard[0][0]=symble;
        case 2-> gameBoard[0][2]=symble;
        case 3-> gameBoard[0][4]=symble;
        case 4-> gameBoard[2][0]=symble;
        case 5-> gameBoard[2][2]=symble;
        case 6-> gameBoard[2][4]=symble;
        case 7-> gameBoard[4][0]=symble;
        case 8-> gameBoard[4][2]=symble;
        case 9-> gameBoard[4][40]=symble;
        default->System.out.println("INVALID INPUT");
    }
    }
    public static void main(String[] args) {
        
        char gameBoard[][]={{' ','|',' ','|',' '},
                            {'-','+','-','+','-'},
                            {' ','|',' ','|',' '},
                            {'-','+','-','+','-'},
                            {' ','|',' ','|',' '},};

    printGame(gameBoard);
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your placement(1-9)");
    int playerPos=sc.nextInt();
    placePiece(gameBoard,playerPos,"player");
    Random rd=new Random();
    int cpuPos=rd.nextInt(1,10);
    placePiece(gameBoard,cpuPos,"cpu");
    printGame(gameBoard);
}
}
