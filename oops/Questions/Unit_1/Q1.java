//basic calculator 
package oops.Questions.Unit_1;

public class Q1 {

  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) {
    if (b == 0) {
      System.out.println("Cannot divide by zero");
      return 0;
    }
    return a / b;
  }

  public void run() {
    int a = 10;
    int b = 5;

    System.out.println("Add: " + add(a, b));
    System.out.println("Subtract: " + subtract(a, b));
    System.out.println("Multiply: " + multiply(a, b));
    System.out.println("Divide: " + divide(a, b));
  }
}
