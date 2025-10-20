public class Kata {
  public static void _if(Boolean bool, Runnable func1, Runnable func2) {
    if(bool){
      return func1()
    } else {
      return func2
    }
  }
}