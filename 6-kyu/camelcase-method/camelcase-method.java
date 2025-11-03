import java.util.Arrays;
import java.util.List;
​
public class Solution {
​
    public static String camelCase(String str) {
        String[] words = str.split(" ");
        words = Arrays.stream(words).filter(val -> val != "").toArray(String[]::new);
        List wordsArr = Arrays.stream(words).map(val -> String.valueOf(val.charAt(0)).toUpperCase() + val.substring(1)).toList();
        return String.join( "" ,wordsArr);
    }
​
}
​