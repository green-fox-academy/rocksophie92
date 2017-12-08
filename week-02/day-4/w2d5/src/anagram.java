import com.sun.deploy.util.ArrayUtil;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;
import static java.util.Collections.sort;


public class anagram {

  public static void main(String[] args) {


    isAnagram("IamLordVoldemort", "TomMarvoloRiddle");
    josephus(13);
  }

/*  public static ArrayList<String> palindromeSearcher(String string1) {
    String string2="";
    String string3="";

    ArrayList<String> res = new ArrayList<String>();
    // If input string's length is 1, return {s}
    if (string1.length() == 1) {
      res.add(string1);
    } else if (string1.length() > 1) {
      int lastIndex = string1.length() - 1;
      // Find out the last character
      String last = string1.substring(lastIndex);
      // Rest of the string
      String rest = string1.substring(0, lastIndex);
      // Perform permutation on the rest string and
      // merge with the last character
      res = merge(permutation(rest), last);
    }
    return res;
  }

    ArrayList<String> palindromeList = new ArrayList<>();
    string2 = string1.substring(0);
    palindromeReverser(string2).matches(string2);

    for (int i = 0; i < string1.length(); i++) {
      string2=string1.substring(i);

      palindromeList.add(string2);
      string3=palindromeReverser(string1).substring(i);
      palindromeList.add(string3);
    }
    System.out.println(palindromeList);
    return palindromeList;
  }*/

  public static int josephus(int numberOfSoldiers) {

    ArrayList<Integer> seats = new ArrayList<>();

    for (int i = 0; i < numberOfSoldiers; i++) {
      seats.add(i);

      while (seats.size() > 1) {
        for ( i = 1; i < seats.size(); i++) {
          if (seats.get(i) % 3 == 0) {
            seats.remove(i);
          }
        }
      }
    }

      System.out.println(seats);
      return seats.get(0);
  }



  private static boolean isAnagram(String string1, String string2) {
    return characterizator(string1).equals(characterizator(string2));
  }

  public static String palindromeCreator(String string1) {
    String mirroredString = (palindromeReverser(string1)) + string1;
    System.out.println(mirroredString);
    return mirroredString;
  }

  public static String palindromeReverser(String string1) {
    String reverse = new StringBuilder(string1).reverse().toString();
    //System.out.println(boolCompare(string1, reverse));
    return reverse;
  }

  public static boolean isPalindrome(String string1) {
    return palindromeReverser(string1).matches(string1);
  }

  public static boolean boolCompare(Object a, Object b) {
    if (a.equals(b)) {
      return true;
    } else {
      return false;
    }
  }

  public static List<Character> characterizator(String string1) {
    List<Character> list1 = string1.toLowerCase().chars()
            .mapToObj(c -> (char) c).collect(Collectors.toList());
    Collections.sort(list1);
    return list1;
  }

}