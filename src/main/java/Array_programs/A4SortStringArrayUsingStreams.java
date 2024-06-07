package Array_programs;

import java.util.Arrays;

public class A4SortStringArrayUsingStreams {
  public static void main(String[] args) {
    String[] fruits = {"Apple", "Mango", "Orange", "Kiwi", "Pineapple", "Watermelon"};
    // java 8 streams to sort array

    Arrays.stream(fruits) //create a stream from array
      .sorted() //sort stream
      .forEach(System.out::println);
  }
}
