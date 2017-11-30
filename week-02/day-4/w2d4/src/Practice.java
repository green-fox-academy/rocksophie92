import com.sun.deploy.util.ArrayUtil;

import java.util.*;

import static java.util.Arrays.sort;

public class Practice {

    public static void main(String[] args) {
        //removeDuplicates();
        int[] randomArray = new int[]{34, 12, 24, 9, 5};
        String[] steveJobsTodoList = new String[]{"stay", "hungry", "stay", "foolish"};
        String fool = "fool";
        // sortNumbers(randomArray, false);

        //  subStr("this is what I'm searching in", "searching");

        // subInt(randomArray, 6);

        subStrList(fool, steveJobsTodoList);
    }

    private static void subStrList(String randomString, String[] randomList) {
        boolean isIncluded;
        String listString = "";
        int numberOfElement = 0;

        for (int i = 0; i < randomList.length; i++) {
            listString = randomList[i];
            if (listString.contains(randomString) || listString.startsWith(randomString)) {
                isIncluded = true;
                numberOfElement = i;

            } else {
                isIncluded = false;
            }
        }
        if (isIncluded = false) {
            System.out.println("-1");
        }
        System.out.println(numberOfElement);
    }

    private static void subInt(int[] simpleArray, int number) {
        boolean isIncluded;
        String listString = "";
        String numberString = String.valueOf(number);
        int ind = 0;
        int numberOfElement = 0;
        ArrayList<Integer> newArrayList = new ArrayList<>();

        for (int i = 0; i < simpleArray.length; i++) {
            listString = String.valueOf(simpleArray[i]);
            if (listString.contains(numberString) || listString.startsWith(numberString)) {
                isIncluded = true;
                numberOfElement = i;
                ind = listString.indexOf(numberString);
                newArrayList.add(numberOfElement);

            } else {
                isIncluded = false;
            }
        }
        if (isIncluded = false) {
            System.out.println("[]");
        }
        System.out.println(newArrayList);
    }


    public static void subStr(String string1, String string2) {
        boolean isIncluded;
        int ind = string1.indexOf(string2);

        if (string1.contains(string2)) {
            isIncluded = true;
            System.out.println(ind);
        } else {
            isIncluded = false;
            System.out.println("Second string is not the part of the first string: -1");
        }
    }

    public static void sortNumbers(int[] numbersArray, boolean isReverse) {


        if (isReverse = true) {
            Integer[] reversedArray = Arrays.stream(numbersArray).boxed().toArray(Integer[]::new);
            sort(reversedArray, Collections.reverseOrder());
            System.out.println(Arrays.toString(reversedArray));
        } else {
            Arrays.sort(numbersArray);
            System.out.println(Arrays.toString(numbersArray));
        }

    }

    public static void removeDuplicates() {

        ArrayList<Integer> listOne = new ArrayList<>();

        int[] numbersArray = {1, 11, 34, 11, 52, 61, 1, 34};
        Set<Integer> mySet = new HashSet<Integer>();

        for (int i = 0; i < numbersArray.length; i++) {
            mySet.add(numbersArray[i]);
        }


        for (Object anInt : mySet) {
            System.out.print(anInt + " ");

        }


    }


}
