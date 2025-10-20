 
import java.util.Arrays;
public class Kata {
  public static String highAndLow(String numbers) {
    int[] numbersArray = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
    System.out.println(numbersArray);
    return "throw towel";
  }
}