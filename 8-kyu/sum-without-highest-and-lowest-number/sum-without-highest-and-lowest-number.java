import java.util.Arrays;
public class Kata
{
  public static int sum(int[] numbers)
  {
    return (numbers == null || numbers.length < 2) ? 0 : Arrays.stream(numbers).sum() - Arrays.stream(numbers).max().getAsInt() - Arrays.stream(numbers).min().getAsInt();
  }
}