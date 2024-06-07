package collection_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class C2ArrayListDuplicateRemoval {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(10);
    arrayList.add(20);
    arrayList.add(50);
    arrayList.add(40);
    arrayList.add(30);
    arrayList.add(20);
    System.out.println(arrayList);
    //1. remove duplicates
    System.out.println("Remove duplicates");
    List<Integer> arrayListWithoutDuplicates = arrayList.stream().distinct().collect(Collectors.toList());
    System.out.println("original list");
    System.out.println(arrayList);
    System.out.println("list after removing duplicates");
    System.out.println(arrayListWithoutDuplicates);
    //2. reverse using collections
    System.out.println("Reversing array list elements using collection");
    Collections.reverse(arrayListWithoutDuplicates);
    System.out.println(arrayListWithoutDuplicates);

  //3. create sublist
    ArrayList<String> stringArrayList=new ArrayList<>();
    stringArrayList.add("Anna");
    stringArrayList.add("Carol");
    stringArrayList.add("Norman");
    stringArrayList.add("Zoey");
    stringArrayList.add("Samson");
    stringArrayList.add("Harper");
    stringArrayList.add("Rider");
    System.out.println(stringArrayList);
    System.out.println("Sublist");
    System.out.println(stringArrayList.subList(2,4));




      }

}

