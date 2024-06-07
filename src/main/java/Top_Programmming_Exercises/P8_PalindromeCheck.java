package Top_Programmming_Exercises;

public class P8_PalindromeCheck {
  public static void main(String[] args) {
    String input1 = "hello world";
    String input2 = "malayalam";
    System.out.println(checkPalindrome(input1));
    System.out.println(checkPalindrome(input2));
  }

  public static Boolean checkPalindrome(String str) {
    //reverse string
    // to char Array
    char[] input = str.toCharArray();
    StringBuilder output = new StringBuilder();
    for (int i = input.length - 1; i >= 0; i--) {
      output.append(input[i]);
    }
    //convert output to string and return
    String reversedString = output.toString();
    if (str.equals(reversedString))
      return true;
    else
      return false;
  }
}
