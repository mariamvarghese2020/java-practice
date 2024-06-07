package collection_programs;

import java.util.Iterator;
import java.util.LinkedList;

public class C4LinkedListString {
  public static void main(String[] args) {
    LinkedList<String> stringLinkedList=new LinkedList<>();
    //1. create string linked list
    System.out.println("String linked list:");
    stringLinkedList.add("NewYork");
    stringLinkedList.add("Dallas");
    stringLinkedList.add("Phoenix");
    stringLinkedList.add("California");
    System.out.println(stringLinkedList);
    //2. check if contains an element
    System.out.println("check if contains Phoenix "+stringLinkedList.contains("Phoenix"));
    System.out.println("check if contains Texas "+stringLinkedList.contains("Texas"));
    //3. change element--SET
    System.out.println("Change element California to San Francisco");
    stringLinkedList.set(3,"SanFrancisco");
    System.out.println(stringLinkedList);
    //4. iterate list using Iterator
    System.out.println("Traverse using iterator");
    Iterator iterator=stringLinkedList.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
    //5. remove all elements of linked list
    stringLinkedList.clear();
    System.out.println("Linked list after CLEAR ");
    System.out.println(stringLinkedList);
  }
}
