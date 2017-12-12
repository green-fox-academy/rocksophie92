import java.util.Random;

public class BattleApp {



  public static void main(String[] args) {
    Random r = new Random();
    Ship ship = new Ship("Black Pearl");
    Ship otherShip = new Ship("Flagship");

    ship.fillShip();
    otherShip.fillShip();
    ship.battle(otherShip);
  }
}
