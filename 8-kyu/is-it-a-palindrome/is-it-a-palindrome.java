public class Palindrome {
  public static Boolean isPalindrome(String x) {
    x = x.toLowerCase();
    return x.equals(new StringBuilder(x).reverse().toString());
  }
}