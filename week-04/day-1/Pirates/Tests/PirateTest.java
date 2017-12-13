import org.junit.Test;
import static org.junit.Assert.*;

public class PirateTest {

  @Test
  public void drinkSomeRumDead() {
    Pirate pirate = new Pirate();
    pirate.setIsDead(true);
    assertEquals(PirateStrings.DEAD_SPEECH, pirate.drinkSomeRum());

  }

  @Test
  public void drinkSomeRumPassedOut() {
    Pirate pirate = new Pirate();
    pirate.setIsDead(false);
    pirate.setIsPassedOut(true);
    assertEquals(PirateStrings.PASSED_OUT, pirate.drinkSomeRum());

  }

  @Test
  public void drinkSomeRumSober() {
    Pirate pirate = new Pirate();
    pirate.setIsDead(false);
    pirate.setIsPassedOut(false);
    assertEquals(PirateStrings.RUMS_CONSUMED, pirate.drinkSomeRum());
  }

  @Test
  public void dieTest() {
    Pirate pirate = new Pirate();
    pirate.setIsDead(false);
    assertEquals(true, pirate.die());
  }

  @Test
  public void statusDead() {
    Pirate pirate = new Pirate();
    pirate.setIsDead(true);
    pirate.setIsPassedOut(true);
    assertEquals(PirateStrings.DEAD.toString(), pirate.pirateStatus());
  }

  @Test
  public void statusPassedOut() {
    Pirate pirate = new Pirate();
    pirate.setIsDead(false);
    pirate.setIsPassedOut(true);
    assertEquals(PirateStrings.PASSED_OUT.toString(), pirate.pirateStatus());
  }

  @Test
  public void statusSober() {
    Pirate pirate = new Pirate();
    pirate.setIsDead(false);
    pirate.setIsPassedOut(false);
    assertEquals(PirateStrings.RUMS_CONSUMED.toString(), pirate.pirateStatus());
  }

  @Test
  public void passOutTest() {
    Pirate pirate = new Pirate();
    pirate.setIsPassedOut(false);
    assertEquals(true, pirate.passOut());
  }

  @Test
  public void higmDrinkMore() {
    Pirate pirate = new Pirate();
    pirate.setIsPassedOut(false);
    pirate.setIsDead(false);
    for (int i = 0; i < 4; i++) {
      pirate.setRumsConsumed(i);
    }
    assertEquals(PirateStrings.DRINK_MORE, pirate.howsItGoingMate());

  }

  @Test
  public void higmPassOut() {
    Pirate pirate = new Pirate();
    pirate.setIsPassedOut(false);
    pirate.setIsDead(false);
    pirate.setRumsConsumed(5);
    assertEquals(PirateStrings.BEFORE_PASSOUT, pirate.howsItGoingMate());
  }

}