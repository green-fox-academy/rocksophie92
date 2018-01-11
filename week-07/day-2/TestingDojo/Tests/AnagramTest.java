import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {

  @Test
  public void first() {
    Anagram anagram = new Anagram();
    String string1 = "gum";
    String string2 = "Mug";

    boolean expected = true;

    assertEquals(expected, anagram.anagramTest(string1, string2));
  }

  @Test
  public void should_returnFalse_whenStringsAreNull() {
    Anagram anagram = new Anagram();
    String string1 = null;
    String string2 = null;

    boolean expected = false;

    assertEquals(expected, anagram.anagramTest(string1, string2));
  }

  @Test
  public void should_returnFalse_whenStringsAreEmpty() {
    Anagram anagram = new Anagram();
    String string1 = "";
    String string2 = "";

    boolean expected = false;

    assertEquals(expected, anagram.anagramTest(string1, string2));
  }

}

