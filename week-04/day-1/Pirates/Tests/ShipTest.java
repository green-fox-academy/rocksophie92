import org.junit.Test;

import static org.junit.Assert.*;

public class ShipTest {

  @Test
  public void fillShipTest () {
    Ship ship = new Ship();
      assertNotNull(ship.fillShip());
  }

  @Test
  public void battleResultWin () {
    Ship ship = new Ship();
    Ship otherShip = new Ship();
    ship.fillShip();
    otherShip.fillShip();
    ship.setCrewSize(12);
    otherShip.setCrewSize(10);
    assertEquals(true, ship.battle(otherShip));
  }

@Test
  public void battleResultLose () {
    Ship ship = new Ship();
    Ship otherShip = new Ship();
    ship.fillShip();
    otherShip.fillShip();
    ship.setCrewSize(10);
    otherShip.setCrewSize(20);
    assertEquals(false, ship.battle(otherShip));
  }

  @Test
  public void battleResultEquals () {
    Ship ship = new Ship();
    Ship otherShip = new Ship();
    ship.fillShip();
    otherShip.fillShip();
    ship.setCrewSize(10);
    otherShip.setCrewSize(10);
    assertEquals(false, ship.battle(otherShip));
  }

@Test
public void killedPirates () {
  Ship ship = new Ship();
  Ship otherShip = new Ship();
  int initialSize = ship.fillShip().size();
  ship.killPiratesInBattle(ship);
  int newSize = ship.crewSize;
  assertTrue(newSize <= initialSize);
}
}