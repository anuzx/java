// block level synchronization
//
// // 1. Shared Resource Class
class Data {
  int data;

  public Data(int data) {
    this.data = data;
  }

  // Notice this method is NOT synchronized at the method level
  void displayData(String threadName) {
    System.out.println(threadName + " Start");
    System.out.println(threadName + " data = " + data);
    System.out.println(threadName + " End");
  }
}

// 2. Thread Task Class (Implements Runnable)
class DataAccess implements Runnable {
  Data dataObj; // The shared resource

  DataAccess(Data dataObj) {
    this.dataObj = dataObj;
  }

  @Override
  public void run() {
    // Unsynchronized code can go here (e.g., calculations, printing "Hello")
    // Multiple threads can execute outside the block simultaneously

    // BLOCK LEVEL SYNCHRONIZATION
    // The monitor lock is acquired specifically on the 'dataObj' instance
    synchronized (dataObj) {
      dataObj.displayData(Thread.currentThread().getName());
    }
  }
}

// 3. Main Execution Class
public class BlockSyncExample {
  public static void main(String[] args) {
    // Creating a SINGLE shared resource object
    Data sharedData = new Data(10);

    // Creating two threads sharing the exact same object
    Thread thread1 = new Thread(new DataAccess(sharedData), "FIRST THREAD");
    Thread thread2 = new Thread(new DataAccess(sharedData), "SECOND THREAD");

    // Starting the threads
    thread1.start();
    thread2.start();
  }
}
