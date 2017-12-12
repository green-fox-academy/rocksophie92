import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  Random r = new Random();
  int numberOfWins;
  int crewSize;
  String name;
  Pirate captain = new Pirate();
  List<Pirate> crew;
  public static final String SHIP_STATUS = "The size of the crew of %s is %d, captain drank %d rums so far and he is %s.";
  public static final String BATTLE_WIN_MSG = "You won, now you have %d points";

  public Ship(String name) {
    this.name = name;
  }


  public List<Pirate> fillShip() {
    crew = new ArrayList<>();
    for (int i = 0; i < r.nextInt(100)+1; i++) {
      crew.add(new Pirate(true));
    }
    crewSize= crew.size();
    System.out.println(String.format(SHIP_STATUS, name, crewSize, captain.rumsConsumed, captain.status));
    return crew;
  }

  public boolean battle(Ship otherShip) {
    if (this.crewSize > otherShip.crewSize) {
      this.numberOfWins++;
      System.out.println(String.format(BATTLE_WIN_MSG, this.numberOfWins));
      captain.drinkSomeRum();
      killPiratesInBattle(otherShip);
      return true;
    } else if (this.crewSize < otherShip.crewSize) {
      otherShip.numberOfWins++;
      System.out.println("You lost!");
      killPiratesInBattle(this);

      return false;
    } else {
      System.out.println("The ships are equally strong, none of them sank today.");
      return false;
    }
  }

  public void killPiratesInBattle(Ship ship) {
    for (int i = 0; i <r.nextInt(ship.crewSize) ; i++) {
      ship.crew.remove(i);
      ship.crewSize=ship.crew.size();
    }
    System.out.println(String.format(SHIP_STATUS, ship.name, ship.crewSize, captain.rumsConsumed, captain.status));
  }

}
