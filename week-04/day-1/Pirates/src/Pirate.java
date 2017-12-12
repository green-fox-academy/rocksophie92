import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Random;

public class Pirate {

  Random r = new Random();
  static boolean drunk = false;
  static boolean isDead = false;
  static boolean isPassedOut = false;
  static boolean isCaptain = false;
  int rumsConsumed;
  static String status;

  public static final String PASSED_OUT = "passed out";
  public static final String DEAD = "dead";
  public static final String SOBER = "sober (OMG, bring the rum!)";
  public static final String DRUNK = "drunk";

  public void pirateStatus() {
    if (isPassedOut && !isDead) {
      status=PASSED_OUT;
    } else if (isDead) {
      status=DEAD;
    } else if (!drunk && !isDead && !isPassedOut) {
      status=SOBER;
    } else if (!isDead && !isPassedOut && drunk) {
      status = DRUNK;
    }
  }

  public Pirate() {

  }

  public Pirate(boolean drunk) {
    this.drunk = drunk;
  }

  public Pirate(int rumsConsumed) {
    this.rumsConsumed = rumsConsumed;
  }


  public void drinkSomeRum() {
    if (isDead == true) {
      System.out.println("He is dead");
    } else if (isPassedOut == true) {
      System.out.println("He's already passed out, can't drink right now");
    } else {
      drunk = true;
      rumsConsumed++;
    }
  }

  public void howsItGoingMate() {
    if (drunk == true) {
      for (int i = 0; i < r.nextInt(3); i++) {
        System.out.println("Pour me anudder");
      }
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      isPassedOut = true;
    }
  }

  public int brawl(Pirate pirate2, Random r) {
    int result = r.nextInt(3);
    if (result == 0) {
      System.out.println("You died, the other pirate threw you to the sharks");
      this.isDead = true;
    } else if (result == 1) {
      System.out.println("You won the battle!");
      pirate2.isDead = true;
    } else if (result == 2) {
      System.out.println("you were both too drunk and passed out.");
      this.isPassedOut = true;
      pirate2.isPassedOut = true;
    }
    return result;
  }
}
