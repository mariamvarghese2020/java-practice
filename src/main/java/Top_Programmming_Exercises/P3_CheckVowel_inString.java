package Top_Programmming_Exercises;

public class P3_CheckVowel_inString {
  public static void main(String[] args) {
    String input1="Hello";
    String input2="xyz";
    System.out.println(vowelCheck(input1));
    System.out.println(vowelCheck(input2));
  }
  public static Boolean vowelCheck(String str){
    return  str.toLowerCase().matches(".*[aeiou].*");
  }
}
