import com.sun.deploy.util.ArrayUtil;

import java.util.Collections;
import java.util.Arrays;
import java.util.stream.IntStream;

import static java.util.Arrays.sort;


public class arrays {

    public static void main(String[] args) {

        int firstArray[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int secondArray[][] = {{1, 2, 3, 4}, {5, 6, 7, 8, 9}};



        /* arrayGenerator(0, 15, 3);
        arrayGenerator(0, 40, 5);
        display(firstArray);
        compareLength();
        sumElements();
        changeElement();
        incrementElement();
        printAll();
        diagonalMatrix();
        doubleItems();
        appendA();
        sumAll();

        reverse();
 */

        printGrid();
    }

    public static void arrayGenerator(int j, int size, int multiplication) {

        int[] randomArray = new int[size];
        for (j = 0; j < randomArray.length; j++)
            randomArray[j] = j * multiplication;
        System.out.print(Arrays.toString(randomArray));
    }

    public static void multiArrays() {
        int rows = 10;
        int columns = 5;
        int i = 0;
        int j = 0;

        String[][] nextArray = new String[rows][columns];
        for (i = 0; i < rows; i++) {

            for (j = 0; j > columns; j++)
                nextArray[i][j] = i + "" + j;
        }
        System.out.print(nextArray[i][j]);
    }

    public static void display(int x[][]) {

        for (int row = 0; row < x.length; row++) {


            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + "\t");
            }
            System.out.println();
        }
    }


    public static void compareLength() {
        int arrayOne[] = {1, 2, 3};
        int arrayTwo[] = {4, 5};

        if (arrayOne.length > arrayTwo.length) {
            System.out.println(Arrays.toString(arrayOne));
        } else if (arrayOne.length < arrayTwo.length) {
            System.out.println(Arrays.toString(arrayTwo));
        } else {
            System.out.println("They have the same size");
        }
    }

    public static void sumElements() {
        int arrayOne[] = {54, 23, 66, 12};
        System.out.println(Arrays.toString(arrayOne));
        int sum = arrayOne[1] + arrayOne[2];

        System.out.println("Sum of 2nd and 3rd element: " + sum);

    }

    public static void changeElement() {
        int s[] = {1, 2, 3, 8, 5, 6};
        System.out.println(Arrays.toString(s));
        s[3] = 4;

        System.out.println(Arrays.toString(s));
    }

    public static void incrementElement() {
        int t[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(t));
        t[2] += 1;

        System.out.println(Arrays.toString(t));
    }

    public static void printAll() {
        int af[] = {4, 5, 6, 7};
        System.out.println(Arrays.toString(af));
        ;

    }

    public static void diagonalMatrix() {
        int rows = 4;
        int columns = 4;
        int matrix[][] = new int[rows][columns];
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= columns; j++) {
                matrix[i][0] = 0;
            }
        }
        display(matrix);
    }

    public static void doubleItems() {

        int ag[] = new int[5];
        for (int i = 0; i < ag.length; i++) {
            ag[i] = i + 3;
        }
        System.out.println(Arrays.toString(ag));
        for (int i = 0; i < ag.length; i++) {
            ag[i] = (i + 3) * 2;
        }
        System.out.println(Arrays.toString(ag));
    }

    public static void colors() {
        String colors[][] = {{"lime", "forest green", "olive", "pale green", "spring green"},
                {"orange red", "red", "tomato"}, {"orchid", "violet", "pink", "hot pink"}};
        System.out.println(Arrays.toString(colors));
    }

    public static void appendA() {
        String nimals[] = new String[]{"kuty", "cic", "macsk"};
        nimals[0] = nimals[0] + "a";
        nimals[1] = nimals[1] + "a";
        nimals[2] = nimals[2] + "a";
        System.out.println(Arrays.toString(nimals));
    }

    public static void swapElements() {
        String abc[] = new String[]{"first", "second", "third"};
        sort(abc, Collections.reverseOrder());
    }

    public static void sumAll() {
        int ai[] = new int[]{3, 4, 5, 6, 7};
        int sum = IntStream.of(ai).sum();
        System.out.println(Arrays.toString(ai));
        System.out.println("Sum is: " + sum);

    }

    public static void reverse() {
        int[]aj = new int[]{3, 4, 5, 6, 7};
        Integer[] aji = Arrays.stream(aj).boxed().toArray(Integer[]::new);
        sort(aji, Collections.reverseOrder());

    }


    public static void printGrid()
    {
        int[][]a=new int[4][4];
        a[0][0]=1;
        a[1][1]=1;
        a[2][2]=1;
        a[3][3]=1;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.printf("%5d ", a[i][j]);
            }
            System.out.println();
        }
    }
}