import java.util.Scanner;

public class P4IfCodeBlock {
  public static void main(String[] args) {
    System.out.println("Enter age ");
    Scanner scanner= new Scanner(System.in);
    int age = scanner.nextInt();
    scanner.close();
    boolean canVote;

    if(age<=12){
      System.out.println("Kid");
      canVote=false;
    }
    if(age>=13&&age<=19){
      System.out.println("Teen age");
      canVote=false;
    }
    else{
      System.out.println("Adult");
      canVote=true;
    }
    if(canVote){
      System.out.println("can vote");
    }
  }
}
