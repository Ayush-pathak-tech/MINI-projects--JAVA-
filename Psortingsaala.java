
import java.util.Scanner;
public class Psortingsaala {
        // Bubble Sorting 
        public static void BubbleSorting(int arr[]){
            int swapCount = 0;
            int compareCount = 0;

            for(int i=0; i<=arr.length-1;i++){
                for(int j=0; j<arr.length-1-i;j++){/// 
                    compareCount++;
                    if(arr[j]>arr[j+1]){
                        swapCount++;
                        int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    }
                }
            }
            System.out.println("Total comparisons: "+compareCount);
            System.out.println("Totla swaps: "+swapCount);
            printArr(arr);
            System.out.println();
        }
        //________________________________________________
        public static void printArr(int arr[]){
            for(int i=0; i< arr.length;i++){
            System.out.print("Sorted array is: "+arr[i]+" ");
            }
        }
       public static void insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j;
        for (j = i - 1; j >= 0 && arr[j] > key; j--) {
            arr[j + 1] = arr[j]; // Shift right
        }
        arr[j + 1] = key; // Insert key at correct position
        printArr(arr);
    }
} 
    public static void selectionSorting(int arr[]){
        for(int i=0; i<arr.length-1;i++){
         int smallest =i;
          for(int j =i+1; j<arr.length;j++){
            if (arr[smallest]>arr[j]){
                smallest=j;
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp; 
        }
        printArr(arr);
    }
}          
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("***************************\n");
        System.out.print("*WELCOME TO SORTING SHAALA\n");
        System.out.print("***************************\n");

        System.out.println("Sorting Technique choose kero");
        System.out.println("1. Bubble sorting");
        System.out.println("2. Insertion sorting");
        System.out.println("3. Selection sorting");

        System.out.print("Enter your choice (1/2/3): ");
        int choose = sc.nextInt();

        System.out.println("\nNow enter the Array: ");
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Now enter the inputs of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nSorting in progress...\n");
        switch (choose) {
            case 1 ->{
                double start = System.nanoTime();/// 🎯to count time taken in sorting
                BubbleSorting(arr);
                double end = System.nanoTime();
                System.out.println("Bubble sort time: "+(end-start)+"ns");
            } 
            case 2 ->{
                double start = System.nanoTime();/// taken taime count
                 insertionSort(arr);
                double end =  System.nanoTime();
                System.out.println("Insertion Sort Time:"+(end-start));
            }
            case 3 -> {
                double start = System.nanoTime();// work like stop watch
             selectionSorting(arr);
                double end = System.nanoTime();
            System.out.println("selection Sort Time:"+(end-start));
            }    
            default -> {System.out.println("INVALID INPUT!");}    
        }
        System.out.println("\n===> THANK YOU for visiting Sorting Shaala! <===");
    }
}