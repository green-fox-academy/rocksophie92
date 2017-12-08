public class Recursion {
  public static void main(String[] args) {

counter(87);
    System.out.println(sum(6));
    powerN(4, 2);

  }

  private static int powerN(int i, int i1) {

    return i;
  }

  public static int counter(int n) {
    if (n == 0) {
      System.out.println("\n");
      return 1;
    } else {
      System.out.println(n);
      return n - counter(n-1);
    }
  }

  public static int sum(int n) {
    if (n==0) {
      return 1;
    } else {
      System.out.println(n);
      return n + sum(n-1);
    }

  }

}
