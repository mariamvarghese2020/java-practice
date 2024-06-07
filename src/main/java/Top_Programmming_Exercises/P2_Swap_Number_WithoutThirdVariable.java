package Top_Programmming_Exercises;

public class P2_Swap_Number_WithoutThirdVariable {
  public static void main(String[] args) {
    int a = 16;
    int b = 25;
    System.out.println("a is " + a + " and b is " + b);
    //swapping
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("a is " + a + " and b is " + b);
  }
}
