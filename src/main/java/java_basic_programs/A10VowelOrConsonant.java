package java_basic_programs;

import java.util.Scanner;

public class A10VowelOrConsonant {
  public static void main(String[] args) {
    System.out.println("Enter a character: ");
    Scanner scanner= new Scanner(System.in);
    char ch=scanner.next().charAt(0);
    scanner.close();

    boolean isVowel=true;
    switch(ch) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
        isVowel=true;
        break;
      default:
        isVowel=false;
        break;
    }
    System.out.println("the given character is vowel: "+isVowel);
  }
}
