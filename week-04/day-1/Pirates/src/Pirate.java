import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Random;

public class Pirate {

  Random r = new Random();

  static boolean isDead = false;
  static boolean isPassedOut = false;
  static boolean isCaptain = false;
  static int rumsConsumed;
  static String status;
  int result;

  public int getRumsConsumed() {
    return rumsConsumed;
  }

  public static void setIsDead(boolean isDead) {
    Pirate.isDead = isDead;
  }


  public static void setIsPassedOut(boolean isPassedOut) {
    Pirate.isPassedOut = isPassedOut;
  }

  public static void setIsCaptain(boolean isCaptain) {
    Pirate.isCaptain = isCaptain;
  }

  public static void setStatus(String status) {
    Pirate.status = status;
  }

  public static void setRumsConsumed(int rumsConsumed) {
    Pirate.rumsConsumed = rumsConsumed;
  }

  public String pirateStatus() {
    if (isDead) {
      status = PirateStrings.DEAD.toString();
    } else {
      if (isPassedOut) {
        status = PirateStrings.PASSED_OUT.toString();
      } else {
        status = PirateStrings.RUMS_CONSUMED.toString();
      }
    }
    return status;
  }

  public Pirate() {

  }

  public Pirate(int rumsConsumed) {
    this.rumsConsumed = rumsConsumed;
  }


  public PirateStrings drinkSomeRum() {
    if (isDead) {
      System.out.println(PirateStrings.DEAD_SPEECH);
      return PirateStrings.DEAD_SPEECH;
    } else if (isPassedOut) {
      System.out.println(PirateStrings.PASSED_OUT);
      return PirateStrings.PASSED_OUT;
    } else {
      rumsConsumed++;
      return PirateStrings.RUMS_CONSUMED;
    }
  }

  public boolean die() {
    isDead = true;
    return isDead;
  }

  public boolean passOut() {
    isPassedOut = true;
    System.out.println(PirateStrings.PASSED_OUT);
    return isPassedOut;
  }

  public PirateStrings howsItGoingMate() {
    if (rumsConsumed <= 4) {
      System.out.println(PirateStrings.DRINK_MORE);
      rumsConsumed++;
      return PirateStrings.DRINK_MORE;
    } else {
      System.out.println(PirateStrings.BEFORE_PASSOUT);
      isPassedOut = true;
      return PirateStrings.BEFORE_PASSOUT;
    }
  }

  public int brawl(Pirate pirate2) {
    if (!isDead) {
      if (!isPassedOut) {
        if (resultGenerator() == 0) {
          dieInBrawl();
          return 0;
        } else if (resultGenerator() == 1) {
          winInBrawl(pirate2);
          return 1;
        } else {
          bothPassOutInBrawl(pirate2);
          return 2;
        }
      } else {
        System.out.println(PirateStrings.PASSED_OUT.toString());
        return -1;
      }
    } else {
      System.out.println(PirateStrings.DEAD_SPEECH.toString());
      return -1;
    }
  }

  public PirateStrings dieInBrawl() {
    this.die();
    return PirateStrings.DEAD_SPEECH;
  }

  public PirateStrings winInBrawl(Pirate pirate2) {
    System.out.println(PirateStrings.WIN_MESSAGE);
    pirate2.isDead = true;
    return PirateStrings.WIN_MESSAGE;
  }

  public PirateStrings bothPassOutInBrawl(Pirate pirate2) {
    System.out.println(PirateStrings.BOTH_PASSEDOUT_MESSAGE);
    this.isPassedOut = true;
    pirate2.isPassedOut = true;
    return PirateStrings.BOTH_PASSEDOUT_MESSAGE;
  }

  public int resultGenerator() {
    Random r = new Random();
    int randomNum = r.nextInt(3);
    int resultNum;

    if (randomNum == 0) {
      resultNum = 0;
    } else if (randomNum == 1) {
      resultNum = 1;
    } else {
      resultNum = 2;
    }
    return resultNum;
  }
}
