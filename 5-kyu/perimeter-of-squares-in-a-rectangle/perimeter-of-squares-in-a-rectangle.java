import java.math.BigInteger;
​
public class SumFct {
  public static BigInteger perimeter(BigInteger n) {
      BigInteger a = BigInteger.ONE;
      BigInteger b = BigInteger.ONE;
      BigInteger sum = BigInteger.TWO;
      for(int i = 1; i<n.intValueExact(); i++){
          BigInteger nextNum = a.add(b);
          sum = sum.add(nextNum);
          a = b;
          b = nextNum;
      }
      return sum.multiply(new BigInteger("4"));
    }
}