package java_basic_programs;

import java.util.Scanner;

public class A2ReadNumber {
  public static void main(String[] args) {
    System.out.println("Enter number : ");
    Scanner scan= new Scanner(System.in);
    int num= scan.nextInt();
    scan.close();
    System.out.println("Entered number is  : "+num);
  }
}
