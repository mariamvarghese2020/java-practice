public class P6DecimalCompare {
  public static void main(String[] args) {
    decimalComparator(3.765,3.267);
    decimalComparator(3.789,3.789);
  }
  public static void decimalComparator(double a,double b){
    if((a*1000)==(b*1000)){
      System.out.println(+a +" and " +b +" equal up to 3 decimal places");
    }
    else
      System.out.println(+a +" and " +b +"  not equal up to 3 decimal places");
  }
}
