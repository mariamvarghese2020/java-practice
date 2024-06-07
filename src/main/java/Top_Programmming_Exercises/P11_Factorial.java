package Top_Programmming_Exercises;

public class P11_Factorial {
  public static void main(String[] args) {
    System.out.println(fact(7));
    System.out.println(fact(10));
    System.out.println(factWithRecursion(6));
  }
  public static int fact(int number){
    int i=1,factorial=1;
    while(i<=number){
      factorial=factorial*i;
      i++;
    }
    return factorial;
  }
  public static int factWithRecursion(int number){
    if(number==1) return 1;
    else
      return (number*factWithRecursion(number-1));
  }
}
