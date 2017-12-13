import java.util.Random;

public class BattleApp {

  public static void main(String[] args) {
    Ship ship = new Ship("Black Pearl");
    Ship otherShip = new Ship("Flagship");


    ship.fillShip();
    otherShip.fillShip();
    ship.battle(otherShip);
  }
}
