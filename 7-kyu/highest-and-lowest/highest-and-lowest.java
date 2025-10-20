import java.util.Arrays;
import java.util.OptionalInt;
​
public class Kata {
  public static String highAndLow(String numbers) {
    OptionalInt min = Arrays.stream(numbers.split(" "))
                            .mapToInt(Integer::parseInt)
                            .min();
    
    OptionalInt max = Arrays.stream(numbers.split(" "))
                            .mapToInt(Integer::parseInt)
                            .max();
    
//     if (min.isPresent() && max.isPresent()) {
      return max.getAsInt() + " " + min.getAsInt();
//     } else {
//       return "";
//     }
  }
}
​