import java.util.Arrays;
public class Kata
{
  public static int sum(int[] numbers)
  {
    System.out.println(Arrays.toString(numbers));
    return Arrays.stream(numbers).sum() - Arrays.stream(numbers).max().getAsInt() - Arrays.stream(numbers).min().getAsInt();
  }
}