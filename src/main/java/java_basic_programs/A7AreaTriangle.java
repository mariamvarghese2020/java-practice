package java_basic_programs;

import java.util.Scanner;

public class A7AreaTriangle {
  public static void main(String[] args) {
    System.out.println("enter base : ");
    Scanner scanner=new Scanner(System.in);
    double base=scanner.nextDouble();
    System.out.println("enter height : ");
    double height = scanner.nextDouble();
    scanner.close();
    double area= ((base*height)/2);
    System.out.println("area of triangle = "+area);
  }
}
