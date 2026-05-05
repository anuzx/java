//Method overlaoding and overriding 

class Calculator {
  // overlaoding -> same method name , different parameters
  int add(int a, int b) {
    return a + b;
  }

  double add(double a, double b) {
    return a + b;
  }

}

class Bank {
  int getRate() {
    return 0;
  }
}

class SBI extends Bank {
  // overriding
  int getRate() {
    return 8;
  }
}

class TestPoly {
  public static void main(String args[]) {
    // overlaoding
    Calculator c = new Calculator();
    System.out.println(c.add(10, 20));

    // overriding -> Same method name, same parameters, parent vs child class
    Bank b = new SBI();// upcasting -> done to achieve runtime polymorphism
    System.out.println("Rate:" + b.getRate()); // 8
  }
}
