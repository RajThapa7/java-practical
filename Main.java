import java.io.*;
import java.util.*;

class Main{

  public static void main(String[] args) {
    try {
      ArrayList<String> fileInput = new ArrayList<String>();
      File file = new File("./demo.txt");
      Scanner scanner = new Scanner(file);

      while(scanner.hasNextLine()){
        fileInput.add(scanner.nextLine());
      }


      FileWriter writer = new FileWriter("demo1.txt");
      for(String i:fileInput){
        writer.write(i);
      }
      writer.write("\n");
      writer.close();
      
    } catch (IOException e) {
      System.out.println("Exception");
    }

    
  }
}
