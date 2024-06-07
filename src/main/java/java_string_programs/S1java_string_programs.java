package java_string_programs;

import java.util.Arrays;
import java.util.Scanner;

public class S1java_string_programs {
  public static void main(String[] args) {
    // 1. input String
    System.out.println("Enter String : ");
    Scanner scanner=new Scanner(System.in);
    String input =scanner.nextLine();
    scanner.close();

    //2. reverse string
    String reverseOutput="";
    int strLength=input.length();
    for(int i=strLength-1;i>=0;i--){
      reverseOutput= reverseOutput+input.charAt(i);

    }
    System.out.println("reversed string : " +reverseOutput);

    //3. check palindrome
    if(input.equalsIgnoreCase(reverseOutput)){
      System.out.println("Palindrome");
    }
    else
    {
      System.out.println("not palindrome");
    }
  //4. create string array
   String[] names={"Lilly","Jacob","Zoey","Sedric"};
    Arrays.sort(names);
    for(int i=0;i<names.length;i++){
      System.out.println(names[i]);
    }
  }
}
