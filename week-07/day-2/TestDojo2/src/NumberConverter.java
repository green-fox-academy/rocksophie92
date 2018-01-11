
public class NumberConverter {
  String amount;
  StringBuilder stringBuilder = new StringBuilder();

  String[] tensNames = {
          "",
          " ten",
          " twenty",
          " thirty",
          " forty",
          " fifty",
          " sixty",
          " seventy",
          " eighty",
          " ninety"
  };

  String[] numNames = {
          "",
          " one",
          " two",
          " three",
          " four",
          " five",
          " six",
          " seven",
          " eight",
          " nine",
          " ten",
          " eleven",
          " twelve",
          " thirteen",
          " fourteen",
          " fifteen",
          " sixteen",
          " seventeen",
          " eighteen",
          " nineteen"
  };

  public String converter(double number) {

    if (number < 0) {
      amount = "negative amount";
    }
    if (number == 0) {
      amount = "zero";
    }
    if (number > 0 && number < 20) {
      amount = numNames[(int) number];
    }
    if (number >= 20 && number < 100) {
      amount = convertNumberBelowHundred(number);
    }
    if (number >= 100 && number < 1000) {
      amount = convertNumberFrom100To1000(number);
    }
    if (number >= 1000 && number < 10000) {
      amount = convertNumberFrom1000To10000(number);
    }

    return amount;
  }

  public String convertNumberBelowHundred(double number) {
    stringBuilder.append(tensNames[(int) number / 10]);
    return stringBuilder.append(numNames[(int) number % 10]).toString();
  }

  public String convertNumberFrom100To1000(double number) {
    stringBuilder.append(numNames[(int) number / 100]).toString();
    stringBuilder.append(" hundred");
    return convertNumberBelowHundred(number % 100).toString();
  }

  public String convertNumberFrom1000To10000(double number) {
    stringBuilder.append(numNames[(int) number / 1000]).toString();
    stringBuilder.append(" thousand");
    return convertNumberFrom100To1000(number % 1000);
  }
}