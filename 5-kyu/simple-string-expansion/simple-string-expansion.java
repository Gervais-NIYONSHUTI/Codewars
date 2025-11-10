import java.util.regex.Pattern;
import java.util.regex.Matcher;
​
class Solution{
    public static String solve(String s){
        Pattern pattern = Pattern.compile("[1-9]");
        Matcher matcher = pattern.matcher(s);
        if(matcher.find()){
            int index = matcher.start();
            String pass = s.substring(index, s.lastIndexOf(")"));
            int count = Integer.parseInt(String.valueOf(s.charAt(index)));
            String replace = solve(pass.substring(2)).repeat(count);
            s = s.substring(0, index) + replace + s.substring(s.indexOf(")") + 1);
        }
        return s.replaceAll("[\\(\\)]","");
      }
}