package Top_Programmming_Exercises;

public class P9_RemoveSpace_String {
  public static void main(String[] args) {
    String inputString="Hello, how are you?";
    String inputString2="Hello            there!";
    System.out.println(removeSpace(inputString));
    System.out.println(removeSpace(inputString2));
    System.out.println(removeLeadingTrailingSpace("  abc  def\t"));
  }
  public static String removeSpace(String input){
    char[] characterArray=input.toCharArray();
    StringBuilder output=new StringBuilder();
    for(char i :characterArray ){
      if(!Character.isWhitespace(i))
        output.append(i);
    }
    return output.toString();
  }
  public static String removeLeadingTrailingSpace(String str){
  return str.strip();
  }
}
