public class P7SumOfDigits {
  public static void main(String[] args) {
    System.out.println("234 " +sumOfDigits(234));
    System.out.println("56743 "+sumOfDigits(56743));
  }
  public static int sumOfDigits(int num){
    int sum=0;
    if(num<10 && num >0){
      System.out.println("sum : " +num);
    }
    while(num>0){
      int digit;
      digit=num%10;
      sum+=digit;
      num=num/10;

    }
    return sum;
  }
}
