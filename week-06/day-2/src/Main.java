import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Fox> foxes = new ArrayList<>();
    foxes.add(new Fox("vukk", "cute", "orange"));
    foxes.add(new Fox("bela", "fat", "blue"));
    foxes.add(new Fox("vili", "cute", "green"));
    foxes.add(new Fox("juli", "pallida", "green"));
    foxes.add(new Fox("roka", "pallida", "orange"));


    foxes.stream()
            .filter(x -> x.getColor()=="green")
            .filter(x-> x.getType()=="pallida")
            .map(x-> x.getName())
            .forEach(System.out::println);
  }

}
