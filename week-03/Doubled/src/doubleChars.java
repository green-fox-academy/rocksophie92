import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class doubleChars {
  public static void main(String[] args) {
    File file = new File("doubles.txt");
    ArrayList<String> line = null;
    String stringTarget=null;
    int lineCount = 0;
    try {
      Scanner s = new Scanner(file);
      while (s.hasNext()) {
        for (int i = 0; i < lineCount; i++) {
          line.add(i, s.nextLine());
          stringTarget=deDuplicator(s.nextLine());
          lineCount++;
        }
        System.out.println(stringTarget);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static String deDuplicator(String yourString) {
    String newString="";
    StringBuffer stringBuffer = new StringBuffer();

    stringBuffer.append(yourString);

    for (int i = 0; i < yourString.length(); i++) {
      if (i % 2 != 0) {
        stringBuffer.deleteCharAt(i);
      }
    }
    newString=stringBuffer.toString();
    return newString;
  }
}