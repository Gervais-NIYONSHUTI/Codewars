import java.util.Arrays;
​
public class CharacterCounter {
  public static boolean validateWord(String word) {
    word = word.toLowerCase();
    String[] arr =  word.split("");
    int len = Arrays.stream(arr).filter(val -> val.equals(arr[0])).toArray().length;
    return Arrays.stream(arr).allMatch(val -> Arrays.stream(arr).filter(x -> x.equals(val)).toArray().length == len);
  }
}