package collection_programs;

import java.util.LinkedList;

public class C3LinkedList {
  public static void main(String[] args) {
    LinkedList<Integer> integerLinkedList = new LinkedList<>();

    //1. create linkedList - add remove update and get
    integerLinkedList.add(99);
    integerLinkedList.add(78);
    integerLinkedList.add(67);
    integerLinkedList.add(89);
    integerLinkedList.add(23);
    System.out.println(integerLinkedList);
    System.out.println("Remove element - index 2");
    integerLinkedList.remove(2);
    System.out.println(integerLinkedList);
    integerLinkedList.set(2, 15);
    System.out.println("Updated element in index 2");
    System.out.println(integerLinkedList);
    System.out.println("GET element -index 2: " + integerLinkedList.get(2));
    System.out.println("add 565 at index 3 : ");
    integerLinkedList.add(3, 565);
    System.out.println(integerLinkedList);


  }
}
