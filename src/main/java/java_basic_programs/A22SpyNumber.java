package java_basic_programs;

import java.util.Scanner;

public class A22SpyNumber {
  //sum of digit is equal to product of digits
  public static void main(String[] args) {
    System.out.println("enter number :");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    scanner.close();
int actual=num;
    int sum = 0, product = 1;
    if (num > 0 && num < 10) {
      System.out.println("sum : " + num);
    }
    while (num > 0) {
      int digit;
      digit = num % 10;
      sum = sum + digit;
      num = num / 10;
      product = product * digit;
    }
    System.out.println("Sum : " + sum);
    System.out.println("Product : " + product);
    if(sum==product)
      System.out.println(actual +" is a spy number ");
    else
      System.out.println(actual +" is not a spy number");
  }
  //https://beginnersbook.com/2015/03/do-while-loop-in-java-with-example/


}
