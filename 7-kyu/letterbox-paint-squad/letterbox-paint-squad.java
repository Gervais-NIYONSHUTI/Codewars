public class Dinglemouse {
  public static int[] paintLetterboxes(final int start, final int end) {
    int[] result = {0,0,0,0,0,0,0,0,0,0};
    for(int i = start; i <= end; i++){
      String[] newI = String.valueOf(i).split("");
      for(String num : newI) result[Integer.valueOf(num)]++;
    }
    return result;
  }
}