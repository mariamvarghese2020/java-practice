package collection_programs;

import java.util.HashSet;
import java.util.Iterator;

public class C5HashSet {
  public static void main(String[] args) {
    HashSet<String> stringHashSet=new HashSet<>();
    stringHashSet.add("Lion");
    stringHashSet.add("Squirrel");
    stringHashSet.add("Parrot");
    System.out.println(stringHashSet);
    System.out.println("iterate using for loop");
    for(String i:stringHashSet){
      System.out.println(i);
    }
    System.out.println("iterate using for each");
    stringHashSet.forEach(i-> System.out.println(i));
    System.out.println("traverse hashset using iterator");
    Iterator iterator= stringHashSet.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
}
