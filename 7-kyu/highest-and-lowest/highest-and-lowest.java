import java.util.Arrays
public class Kata {
  public static String highAndLow(String numbers) {
    String[] numbersArray = Arrays.stream(numbers.split(" ")).map(num -> Integer.parseInt(num));
    System.out.println(numbersArray);
    return "throw towel";
  }
}