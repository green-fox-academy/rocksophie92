import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class copyFile {
  public static void main(String[] args) {
    copyMachine("first.txt", "second.txt");
  }

  private static boolean copyMachine(String string1, String string2) {
    File file1;
    File file2 = null;
    Writer output;
    List<String> file1Bytes = null;
    List<String> file2Bytes = null;

    try {

      file1 = new File(string1);
      file2 = new File(string2);
      Scanner s = new Scanner(file1);
      output = new BufferedWriter(new FileWriter(string2));
      while (s.hasNext()) {
        output.append(s.nextLine() + "\n");
      }
      output.close();
      file1Bytes = Files.readAllLines(Paths.get(string1));
      file2Bytes = Files.readAllLines(Paths.get(string2));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      System.out.println("File not found");
    } catch (IOException ioe) {
      ioe.printStackTrace();
      System.out.println("IO Exception");
    }
    System.out.println(file1Bytes.equals(file2Bytes));
    return file1Bytes.equals(file2Bytes);
  }
}
