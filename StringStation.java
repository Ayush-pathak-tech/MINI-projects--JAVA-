import java.util.Scanner;
public class StringStation {
    // reverse String
    public static String reverseString(String str) throws InterruptedException{
        // initializing 
        String reversed="";
        for(int i=str.length()-1;0<=i;i--){                // str.length()-1; array bna liye jisse hum ab array ko reverse print ker denge
          reversed = reversed+str.charAt(i);
          System.out.println(reversed);
          Thread.sleep(1000);                           // 1 sec delay in output
        }
        return reversed;
 }
   // palindrome check ----> same forward and backward (121)(madam)(mama)                                 
//    🧹 What does .replaceAll("\\s+", "") do
// - Purpose: Removes all whitespace characters from the string.
// - .replaceAll(...) is a method that replaces pattern-based matches using regular expressions.
// - "\\s+" is a regular expression:
// - \\s matches any whitespace character → space, tab, newline, etc.
// - + means one or more of those in a row.
// - "" means: replace them with nothing (i.e., remove them).
  public static String palindromecheak(String str){
    String cleanstr=str.replaceAll("\\s+","").toLowerCase();            //// clean kiya mtlb string se space hta diya aur lower case bna diya
    String  reverse = new StringBuilder(cleanstr).reverse().toString(); // reverse ker diya (cleanstr----> reverse) by Strng builder
    if(reverse.equals(str)){
         System.out.print("This is palindrome String: " + reverse);}
    else{
         System.out.print("This String is not palindrom String: "+reverse);
   }
      return reverse;
    }
  // public static String VowelConsCount(String str){
  //   int vovel=0,consonent=0;
  //   String str1= str.toLowerCase();
  //   for(ch : str.toCharArray()){ // converting string in array String
  //   }
  //   if("aeiou".indexOf(ch))
 // }
public static String CaseConverter(String str){
  StringBuilder result= new StringBuilder();

  for(char ch :str.toCharArray()){
    if(Character.isUpperCase(ch)){
      result.append(Character.toLowerCase(ch));
    }
    else if (Character.isLowerCase(ch)) {
      result.append(Character.toUpperCase(ch));
    }else{
      result.append(ch);
    }
  }
    return result.toString();
}
public static String caseConverter(String str){
  StringBuilder result = new StringBuilder();
  for(char ch : str.toCharArray()){
    if(Character.isUpperCase(ch)){
      result.append(Character.toLowerCase(ch));
    }else if(Character.isLowerCase(ch)){
      result.append(Character.toUpperCase(ch));
    }else{
      result.append(ch);
    }
  }
  return result.toString();
}
    public static void main(String[] args) throws InterruptedException { 
        Scanner sc = new Scanner(System.in);
      System.out.println(" Welcome to String Station "); 
      System.out.println("Choose your string service:");     
      System.out.println("1. Reverse String");
      System.out.println("2. Palindrome Check");
      System.out.println("3. Vowel & Consonant Count ");
      System.out.println("4. Case Converter");
      System.out.println("Choose any one ");
      int choice = sc.nextInt();
      if(choice==3){
        System.out.println("(Vowel & Consonant Count) NOW I AM WORKING ON IT SORRY! ");
        return;
      }
      sc.nextLine();
      System.out.println("Enter String ");
      String str =sc.nextLine();
        switch (choice) {
           case 1-> System.out.println(reverseString(str));
           case 2 ->System.out.println(palindromecheak(str));
            case 3-> System.out.println(caseConverter(str));
          //  case 4-> System.out.println(case converter);
           default->System.out.println("INVALID INPUT!");
        }
 }    
}
