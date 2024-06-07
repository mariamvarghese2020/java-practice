public class P2AreaCalculator {
  public static void main(String[] args) {
    System.out.println(area(5.0));
    System.out.println(area(-1));
    System.out.println(area(5.0,4.0));
    System.out.println(area(-1,4.0));
  }
  //method overloading
  //static method invoked with out creating object
  public static double area(double r){
    return r*r*Math.PI;
    }
    public static double area(double x, double y){
    return x*y;
    }
}
