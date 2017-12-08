import java.io.File;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    File file = new File("whatever.txt");
    int lineCount=0;
    try {

      Scanner s = new Scanner(file);
     while (s.hasNext()) {
       System.out.println(s.nextLine());
       lineCount++;
     }
      System.out.println(lineCount);
    } catch (Exception e) {
      System.out.println("problem");
    }
  }
}
