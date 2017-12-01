import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;
import static java.util.Collections.sort;

public class anagram {

  public static void main(String[] args) {
   /* isPalindrome("boab");
    isAnagram("iamlordvoldemorT", "tommarvoloriddle");
    palindromeCreator("whatever");
   */
  }

  private static void isAnagram(String string1, String string2) {
    characterizator(string1);
    System.out.println(boolCompare(characterizator(string1), characterizator(string2)));
  }

  public static String palindromeCreator(String string1) {
    String mirroredString = (palindromeReverser(string1)) + string1;
    System.out.println(mirroredString);
    return mirroredString;
  }

  public static String palindromeReverser(String string1) {
    String reverse = new StringBuffer(string1).reverse().toString();
    System.out.println(boolCompare(string1, reverse));
    return reverse;
  }

  public static boolean isPalindrome(String string1) {
    return palindromeReverser(string1).matches(string1);
  }

  public static boolean boolCompare(Object a, Object b) {
    return a.equals(b);
  }

  public static List<Character> characterizator(String string1) {
    // stream(string1.toCharArray()).boxed().collect(Collectors.toList());
    List<Character> list1 = string1.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    Collections.sort(list1);
    return list1;
  }
}