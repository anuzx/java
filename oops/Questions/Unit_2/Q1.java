// Extend Exception class for compile time exception (checked)
// Extend RuntimeException class for runtime exception (unchecked)

// to pass a custom error string to the parent Throwable class. Methods like
// getMessage(),
// toString(), and printStackTrace() are inherited and used to display the error

// 1. Create the Custom Exception Class
class InvalidAgeException extends Exception {
  public InvalidAgeException(String message) {
    super(message); // Pass message to parent Throwable class
  }
}

// 2. Use it in a program
public class CustomExceptionDemo {
  static void validateAge(int age) throws InvalidAgeException {
    if (age < 18) {
      throw new InvalidAgeException("Custom Error: Age must be 18+");
    } else {
      System.out.println("Welcome!");
    }
  }

  public static void main(String[] args) {
    try {
      validateAge(16);
    } catch (InvalidAgeException e) {
      System.out.println(e.getMessage()); // Prints custom message
    }
  }
}
