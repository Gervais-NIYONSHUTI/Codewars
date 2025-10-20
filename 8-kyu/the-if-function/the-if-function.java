 
public class Kata {
  public static void _if(Boolean bool, Runnable func1, Runnable func2) {
    if(bool){
      Runnable func1;
    } else {
      func2();
    }
  }
}