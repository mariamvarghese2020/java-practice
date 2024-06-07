public class P10EvenDigitSum {
  public static void main(String[] args) {
    evenDigitSum(12345);
    evenDigitSum(765322111);
  }

  public static void evenDigitSum(int num) {
    int sum = 0;
    while (num > 0) {
      int digit = num % 10;
      if (digit % 2 == 0) {
        sum += digit;
      }
      num = num / 10;
    }
    System.out.println(sum);
  }

}


