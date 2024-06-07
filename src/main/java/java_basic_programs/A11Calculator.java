package java_basic_programs;

import java.util.Scanner;

public class A11Calculator {
  public static void main(String[] args) {
    System.out.println("Enter two numbers :");
    Scanner scanner=new Scanner(System.in);
    int num1=scanner.nextInt();
    int num2=scanner.nextInt();
    System.out.println("Enter which arithmetic operation to perform  (+ - * / %) : ");
    char op=scanner.next().charAt(0);

    switch (op){
      case '+':
        System.out.println("Sum is "+(num1+num2));
        break;
      case '-':
        System.out.println("Difference is " +(num1-num2));
        break;
      case '*':
        System.out.println("Product is "+(num1*num2));
        break;
      case '/':
        System.out.println("Quotient is "+(num1/num2));
        break;
      case '%':
        System.out.println("Remainder after division :"+(num1%num2));
        break;
      default:
        System.out.println("invalid operation");
        break;

    }
  }
}
