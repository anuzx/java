
/**
 * BYTE STREAM :
 *
 * All byte stream classes are derived from two abstract superclasses:
 * InputStream: The superclass for reading byte streams.
 * OutputStream: The superclass for writing byte streams.
 *
 * Important Concrete Classes:
 * FileInputStream,
 * FileOutputStream,
 * BufferedInputStream,
 * BufferedOutputStream
 */

package oops.Questions.Unit_2;

import java.io.*;

class ByteStreamFileDemo {
  public static void main(String[] args) {
    // Declaring streams outside try block for visibility in finally block
    FileInputStream fis = null;
    FileOutputStream fos = null;

    try {
      // 1. Create Stream Objects (Source and Destination)
      fis = new FileInputStream("oops/Questions/Unit_2/files/source.txt");
      fos = new FileOutputStream("oops/Questions/Unit_2/files/destination.txt");

      System.out.println("Available Bytes to Read: " + fis.available());

      int data;
      // 2. Read and Write byte-by-byte. read() returns -1 at EOF.
      while ((data = fis.read()) != -1) {
        fos.write(data);
      }
      System.out.println("Data Copied Successfully via Byte Stream!");

    } catch (IOException e) {
      System.out.println("Exception Occurred: " + e.getMessage());
    } finally {
      // 3. Always close resources in the finally block
      try {
        if (fis != null)
          fis.close();
        if (fos != null)
          fos.close();
      } catch (IOException e) {
        System.out.println(e);
      }
    }
  }
}
