package Top_Programmming_Exercises;

import java.util.HashMap;
import java.util.Map;

public class C1StringPrograms {
  public static void main(String[] args) {

    // 1. input String
    String input = "Hello World!";
    // System.out.println("Enter input string: ");
    // Scanner scanner=new Scanner(System.in);
    // String input1=scanner.nextLine();
    //scanner.close();

    //2. reverse String ---charArray--append()
    char[] characterArray = input.toCharArray();
    StringBuilder output = new StringBuilder();
    for (int i = characterArray.length - 1; i >= 0; i--) {
      output.append(input.charAt(i));
    }
    String reversedString = output.toString();
    System.out.println("Reversed String : " + reversedString);

    //3. Palindrome
    System.out.println("The given string is Palindrome : " + input.equals(reversedString));

    //4. check if vowel is present in String
    System.out.println("input string  " + input + " contains vowel : " + input.toLowerCase().matches(".*[aeiou].*"));

    //5. remove leading and trailing spaces from a string
    String str = "\t hello removing     end.\t";
    System.out.println(str.strip());

    //6. remove all occurrences of a given character from string
    String inputString = "Go green!Save Earth.Let's Unite!";
    System.out.println("input string :" + inputString);
    String resultString = inputString.replace("e", "");
    System.out.println("output after removing occurrence of e  :" + resultString);

    //7. remove space from string
    System.out.println("removed space from string: " + resultString.replace(" ", ""));

    //8. remove substring from string
    System.out.println("removing substring 'green!': " + inputString.replaceFirst("green!", ""));

    //9. remove all lowercase letters from string
    String input2 = "abc ABC efg EFG hij HIJ";
    System.out.println("remove lowercase letters: " + input2.replaceAll("([a-z])", ""));
    System.out.println("remove uppercase letters: " + input2.replaceAll("([A-Z])", ""));

    //10. remove last character from a String
    String input3 = "Hello Friend!@";
    System.out.println("remove last character from " + input3 + " : " + input3.substring(0, input3.length() - 1));

    //11. get distinct characters and their count in  a string
    String distinctInput = "abcdABCDabcd";
    System.out.println("Input for distinct character count: " + distinctInput);
    char[] charArray = distinctInput.toCharArray();
    Map<Character, Integer> characterCountHashMap = new HashMap<>();
    for (char c : charArray) {
      if (characterCountHashMap.containsKey(c)) {
        characterCountHashMap.put(c, characterCountHashMap.get(c) + 1);
      } else {
        characterCountHashMap.put(c, 1);
      }
    }
    System.out.println(characterCountHashMap);

    //12. count characters in each word for the given string
    String inputSentence = "Once upon a time there were four little Rabbits";
    String[] words = inputSentence.split(" ");
    for (String i : words) {
      if (i.length() > 0) {
        System.out.println(i);
        System.out.println("length of " + i + " is : " + i.length());
      }
    }
    //13. print only even numbered words in a sentence and count how many even numbered words
    System.out.println("Print only even numbered words");
    int evenCount = 0, oddCount = 0;
    for (String i : words) {
      if (i.length() % 2 == 0) {
        System.out.println(i);
        evenCount++;
      } else
        oddCount++;
    }
    System.out.println("Even numbered word count --->" + evenCount);
    System.out.println("Odd numbered word count --->" + oddCount);
//14. count occurrence of a given character in a string
    //check the occurrence of letter 'e'
    char[] letters = inputSentence.toCharArray();
    int letterCount = 0;
    for (char i : letters) {
      if (i == 'e') {
        letterCount++;
      }
    }
    System.out.println("The letter e is occurring " + letterCount + " times.");
    //15. count occurrence of a given character using streams API
    String sentenceInput = "today is a good day";
    char ch = 'a';
    System.out.println("the letter a is occurring " + sentenceInput.chars().filter(i -> i == ch).count() + " times");
    //16. check strings anagram using Hash Map
    //A string is an anagram of another string if it contains the same characters
    // in the same or in different order

    String s1="abcde";
    String s2="baedc";
    System.out.println("Check if s1 and s2 are anagram");
    System.out.println(sortString(s1).equals(sortString(s2)));
  }
  public static String sortString(String input){
    input = input.toLowerCase();
    char[] arrayChar = input.toCharArray();
    char temp;
    for(int i =0; i<arrayChar.length; i++){
      for(int j=i; j<arrayChar.length;j++){
        temp = arrayChar[i];
        if(arrayChar[j]<arrayChar[i]){
          arrayChar[i] = arrayChar[j];
          arrayChar[j]=temp;
        }
      }
    }
    String result = "";
    for (int i=0; i<arrayChar.length;i++){
      result = result + Character.toString(arrayChar[i]);
    }
    return result;
  }
}
