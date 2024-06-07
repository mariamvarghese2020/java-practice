package Top_Programmming_Exercises;

import java.util.Scanner;

public class P5_Fibonacci_Series {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter limit : ");
    int limit = scanner.nextInt();

    int a = 1, b = 0, sum = 0;
    for (int i = 1; i <= limit; i++) {
      System.out.print(sum + " ");
      sum = a + b;
      a = b;
      b = sum;
    }
  }
}
