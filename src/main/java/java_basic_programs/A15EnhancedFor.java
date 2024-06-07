package java_basic_programs;

public class A15EnhancedFor {
  public static void main(String[] args) {
    // for loop
    int[] Array = {1, 10, 69, 56, 95};
    for (int i = 0; i < Array.length; i++) {
      System.out.println("Array element at position " + i + " is  : " + Array[i]);
    }
    // enhanced for loop
    String[] names = {"Anna", "Bonnie", "Cathy", "David"};
    for (String name : names) {
      System.out.println(name);
    }
  }
}
