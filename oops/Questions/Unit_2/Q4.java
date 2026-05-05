package oops.Questions.Unit_2;

// ways to create threads :
// 1. extending Thead class from java.lang.Thread
// 2. implementing Runnable interface from java.lang.Runnable

//1.
class Mythread extends Thread {

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

class Q4 {
  public static void main(String[] args) {
    System.out.println("Main thread started");

    Mythread t1 = new Mythread();
    t1.setName("Thread A"); // custom name of the thread

    Mythread t2 = new Mythread();
    t2.setName("Thread B");

    t1.start();
    t2.start();

    System.out.println("Main thread ended");
  }
}
