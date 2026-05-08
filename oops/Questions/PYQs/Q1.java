//wap to implement two threads printing numbers alternatively

//it can be solved by making two threads with shared state (as both the threads need to update it) using wait() and notify()
//but if both thread are using shared resource then race condition might occur ,to get rid of it we have to synchronize them 

class NumberPrinter {
  private int number = 1;
  private final int limit = 10;

  public synchronized void printOdd() {
    while (number <= limit) {

      while (number % 2 == 0) {
        try {
          wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

      if (number <= limit) {
        System.out.println(Thread.currentThread().getName() + " : " + number++);
      }

      notify();
    }
  }

  public synchronized void printEven() {
    while (number <= limit) {

      while (number % 2 != 0) {
        try {
          wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

      if (number <= limit) {
        System.out.println(Thread.currentThread().getName() + " : " + number++);
      }

      notify();
    }
  }
}

public class Q1 {

  public static void main(String[] args) {

    NumberPrinter printer = new NumberPrinter();

    Thread t1 = new Thread(() -> {
      printer.printOdd();
    });

    Thread t2 = new Thread(() -> {
      printer.printEven();
    });

    t1.setName("Thread-1");
    t2.setName("Thread-2");

    t1.start();
    t2.start();
  }
}
