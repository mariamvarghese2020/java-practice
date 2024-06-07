package Top_Programmming_Exercises;

public class P4_PrimeNumberCheck {
  public static void main(String[] args) {
    System.out.println(isPrime(19));
    System.out.println(isPrime(49));
  }

  public static Boolean isPrime(int n) {
    if (n == 0 || n == 1)
      return false;
    if (n == 2)
      return true;
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
