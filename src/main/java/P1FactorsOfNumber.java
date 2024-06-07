import java.util.Scanner;

public class P1FactorsOfNumber {
  public static void main(String[] args) {
    System.out.println("Enter number: ");
    Scanner scanner= new Scanner(System.in);
    int num= scanner.nextInt();
    scanner.close();
    if(num<1){
      System.out.println("Invalid input");
    }
    else{
      for(int i=1;i<num;i++){
        if(num%i==0){
          System.out.println( " "+i);
        }
      }
    }

  }
}

