import java.util.Arrays;
public class FindOutlier {
  static int find(int[] integers) {
    int odd = 0, even=0,evenValue = 0, oddValue = 0;
    for(int i : integers){
        if(i%2==0){
            evenValue=i;
            even++;
        } else{
            oddValue = i;
            odd++;
        }
        if(odd > 1 && even == 1) return evenValue;
        else if (even > 1 && odd == 1)  return oddValue;
    }
    return 0;
  }
}