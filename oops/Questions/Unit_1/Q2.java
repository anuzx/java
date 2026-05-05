//all string realted operations

package oops.Questions.Unit_1;

class StringDemo {
  public static void main(String args[]) {
    String s1 = "Hello";
    String s2 = "World";
    String s3 = new String("Hello");

    System.out.println(s1.length()); // Length
    System.out.println(s1.charAt(1)); // Character at index 1
    System.out.println(s1.concat(s2)); // Concatenation
    System.out.println(s1.equals("hello")); // Case sensitive check
    System.out.println(s1.equalsIgnoreCase("hello")); // Case insensitive

    System.out.println(s1 == s2); // false (reference check)
    System.out.println(s1.equals(s3)); // true (content check)
  }
}
