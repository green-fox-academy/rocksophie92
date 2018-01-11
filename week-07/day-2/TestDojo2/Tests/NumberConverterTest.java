import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberConverterTest {

  NumberConverter numberConverter = new NumberConverter();

  @Test
  public void should_returnTrueIfTextIsCorrect() {
    double number = 99;
    String words = " ninety nine";

    assertEquals(words, numberConverter.converter(number));
  }

  @Test
  public void should_returnTrueWhenAboveHundred() {
    double number = 123;
    String words = " one hundred twenty three";

    assertEquals(words, numberConverter.converter(number));
  }

  @Test
  public void whatIf_negative() {
    double number = -12;
    String words = "negative amount";

    assertEquals(words, numberConverter.converter(number));
  }

  @Test
  public void whatIf_AboveThousand() {
    double number = 1795;
    String words = " one thousand seven hundred ninety five";

    assertEquals(words, numberConverter.converter(number));
  }
}