import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.sort;

public class anagram {

    public static void main(String[] args) {

        isPalindrome("boab");
        isAnagram("iamlordvoldemort", "tommarvoloriddle");
    }
//TODO fix this, because it doesn't work
    private static boolean isAnagram(String string1, String string2) {
        int string1Length = string1.length();
        int string2Length = string2.length();
        String[] array1 = new String[string1Length];
        String[] array2 = new String[string2Length];

        if (array1.equals(array2)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static boolean isPalindrome(String string1) {

        String reverse = new StringBuffer(string1).reverse().toString();
        if (string1.equals(reverse)) {
            System.out.println("true");
            return true;

        } else {
            System.out.println("false");
            return false;
        }
    }


}