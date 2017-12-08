import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class writeSingleLine {

  public static void main(String[] args) {
    /*Path path = Paths.get("my-file.txt");
    File file = new File("my-file.txt");
    Writer output;*/
    writeMultipleLines("my-file.txt", "MyName", 10);


/*    try {
      output = new BufferedWriter(new FileWriter("my-file.txt"));
      output.append("Sophie");
      output.close();
    } catch (Exception e) {
      System.out.println("problem");
    }*/
  }

  public static void writeMultipleLines(String path, String line, int number) {
    Writer output;
    try {
      Scanner s = new Scanner(path);
      output = new BufferedWriter(new FileWriter(path));


      for (int i = 0; i < number; i++) {
        output.append(line);
        output.append("\n");
      }
      output.close();
      System.out.println("success");


    } catch (Exception ex) {
      ex.fillInStackTrace();
    }

  }

}
