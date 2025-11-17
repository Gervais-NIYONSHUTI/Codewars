import java.util.List;
import java.util.ArrayList;
​
class SumDigPower {    
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> result = new ArrayList<Long>();
        for (long i = a; i <= b; i++) {
            String numStr = String.valueOf(i);
            int sum = 0;
            for(int x = 0; x < numStr.length(); x++) sum += (int) Math.pow(Double.parseDouble(String.valueOf(numStr.charAt(x))), x+1);
            if(sum == i) result.add((long)i);
        }
        return result;
    }
}