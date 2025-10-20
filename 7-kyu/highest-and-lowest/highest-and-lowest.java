import java.util.Arrays;
import java.util.OptionalInt;
public class Kata {
  public static String highAndLow(String numbers) {
    int[] numbersArray = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt);
    System.out.println(numbersArray.min(), numbersArray.max());
    return "throw towel";
  }
}