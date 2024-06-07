package Top_Programmming_Exercises;

public class practice {
  public static void main(String[] args) {
    String input = "Hello my Friend!";
    char[] charArray = input.toCharArray();
    StringBuilder output = new StringBuilder();
    for (int i = charArray.length - 1; i >= 0; i--) {
      output.append(charArray[i]);
    }
    System.out.println(output.toString());
  }
}
