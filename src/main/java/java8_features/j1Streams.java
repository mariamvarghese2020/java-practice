package java8_features;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class j1Streams {
  public static void main(String[] args) throws IOException {

    //Integer Stream
    System.out.println("Integer Stream");
    IntStream.range(1, 10)
      .forEach(System.out::println);

    //Integer Stream with skip
    System.out.println("Integer Stream with skip");
    IntStream.range(1, 10)
      .skip(5)
      .forEach(x -> System.out.println(x));

    //Integer Stream with Sum
    System.out.println("Integer Stream with Sum");
    System.out.println(
      IntStream.range(1, 5)
        .sum());

    // Stream.Of , sorted,findFirst
    System.out.println("Stream.Of");
    Stream.of("Ava", "Anaya", "Peter", "Tanya", "Candy")
      .sorted()
      .findFirst()
      .ifPresent(System.out::println);

    // Stream from Array, Sort, Filter, Print
    System.out.println("Stream from Array:");
    String[] names={"Alison","Jai", "Pallavi","Simon","Zulma","Avery"};
    Arrays.stream(names)
      .filter(x->x.startsWith("A"))
      .sorted()
      .forEach(System.out::println);

    //Average of squares of an int array
    System.out.println("Average of squares of an int array");
    Arrays.stream(new int[]{2,4,6,8,10})
      .map(x->x*x)
      .average()
      .ifPresent(System.out::println);

    // Stream from list, filter and print
    System.out.println("Stream from List :");
    List<String> people=Arrays.asList("Aami", "Josh","Tani","Aaddya","Arjun","Catherine","Nyla");
    people.stream()
      .map(String::toLowerCase)
      .filter(x->x.startsWith("a"))
      .forEach(System.out::println);
  }
}
