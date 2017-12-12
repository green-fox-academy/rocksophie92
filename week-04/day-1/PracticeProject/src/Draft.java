import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Draft {
  public int numberOfPlayers;

  public static void main(String[] args) {
    for (int i = 0; i <52 ; i++) {
      System.out.print("true, ");
    }

  }

  public static List<Object> eachPlayer() {
    Draft draft = new Draft();
    String[] names = new String[]{"Beathard, C.J.", "Garoppolo, Jimmy", "Breida, Matt", "Hyde, Carlos", "Juszczyk, Kyle", "McNichols, Jeremy", "Bolden, Victor", "Bourne, Kendrick", "Goodwin, Marquise", "Murphy, Louis", "Robinson, Aldrick", "Taylor, Trent", "Celek, Garrett", "Kittle, George", "Paulsen, Logan", "Barnes, Tim", "Beadles, Zane", "Brown, Trent", "Fusco, Brandon", "Kilgore, Daniel", "Nelson, Kyle", "Staley, Joe", "Tomlinson, Laken", "Williams, Darrell", "Blair, Ronald", "Buckner, DeForest", "Carradine, Tank", "Day, Sheldon", "Douzable, Leger", "Dumervil, Elvis", "Jones, D.J.", "Lynch, Aaron", "Marsh, Cassius", "Mitchell, Earl", "Thomas, Solomon", "Coyle, Brock", "Foster, Reuben", "Harold, Eli", "Lee, Elijah", "Nzeocha, Mark", "Taumoepenu, Pita", "Watson, Dekoda", "Colbert, Adrian", "Exum, Antone", "Hall, Leon", "Johnson, Dontae", "Mabin, Greg", "McCoil, Dexter", "Reid, Eric", "Williams, K'Waun", "Witherspoon, Ahkello", "Gould, Robbie", "Pinion, Bradley"};
    draft.numberOfPlayers = names.length;
    String[] teams = new String[]{"SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF", "SF"};
Boolean[] activity = new Boolean[] {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
String[] positions = new String[]{"QB", "QB", "RB", "RB", "FB", "RB", "WR", "WR", "WR", "WR", "WR", "WR", "TE", "TE", "TE", "C", "OG", "OT", "OG", "C", "LS", "OT", "OG", "OT", "DE", "DT", "DE", "DT", "DE", "DE", "DT", "DE", "DE", "DT", "DE", "MLB", "OLB", "OLB", "LB", "OLB", "OLB", "LB", "DB", "CB", "DB", "CB", "CB", "SS", "SS", "DB", "CB", "K", "P"};
    ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();
    for (int i = 0; i < draft.numberOfPlayers; i++) {
      Map<String, Object> row = new HashMap<String, Object>();
      for (int j = 0; j <draft.numberOfPlayers; j++) {
        Player player = new Player();
      }

      row.put(Player.)
    }
    Map<String, Object> row0 = new HashMap<String, Object>();
    row0.put("name", "Rezso");
    row0.put("age", 9.5);
    row0.put("candies", 2);
    map.add(row0);
    for (int i = 0; i <; i++) {

    }
    return
  }

  public static HashMap<Object, Object> draft() {
    HashMap<List, Object> playerList = new HashMap<>();

    for (int i = 0; i < playerList.size(); i++) {
      Player draftedPlayer1 = new Player();
    }
  }
}
