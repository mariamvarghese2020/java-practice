package java_basic_programs;

import java.util.Scanner;

public class A9LargestOf3Num {
  public static void main(String[] args) {
    System.out.println("Enter 3 numbers :");
    Scanner scanner=new Scanner(System.in);
    int num1 =scanner.nextInt();
    int num2=scanner.nextInt();
    int num3=scanner.nextInt();
    scanner.close();
    if((num1>num2)&&(num1>num3))
      System.out.println(" largest is " +num1);
    else if((num2>num1)&&(num2>num3))
      System.out.println("largest is  "+num2);
    else
      System.out.println("largest is "+num3);
  }
}
