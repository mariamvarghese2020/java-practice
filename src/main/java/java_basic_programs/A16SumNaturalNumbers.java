package java_basic_programs;

import java.util.Scanner;

public class A16SumNaturalNumbers {
  public static void main(String[] args) {
    System.out.println("Enter limit : ");
    Scanner scanner = new Scanner(System.in);
    int limit = scanner.nextInt();
    scanner.close();

    System.out.println("limit : "+limit);

    int sum = 0;
    for (int i = 1; i <= limit; i++) {
      sum+=i;
    }
    System.out.println("Sum of "+limit +" natural numbers : "+sum);
  }
}
