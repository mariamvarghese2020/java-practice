package Array_programs;

import java.util.ArrayList;
import java.util.Collections;

public class A2SortStringArrayList {
  public static void main(String[] args) {
    ArrayList<String> stringArrayList=new ArrayList<>();
    stringArrayList.add("Evana");
    stringArrayList.add("Karen");
    stringArrayList.add("Ruan");
    stringArrayList.add("Jeremie");

    //1. sort in ascending order
    Collections.sort(stringArrayList);
    System.out.println("Sorted arraylist: "+stringArrayList);

    //2. sort in descending order
    Collections.sort(stringArrayList,Collections.reverseOrder());
    System.out.println("Sorted arraylist in descending order : "+stringArrayList);
  }
}
