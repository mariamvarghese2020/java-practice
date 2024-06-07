public class P9EqualSum {
  public static void main(String[] args) {
    //sum of first two numbers equals third number
    equalSum(1,1,2);
    equalSum(22,33,55);
    equalSum(2,1,5);
  }
  public static void equalSum(int a, int b,int c){
if ((a+b)==c){
  System.out.println("true");
}
else
  System.out.println("false");
  }
}
