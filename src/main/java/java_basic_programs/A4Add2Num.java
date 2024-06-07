package java_basic_programs;

import java.util.Scanner;

public class A4Add2Num {
  public static void main(String[] args) {
    System.out.println("Enter first number : ");
    Scanner scanner=new Scanner(System.in);
    int num1=scanner.nextInt();
    System.out.println("Enter second number: ");
    int num2=scanner.nextInt();
    scanner.close();
    int sum=num1+num2;
    System.out.println("Sum of "+num1 +" and "+num2 +" is " +sum);
  }
}
