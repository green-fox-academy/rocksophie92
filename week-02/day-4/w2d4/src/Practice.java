import java.util.*;

import static java.util.Arrays.sort;

public class Practice {

    public static void main (String[] args) {
        //removeDuplicates();
        int[] randomArray = new int[]{34, 12, 24, 9, 5};
        sortNumbers(randomArray, false);

        subStr("this is what I'm searching in", "searching");
    }

    public static void subStr(String string1, String string2) {
        StringBuilder builder = new StringBuilder();

    }

    public static void sortNumbers(int[] numbersArray, boolean isReverse) {



        if (isReverse=true) {
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

        int[] numbersArray= {1, 11, 34, 11, 52, 61, 1, 34};
        Set<Integer> mySet = new HashSet<Integer>();

        for (int i = 0; i < numbersArray.length; i++) {
            mySet.add(numbersArray[i]);
        }


        for (Object anInt: mySet) {
            System.out.print(anInt+" ");

        }


    }




}
