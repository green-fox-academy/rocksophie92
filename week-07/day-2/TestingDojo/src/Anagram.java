import java.util.Arrays;

public class Anagram {

  public static void main(String[] args) {

    String string1 = "mug";
    String string2 = "gum";
    anagramTest(string1, string2);
  }

  public static boolean anagramTest(String string1, String string2) {

    if (string1 == null || string2 == null || string1=="" || string2=="") {
      return false;
    } else {
      char[] chars1 = string1.toLowerCase().toCharArray();
    char[] chars2 = string2.toLowerCase().toCharArray();
      Arrays.sort(chars1);
      Arrays.sort(chars2);
      Arrays.sort(chars1);
      Arrays.sort(chars2);

      String output1 = new String(chars1);
      String output2 = new String(chars2);

/*      for (int i = 0; i < chars1.length; i++) {
        System.out.println(chars1[i]);
        System.out.println(chars2[i]);
      }*/
      System.out.println(output1.equals(output2));
      return output1.equals(output2);
    }
  }
}
