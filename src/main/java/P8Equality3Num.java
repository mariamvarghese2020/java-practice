public class P8Equality3Num {
  public static void main(String[] args) {
    equality(2,6,4);
    equality(57,57,57);
  }
  public static void equality(int a, int b, int c){
    if(a<0 || b<0 ||c<0){
      System.out.println("Invalid");
    }
    if(a==b && b==c){
      System.out.println("all numbers equal");
    }
    else{
      System.out.println("not equal");
    }
  }
}
