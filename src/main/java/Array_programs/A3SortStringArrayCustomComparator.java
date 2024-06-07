package Array_programs;

import java.util.Arrays;
import java.util.Comparator;

public class A3SortStringArrayCustomComparator {
  public static void main(String[] args) {
    String [] flowers={"rose","jasmine","orchid","petunia","hydrangea","hibiscus"};
    //1. sort array of string by length
    Arrays.sort(flowers, Comparator.comparing(String::length));
    System.out.println("Sorted based on length:");
    for(String flower:flowers){
      System.out.println(flower);
    }
  }
}
