
// Finding the Longest String using max
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class LongestStringExample {

  public static void main(String[] args) {

    // Creating a list of strings
    List<String> strings = Arrays.asList(
        "apple",
        "banana",
        "strawberry",
        "kiwi");

    // Finding the longest string using Stream max()
    Optional<String> longestString = strings.stream()
        .max((s1, s2) -> s1.length() - s2.length());

    // Printing the result
    longestString.ifPresent(str -> System.out.println("Longest string: " + str));
  }
}
