import java.util.List;
import java.util.ArrayList;
public class SqInRect {
  
  public static List<Integer> sqInRect(int lng, int wdth) {
    if(lng == wdth) return null;
    List<Integer> list = new ArrayList<>();
    while (wdth > 0 && lng > 0) {
        if (lng <= wdth) {
            list.add(lng);
            wdth -= lng;
        } else {
            list.add(wdth);
            lng -= wdth;
        }
    }
    return list;
  }
}
​