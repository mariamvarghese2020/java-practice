package Top_Programmming_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P7_Check_List_ForOddNumbers {
  public static void main(String[] args) {
    // size of list
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of list");
    int limit = scanner.nextInt();
    //input list
    List<Integer> inputList = new ArrayList<Integer>();
    for (int i = 0; i < limit; i++) {
      inputList.add(scanner.nextInt());
    }
      //iterate and check if list has only odd numbers
    boolean onlyOdd=true;
      for (int i : inputList) {
        if (i % 2 == 0)
          onlyOdd=false;
      }
      if(onlyOdd)
        System.out.println("list has only odd numbers");
      else
        System.out.println("List also has even numbers");
    }
}
