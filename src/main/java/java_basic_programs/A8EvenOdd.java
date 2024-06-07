package java_basic_programs;

import java.util.Scanner;

public class A8EvenOdd {
  public static void main(String[] args) {
    System.out.println("Enter number : ");
    Scanner scanner=new Scanner(System.in);
   int num= scanner.nextInt();
   scanner.close();
   if(num%2==0)
     System.out.println("even number");
   else
     System.out.println("odd number");
  }
}
