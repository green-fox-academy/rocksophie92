import com.sun.deploy.util.ArrayUtil;

import java.util.*;
import java.util.stream.IntStream;

import static java.util.Arrays.sort;

public class ArrayListPractice {

    public static void main(String[] args) {
      /*  arrayLists();
       practiceLists();
        hashMapPractice();
        replacer();
        urlFix();
        quoteFix();
        todoPrint();
        reverseTexr();

        solarSystem();
        tinder();
        kuty();

        candyShop();
        elementFinder();

        isInList();
        quoteOrder();
        calculator();
        */
        neverGonna();
        database();
    }


    private static void calculator() {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations:
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
        double operand1 = 0, operand2 = 0, result = 0;
        String operator;
        String plus ="+", minus = "-", star= "*", slash= "/", percent= "%";

        System.out.println("Please type in the expression:");
        Scanner o = new Scanner(System.in);
        operator = o.nextLine();
        System.out.println("");
        Scanner s = new Scanner(System.in);
        operand1 = s.nextDouble();
        System.out.println("");
        Scanner z = new Scanner(System.in);
        operand2 = z.nextDouble();
        System.out.println("");

        if (operator.equals(plus)) {
            result = operand1 + operand2;
        }

        if (operator.equals(minus)) {
            result = operand1 - operand2;
        }

        if (operator.equals(star)) {
            result = operand1 * operand2;
        }

        if (operator.equals(slash)) {
            result = operand1 / operand2;
        }

        if (operator.equals(percent)) {
            result = operand1 % operand2;
        }

        System.out.println(result);
    }


    public static void arrayLists() {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);

        for (int i = 0; i < myList.size(); i++) {
            System.out.printf("List item #%d == %d\n", i, myList.get(i));
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

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        Integer fun;
    }

    public static void hashMapPractice() {
        HashMap<String, Boolean> map = new HashMap<>();
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

        example = example.replaceAll("dishwasher", "galaxy");

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

    public static void solarSystem() {
        ArrayList<String> planetList = new ArrayList<>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position

        System.out.println(planetList);

        String saturn = ("Saturn");
        planetList.add(5, saturn);

        System.out.println(planetList);

    }

    public static void tinder() {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));
        ArrayList<String> order = new ArrayList<String>();
        int j = 0;
        for (int k = 0; k < boys.size(); k++) {
            order.add(boys.get(k));
        }
        for (int i = 0; i < girls.size(); i++) {
            j++;
            order.add(i + j, girls.get(i));
            // boys.toArray(order);
        }

        // Join the two lists by matching one girl with one boy in the order list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(order);
        System.out.println("Poor Jeff :(");
    }

    public static void kuty() {
        ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
        // Add "a" to every string in the far list.
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < far.size(); i++) {
            builder.append(far.get(i) + "a, ");
        }

        String fara = builder.toString();

        System.out.println(fara);
    }

    public static void candyShop() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        arrayList.set(1, "Croissant");
        arrayList.set(3, "Ice cream");
        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines

        System.out.println(arrayList);
    }

    public static void elementFinder() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        // Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
        // Do this again with a different solution using different list functions!

        if (arrayList.contains(7)) {
            System.out.println("Hoorray");
        } else {
            System.out.println("Noooooo");
        }

    }

    public static boolean isInList() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        ArrayList<Integer> shortList = new ArrayList<>(Arrays.asList(4, 8, 12, 16));

        if (list.containsAll(shortList)) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }

        // Check if list contains all of the following elements: 4,8,12,16
        // Print "true" if it contains all, otherwise print "false"
        // Can you do both the different approaches you tried in the previous one?

    }

    public static void quoteOrder() {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        list.add(2, list.get(5));
        list.set(6, list.get(3));
        list.remove(3);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {

            builder.append(list.get(i)+" ");
        }

        String listNice = builder.toString();
        System.out.println(listNice);

    }

    private static void neverGonna() {


        int[] notSoCrypticMessage = {1, 12, 1, 2, 11, 1, 7, 11, 1, 49, 1, 3, 11, 1, 50, 11};

        StringBuilder builder = new StringBuilder();

        Map<Integer, String> map = new HashMap<>();

        map.put(7, "run around and desert you");
        map.put(50, "tell a lie and hurt you");
        map.put(49, "make you cry,");
        map.put(2, "let you down");
        map.put(12, "give you up,");
        map.put(1, "Never gonna");
        map.put(11, "\n");
        map.put(3, "say goodbye");

        for (int i=0; i<notSoCrypticMessage.length; i++) {

            map.get(notSoCrypticMessage[i]);
            builder.append(map.get(notSoCrypticMessage[i])+" ");
        }

        String out = builder.toString();
        // Things are a little bit messed up
        // Your job is to decode the notSoCrypticMessage by using the hashmap as a look up table
        // Assemble the fragments into the out variable

        System.out.println(out);
    }

    public static void database() {

    ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

    // Given this list of hashmaps...

    Map<String, Object> row0 = new HashMap<String, Object>();
    row0.put("name", "Rezso");
    row0.put("age", 9.5);
    row0.put("candies", 2);
    map.add( row0 );

    Map<String, Object> row1 = new HashMap<String, Object>();
    row1.put("name", "Gerzson");
    row1.put("age", 10);
    row1.put("candies", 1);
    map.add( row1 );

    Map<String, Object> row2 = new HashMap<String, Object>();
    row2.put("name", "Aurel");
    row2.put("age", 7);
    row2.put("candies", 3);
    map.add( row2 );

    Map<String, Object> row3 = new HashMap<String, Object>();
    row3.put("name", "Zsombor");
    row3.put("age", 12);
    row3.put("candies", 5);
    map.add( row3 );

    Map<String, Object> row4 = new HashMap<String, Object>();
    row4.put("name", "Olaf");
    row4.put("age", 12);
    row4.put("candies", 7);
    map.add( row4 );

    Map<String, Object> row5 = new HashMap<String, Object>();
    row5.put("name", "Teodor");
    row5.put("age", 3);
    row5.put("candies", 2);
    map.add( row5 );

    HashMap<Integer, Integer> candyList =  new HashMap<>();
    int candyValue;
    double ageValue;
        double sum=0;
    // Display the following things:
    //  - Who has got more candies than 4 candies
    //  - Sum the age of people who have lass than 5 candies

        for (int i =0; i<map.size(); i++) {
            candyValue= Integer.parseInt(map.get(i).get("candies").toString());
            candyList.put(i, candyValue);
            if (candyValue > 4) {
                System.out.println("Kid who has more than 4 candies: "+map.get(i).get("name").toString()+" ");
            }
            ageValue = Double.parseDouble(map.get(i).get("age").toString());
            if (candyValue < 5) {
                sum+=ageValue;
            }
            }
            System.out.println("Sum of ages of kids with less than 5 candies :" +sum + "\n");
        }

    }

