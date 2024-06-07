package collection_programs;

import java.util.Collections;
import java.util.HashSet;

public class C6MinMaxInteger {
  public static void main(String[] args) {
    HashSet<Integer> integerHashSet= new HashSet<>();
    integerHashSet.add(45);
    integerHashSet.add(99);
    integerHashSet.add(45);
    integerHashSet.add(8);
//1. max and min element in hashset

    System.out.println("Maximum element : "+Collections.max(integerHashSet));
    System.out.println("Minimum element : "+Collections.min(integerHashSet));
    //2. sorting in hashset

  }
}
