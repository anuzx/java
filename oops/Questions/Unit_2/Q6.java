
//METHOD LEVEL SYNCHRONIZATION

// 1. Shared Resource Class
class Data {
  int data;

  public Data(int data) {
    this.data = data;
  }

  // METHOD LEVEL SYNCHRONIZATION
  // The 'synchronized' keyword locks the method for the current object.
  // If Thread 1 is inside this method, Thread 2 must wait outside until Thread 1
  // finishes.
  synchronized void displayData(String threadName) {
    System.out.println(threadName + " Start");
    System.out.println(threadName + " data = " + data);
    System.out.println(threadName + " End");
  }
}

// 2. Thread Task Class (Implements Runnable)
class DataAccess implements Runnable {
  Data dataObj;// dataObj is a variable of type Data

  DataAccess(Data dataObj)// receives a Data object from outside
  {
    this.dataObj = dataObj;
  }

  @Override
  public void run() {
    // Calling the synchronized method
    dataObj.displayData(Thread.currentThread().getName());
  }
}

// 3. Main Execution Class
public class ThreadSyncExample {
  public static void main(String[] args) {
    // Creating a SINGLE shared resource object
    Data sharedData = new Data(10);

    // Creating two threads that will share the SAME object ('sharedData')
    Thread thread1 = new Thread(new DataAccess(sharedData), "FIRST THREAD");
    Thread thread2 = new Thread(new DataAccess(sharedData), "SECOND THREAD");

    // Starting the threads
    thread1.start();
    thread2.start();
  }
}
