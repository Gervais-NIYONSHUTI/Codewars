import java.util.Arrays;
import java.util.List;
class Solution{
    public static int repeats(int [] arr){
      List<Integer> array1 = Arrays.stream(arr).boxed().toList();
      return array1.stream()
        .filter(val -> array1.indexOf(val) == array1.lastIndexOf(val))
        .reduce(0, (acc,cr) -> acc+cr);
    }
}