package java_basic_programs;

import java.util.Scanner;

public class A20FactorialWhile {
  public static void main(String[] args) {
    // 4!=4x3x2x1
    System.out.println("Enter number : ");
    Scanner scanner=new Scanner(System.in);
    int num=scanner.nextInt();
    scanner.close();
    int fact=1;
    for(int i=1;i<=num;i++){
      fact=fact*i;
    }
    System.out.println(fact);
  }
}
