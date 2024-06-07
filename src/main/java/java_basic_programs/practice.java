package java_basic_programs;

import java.util.Scanner;

public class practice {
  public static void main(String[] args) {
    System.out.println("Matrix addition");
    System.out.println("enter row and column for first matrix:");
    Scanner scanner = new Scanner(System.in);
    int row1 = scanner.nextInt();
    int column1 = scanner.nextInt();
    System.out.println("enter row and column for second matrix:");
    int row2 = scanner.nextInt();
    int column2 = scanner.nextInt();

    int[][] matrix1 = new int[row1][column1];
    int[][] matrix2 = new int[row2][column2];

    System.out.println("Enter first matrix:");
    for(int i=0;i<row1;i++){
      for(int j=0;j<column1;j++){
        matrix1[i][j]=scanner.nextInt();
      }
    }
    System.out.println("Enter second matrix:");
    for(int i=0;i<row2;i++){
      for(int j=0;j<column2;j++){
        matrix1[i][j]=scanner.nextInt();
      }
    }
    int[][] matrixAddition=new int[row1][column1];
    for(int i=0;i<row1;i++){
     for(int j=0;j<column1;j++){
       matrixAddition[i][j]=matrix1[i][j]+matrix2[i][j];
     }
    }
    for(int i=0;i<row1;i++){
      for(int j=0;j<column1;j++){
                System.out.print(matrixAddition[i][j]+" ");
      }
      System.out.println(" ");


    }
    scanner.close();
  }
}
