public class Kata {
  public static String rps(String p1, String p2) {
    if(p1.equals(p2)) return "Dram";
    if(p1.equals("scissors")){
      p2.equals("rock") ? "Player 2 won" : "Player 1 won";
    } else if (p1.equals("paper")){
      p2.equals("rock") ? "Player 2 won" : "Player 1 won";
    }
  }
}
​