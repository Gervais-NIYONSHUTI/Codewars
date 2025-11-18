import java.math.BigInteger;
public class Kata{
  public static String Factorial(int n) {
    System.out.println(n);
    if(n < 0) return null;
    BigInteger sum = BigInteger.ONE;
    for(long i = 1; i <= (long) n; i++) sum = sum.multiply(new BigInteger(String.valueOf(i)));
    return String.valueOf(sum);
  }
​
}