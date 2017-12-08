import java.util.*;
import java.io.*;

public class characterRemover {

  public static void main(String[] args) {
    File file = new File("duplicatedFile.txt");
    File file2 = new File("newFile.txt");
    Scanner s;
    BufferedWriter writer;

    try {
      s = new Scanner(file);
      writer = new BufferedWriter(new FileWriter(file2));
      while (s.hasNextLine()) {
        writer.append(removeLetters(s.nextLine(),2)+"\n");
      }
      writer.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException ioe) {
      System.out.println("IO Exception");
    }
  }

  public static String removeLetters(String string1, int n) {
    String string2="";

    for (int i = 0; i < string1.length()-1 ; i+=n) {
      string2= string2.concat(String.valueOf(string1.charAt(i)));
    }
    return string2;
  }
}

