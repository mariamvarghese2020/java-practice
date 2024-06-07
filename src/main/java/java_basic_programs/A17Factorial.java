package java_basic_programs;

import java.util.Scanner;

public class A17Factorial {
  //5!=5x4x3x2x1
  public static void main(String[] args) {
    System.out.println("Enter the number : ");
    Scanner scanner=new Scanner(System.in);
    int num=scanner.nextInt();
    scanner.close();
    int factResult=1;
    for(int i=1;i<=num;i++){
      factResult=factResult*i;
    }
    System.out.println("Factorial of "+num +" is : "+factResult);
  }
}
