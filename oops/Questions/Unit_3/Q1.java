// Calculating Average using mapToInt

import java.util.Arrays;
import java.util.List;

class AverageExample {

  public static void main(String[] args) {

    // Creating a list of integers
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    // Calculating average using stream
    double average = numbers.stream()
        .mapToInt(Integer::intValue) // Convert Integer to primitive int
        .average() // Calculate average
        .orElse(0); // Return 0 if stream is empty

    // Printing the result
    System.out.println("Average: " + average);
  }
}
