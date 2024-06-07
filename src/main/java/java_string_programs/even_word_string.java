package java_string_programs;

import java.util.Scanner;

public class even_word_string {
  public static void main(String[] args) {
    // 1. input String
    System.out.println("Enter string input: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();


    //2. extract words of the string without split method
    input = input + " ";
    int strLength = input.length();
    int p = 0;
    for (int i = 0; i < strLength; i++) {
      char ch = input.charAt(i);
      if (ch == ' ') {
        String outputWord = input.substring(p, i);
        System.out.println(outputWord);
        p = i + 1;
      }
    }

    //3. with split method
    System.out.println("Enter String input for split :");
    String input2 = scanner.nextLine();
    scanner.close();
    String[] words = input2.split(" ", input2.length());
    int evenWordCount=0;
    for (String w : words) {
      System.out.println(w);

      int wordLength = w.length();
      if (wordLength % 2 == 0) {
        System.out.print(" is an even length word \n");
        evenWordCount++;
      }
    }
    System.out.println("There are "+evenWordCount +" even length words ");

  }


}
