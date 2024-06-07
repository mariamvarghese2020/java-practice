package java_basic_programs;

import java.util.Scanner;

public class A19FibonacciWhile {
  // 0 1 1 2 3 5 8
  public static void main(String[] args) {
    System.out.println("Enter Limit : ");
    Scanner scanner= new Scanner(System.in);
    int lim=scanner.nextInt();
    scanner.close();
    int i=1,a=1,b=0,sum=0;
    while(i<=lim){
      System.out.print(sum +" ");
      sum=a+b;
      a=b;
      b=sum;
      i++;
    }
  }
}
