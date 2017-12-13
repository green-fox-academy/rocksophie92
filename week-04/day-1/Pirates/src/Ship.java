import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  Random r = new Random();
   int crewSize;
  static String name;
  static Pirate captain = new Pirate();
  static List<Pirate> crew;


  public void setCrewSize(int crewSize) {
    this.crewSize = crewSize;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCaptain(Pirate captain) {
    this.captain = captain;
  }

  public void setCrew(List<Pirate> crew) {
    this.crew = crew;
  }

  public int getCrewSize() {
    return crewSize;
  }

  public static final String SHIP_STATUS = "The size of the crew of %s is %d, captain drank %d rums so far and he is %s.";
  public static final String BATTLE_WIN_MSG = "You won, now you have %d points";

  public Ship(String name) {
    this.name = name;
  }

  public Ship() {
  }

  public List<Pirate> fillShip() {
    crew = new ArrayList<>();
    for (int i = 0; i < r.nextInt(100) + 1; i++) {
      crew.add(new Pirate());
    }
    crew.add(new Captain());
    crewSize = crew.size();
    System.out.println(String.format(SHIP_STATUS, name, crewSize, captain.rumsConsumed, captain.status));
    return crew;
  }

  public boolean battle(Ship otherShip) {
    if (this.crewSize > otherShip.crewSize) {
      System.out.println(PirateStrings.WIN_MESSAGE);
      captain.drinkSomeRum();
      killPiratesInBattle(otherShip);
      return true;
    } else if (this.crewSize < otherShip.crewSize) {
      System.out.println("You lost!");
      killPiratesInBattle(this);
      return false;
    } else {
      System.out.println("The ships are equally strong, none of them sank today." + " " + this.getCrewSize() + " " + otherShip.getCrewSize());
      return false;
    }
  }

  public void killPiratesInBattle(Ship ship) {
    for (int i = 0; i < r.nextInt(ship.crewSize); i++) {
      ship.crew.remove(i);
      ship.crewSize = ship.crew.size();
    }
    System.out.println(String.format(SHIP_STATUS, ship.name, ship.crewSize, captain.rumsConsumed, captain.status));
  }

}
