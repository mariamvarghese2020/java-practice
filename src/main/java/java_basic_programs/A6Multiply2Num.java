package java_basic_programs;

import java.util.Scanner;

public class A6Multiply2Num {
  public static void main(String[] args) {
    System.out.println("Enter numbers : ");
    Scanner scanner=new Scanner(System.in);
    int num1= scanner.nextInt();
    int num2= scanner.nextInt();
    int product=num1*num2;
    System.out.println("Product of "+num1 +" and "+num2 +" is "+product);
  }
}
