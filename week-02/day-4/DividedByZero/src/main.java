import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    try {
      division();
    } catch (ArithmeticException ae) {
      System.out.println("Hey, you can't do that.");
    }
  }

  public static int division() {


    int dividee = 12;
    Scanner s = new Scanner(System.in);
    int divider = s.nextInt();
    System.out.println(dividee / divider);
    return dividee / divider;
  }
}
