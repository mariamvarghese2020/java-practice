package java_basic_programs;

import java.util.Scanner;

public class A3NumPositiveNegative {
  public static void main(String[] args) {
    System.out.println("Enter a number  : ");
    Scanner scanner = new Scanner(System.in);
    int number =scanner.nextInt();
    scanner.close();
    if(number>0)
      System.out.println("Positive number");
    else if(number==0)
      System.out.println("Neither positive nor negative");
    else
      System.out.println("Negative");
  }
}
