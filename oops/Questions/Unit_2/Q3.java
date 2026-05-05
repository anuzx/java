
package oops.Questions.Unit_2;

import java.io.*;

/**
 * CHARACTER STREAM:
 *
 * All character stream classes are derived from two abstract superclasses:
 * Reader: The superclass for reading character streams.
 * Writer: The superclass for writing character streams
 *
 * Important Concrete Classes:
 * FileReader,
 * FileWriter,
 * BufferedReader,
 * BufferedWriter.
 */

class CharStreamDemo {
  public static void main(String[] args) {
    try {
      // writing data
      // 'true' -> turns on append mode
      FileWriter fw = new FileWriter("oops/Questions/Unit_2/files/notes.txt", true);

      fw.write("song hehehe : ");
      fw.append("jana samjho na dil kehta hai , tere galiyo mein he rehta hai ....");

      // flush -> forces Buffered data to destination before closing
      fw.flush();
      fw.close();
      System.out.println("hahaha Input done");

      // READING data
      FileReader fr = new FileReader("oops/Questions/Unit_2/files/notes.txt");

      int ch = fr.read();
      System.out.println("FILE CONTENT");

      while (ch != -1) {
        System.out.println((char) ch); // type casting integer back to char
        ch = fr.read();
      }

      fr.close();
    } catch (IOException e) {
      System.out.println("IO EXCEPTION :" + e.getMessage());

    }

  }
}
