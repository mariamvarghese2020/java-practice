package java_basic_programs;

import java.util.Scanner;

public class A18Fibonacci {
  public static void main(String[] args) {
    // 0,1,1,2,3,5,8,13,21
    System.out.println("Enter limit : ");
    Scanner scanner = new Scanner(System.in);
    int lim = scanner.nextInt();
    scanner.close();

    int a = 1, b = 0, sum = 0;
    for (int i = 1; i <= lim; i++) {
      System.out.print(sum + " ");
      sum = a + b;
      a = b;
      b = sum;
    }
  }

}
