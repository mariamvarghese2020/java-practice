public class Programming_Exercises {
  public static void main(String[] args) {
    //1. Character array initialisation
    char[] charArray = {'J', 'a', 'v', 'a', ' ', 'P', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g'};
    String s1 = new String(charArray);

    //2. String initialisation
    String s2 = "Java Programming";
    // both s1 and s2 are same
    System.out.println(s1);

    //3. Java String Methods
    //charAt(index)--->returns a char value at the given index
    System.out.println("Character at 5 :" + s2.charAt(5));
    //returns -1 because "l" is 1 times lower than "m"

    //compareTo--->compares the given string with the current string lexicographically.
    // It returns a positive number, negative number, or 0.
    //It compares strings on the basis of the Unicode value of each character in the strings.

    String input1="hello";
    String input2="hemlo";
    System.out.println(input1.compareTo(input2));

    //concat-->combines specified string at the end of this string
    String s3="Welcome to ";
    System.out.println(s3.concat(s2));

    //contains-->searches the sequence of characters in this string
    System.out.println("Check if input contains -ava : "+s2.contains("ava"));

    //endsWith-->checks if this string ends with a given suffix.
    System.out.println("check if input ends with ing: "+s2.endsWith("ing"));

    // compares two string and check if they are equal
    System.out.println("check if s1 and s2 are equal: "+s1.equals(s2) );

    //equalsIgnoreCase--->
    String name1="Lal";
    String name2="lal";
    System.out.println(name1 +" and "+name2 +" are "+name1.equals(name2));
    System.out.println(name1 +" and "+name2 +" are "+name1.equalsIgnoreCase(name2));

    //length()
    System.out.println("length of " +name1 +" : "+name1.length());

    //toUpperCase toLowerCase
    System.out.println("toUpperCase toLowerCase : " +name1.toUpperCase()+" "+name1.toLowerCase());

    //startsWith
    System.out.println("check if name starts with s : "+name1.startsWith("A"));

    //substring


  }
}
