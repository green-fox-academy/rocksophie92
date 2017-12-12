public class Main {

  public static void main(String[] args) {
    Aircraft motherShip = new Aircraft(20,30,30,"mothership001");

    F16 f16 = new F16(20,30,30,"f16",16);

    f16.type();
    f16.fight();
  }



}
