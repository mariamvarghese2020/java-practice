package java_basic_programs;

import java.util.Scanner;

public class A21HollowSquareStar {
  public static void main(String[] args) {
    System.out.println("enter side length: ");
    Scanner scanner = new Scanner(System.in);
    int length = scanner.nextInt();
    scanner.close();

    for (int i = 0; i <length; i++) {
      for (int j = 0; j <length; j++) {
        if ((i == 0) || (i == (length - 1)) || (j == 0) || (j ==( length - 1))) {
          System.out.print(" *"+" ");
        }
        else {
          System.out.print(" "+" ");
        }

      }
      System.out.println("");
    }
  }
}
