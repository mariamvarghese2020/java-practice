package Top_Programmming_Exercises;

public class P1_Reverse_String {
  public static void main(String[] args) {
    String input = "Hello Friend";
    System.out.println(reverse(input));
  }

  public static String reverse(String str) {
    if (str == null) throw new IllegalArgumentException("enter a valid input");

    StringBuilder output = new StringBuilder();

    //convert string to character array
    char[] inputCharArray = str.toCharArray();

    //iterate reverse and append to output --StringBuilder method
    for (int i = inputCharArray.length-1; i >= 0; i--) {
      output.append(inputCharArray[i]);
    }
    //convert output to string and return
    return output.toString();
  }
}


