import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class decoder {
  public static void main(String[] args) {

    alphabetGenerator();
    writeToFile(getCodedLetters(codeReading("encoded-lines.txt"), 3));
  }

    public static String[] alphabetGenerator() {
      String[] alphabet = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
      for (int i = 0; i < alphabet.length; i++) {
        alphabet[i] = alphabet[i].toLowerCase();
      }
      System.out.println(Arrays.toString(alphabet));
    return alphabet;
  }

  public static String codeReading(String filePath) {
    Scanner s;
    File file = new File(filePath);
    String stringOriginal="";
    try {
      s= new Scanner(file);
      for (int i = 0; i < stringOriginal.length(); i++) {
        stringOriginal = s.nextLine();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException ioe) {
      System.out.println("IOException");
    }
    return stringOriginal;
  }

  public static String getCodedLetters(String string1, int n) {
    char[] charSet=null;
    String[] alphabet = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    for (int i = 0; i < alphabet.length; i++) {
      alphabet[i] = alphabet[i].toLowerCase();
      charSet = alphabet[i].toCharArray();
    }
    String stringNew="";
    ArrayList<Character> charList = new ArrayList<>();
    for (int i = 0; i < string1.length()-1 ; i++) {
      charList.add(string1.charAt(i));
      charList.set(i, charSet[i+n]);
      stringNew= stringNew.concat(String.valueOf(charList));
    }

    return stringNew;
  }

  public static void writeToFile (String string1) {
    File file2 = new File("real-message.txt");
    BufferedWriter writer = null;
    try {
      writer = new BufferedWriter(new FileWriter(file2));
    } catch (IOException e) {
      e.printStackTrace();
    }
    while (string1.length()!=0) {
      try {
        writer.append(string1);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  }
