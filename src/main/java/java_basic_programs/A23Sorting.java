package java_basic_programs;
//bubble sort
public class A23Sorting {
  public static void main(String[] args) {
    int[] array = {2, 1, 5, 3, 6, 9, 4};
    int n = array.length;
    int temp = 0;
    //1. calculate length
    //2. to swap --temp variable
    //3. outer loop (0th position---till length)
    //4. inner loop (1st----till length-i)
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < (n - i); j++) {
        if (array[j - 1] > array[j]) {
          //swap elements
          temp = array[j - 1];
          array[j - 1] = array[j];
          array[j] = temp;
        }
      }
    }
        for (int i = 0; i < n; ++i)
          System.out.print(array[i] + " ");
        System.out.println();
      }
    }

