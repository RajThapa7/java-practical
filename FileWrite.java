import java.util.*;
import java.io.*;

class FileWrite{
  public static void main(String[] args) {
    try {
    FileWriter writer = new FileWriter("abc.txt");
    writer.write("Hello World");
    writer.write("\n");
    writer.close();
    System.out.println("File written successfully");
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
