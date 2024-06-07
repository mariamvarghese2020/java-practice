package java_basic_programs;

import java.util.Scanner;

public class A12ForLoop {
  public static void main(String[] args) {
    System.out.println("Enter the limit :");
    Scanner scanner=new Scanner(System.in);
    int limit=scanner.nextInt();
    scanner.close();
    System.out.println("The list of numbers : ");
    for(int i=1;i<=limit;i++){
      System.out.println(i);
    }
    System.out.println("Reverse list :");
    for(int i=limit;i>=1;i--){
      System.out.println(i);
    }
  }
}
