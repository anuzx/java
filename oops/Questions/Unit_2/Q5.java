
//2.implementing Runnable interface

class Mythread implements Runnable {

  @Override
  public void run() {
    String threadName = Thread.currentThread().getName();
    System.out.println(threadName + "has started");

    // logic that the thread will execute
    for (int i = 1; i <= 5; i++) {
      try {
        System.out.println(threadName + "is executing iteration:" + i);
        Thread.sleep(500); // pauses the thread
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }

    System.out.println(threadName + "has finished");

  }
}

public class Q5 {
  public static void main(String[] args) {
    System.out.println("Main thread started");

    Mythread mytask = new Mythread();

    Thread t1 = new Thread(mytask, "child thread-1");
    Thread t2 = new Thread(mytask, "child thread-2");

    // start the threads using thread objects
    // mytask.start() will not work because Mythread does not have start() method

    t1.start();
    t2.start();

    System.out.println("main thread finished");
  }
}
