package Top_Programmming_Exercises;
//You can also use recursion to print a Fibonacci sequence,
// because the Fibonacci number is generated by adding the previous two numbers in the sequence:
//F(N) = F(N-1) + F(N-2)
public class P6_FibonacciWithRecursion {
  public static void main(String[] args) {
    int limit = 10;
    System.out.print("A Fibonacci sequence of " + limit + " numbers: ");
    for (int i = 0; i < limit; i++) {
      System.out.print(fibonacci(i) + " ");
    }
  }
  public static int fibonacci(int N) {
    if (N <= 1) return N;
    return fibonacci(N - 1) + fibonacci(N - 2);
  }
}
