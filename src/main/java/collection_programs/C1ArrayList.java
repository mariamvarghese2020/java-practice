package collection_programs;

import java.util.ArrayList;
import java.util.Iterator;

public class C1ArrayList {
  public static void main(String[] args) {
    // 1. add  elements to ArrayList
    ArrayList<Integer> integerArrayList=new ArrayList<>();
    integerArrayList.add(56);
    integerArrayList.add(75);
    integerArrayList.add(89);
    integerArrayList.add(13);

    //2. print all elements of the ArrayList
    for(int e : integerArrayList){
      System.out.println(e);
    }

    //3. to add element to a specific position using index
    System.out.println("Adding element to specific position :");
    integerArrayList.add(0,9);
    System.out.println(integerArrayList);

    //4. remove element from ArrayList using index
    integerArrayList.remove(4);
    System.out.println("Array after removal");
    System.out.println(integerArrayList);

    //5. remove element by value
    integerArrayList.remove(Integer.valueOf(56));
    System.out.println("ArrayList after removing 56 ");
    System.out.println(integerArrayList);

    //6. remove element using iterator

    System.out.println("remove using iterator if >50");
    Iterator iterator=integerArrayList.iterator();
    while (iterator.hasNext()) {

      int x = (Integer)iterator.next();
      if (x >50)
        iterator.remove();
    }
    System.out.println(integerArrayList);

    integerArrayList.add(78);
    integerArrayList.add(99);
    integerArrayList.add(5);
    System.out.println("updated after adding few elements");
    System.out.println(integerArrayList);
    integerArrayList.set(6,100);
    System.out.println(integerArrayList);

  }
}
