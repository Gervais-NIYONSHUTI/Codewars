 
public class Kata {
  
  public static boolean validParentheses(String parenStr) {
    while(parenStr.contains("()")){
      parenStr = parenStr.replaceAll("\\(\\)", "");
    }
    return parenStr.length() == 0;
  }
}