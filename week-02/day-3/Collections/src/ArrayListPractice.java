import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import static java.util.Arrays.sort;

public class ArrayListPractice {

    public static void main (String[]args) {
arrayLists();
practiceLists();
hashMapPractice();
replacer();
urlFix();
quoteFix();
todoPrint();
reverseTexr();
    }

    public static void arrayLists() {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);

        for (int i=0; i<myList.size(); i++) {
            System.out.printf("List item #%d == %d\n",i, myList.get(i) );
        }
    }

    public static void practiceLists() {
        ArrayList arrayListOne;
        arrayListOne = new ArrayList();

        ArrayList<String> names = new ArrayList<>();

        names.add("Hailey");
        names.add("Jessie");
        names.add("Dave");

        names.add(1, "Ronnie");

        for (int i=0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        Integer fun;
    }

    public static void hashMapPractice() {
       HashMap <String, Boolean> map = new HashMap<>();
       map.put("Peter", true);
       map.put("Hannah", true);
       map.put("Marge", true);
       map.put("Finn", true);

        System.out.println(map);

        map.put("Hannah", false);
        System.out.println(map);
        map.put("Hannah Peter", false);
        System.out.println(map);
    }

    public static void replacer() {
        String example = "In a dishwasher far far away";

        example= example.replaceAll("dishwasher", "galaxy");

        // I would like to replace "dishwasher" with "galaxy" in this example, but it has a problem.
        // Please fix it for me!
        // Expected ouput: In a galaxy far far away

        System.out.println(example);
    }

    public static void urlFix() {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        url = url.replace("https", "https:");
        url = url.replace("bots", "odds");

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        System.out.println(url);
    }
//TODO fix the method below
    public static void quoteFix() {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String missing = " always takes longer than";
        StringBuilder builder = new StringBuilder();

        builder.append(quote);
        builder.insert(20, missing);

        System.out.println(quote);
        String finalString = builder.toString();
        System.out.println(finalString);

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)


    }

    public static void todoPrint() {
        StringBuilder builder = new StringBuilder();
        String todoText = " - Buy milk\n";
        builder.append(todoText);
        builder.append(" - Download games\n");
        builder.append(" - Diablo\n");
        String finalTodoList = builder.toString();
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo


        System.out.println(todoText);
        System.out.println(finalTodoList);

    }

    public static void reverseTexr() {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a function that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        System.out.println(reversed);

       StringBuilder builder = new StringBuilder();
       builder.append(reversed);
       String normal = builder.reverse().toString();
        System.out.println(normal);

    }
}
