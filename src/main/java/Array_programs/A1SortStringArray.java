package Array_programs;

import java.util.Arrays;
import java.util.Collections;

public class A1SortStringArray {
  public static void main(String[] args) {
    String [] arrayString={"Joanne","Joshua","George","Mariam","Naylaa","Aadam","Ryan"};
    //1. sort in ascending order
    Arrays.sort(arrayString);
    System.out.println("Sorted Array "+Arrays.toString(arrayString));
    //2. sort in descending order
    Arrays.sort(arrayString, Collections.reverseOrder());
    System.out.println("Sorted Array in descending order: "+Arrays.toString(arrayString));
  }
}
