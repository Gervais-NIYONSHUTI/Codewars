public class Kata {
    public static String palindromization(String elements, int n) {
      if(elements == "" || n < 2) return "Error!";
      StringBuilder left = new StringBuilder("");
      StringBuilder right = new StringBuilder("");
      int index = 0;
      for(int i = 0; i < n; i++){
          if(i % 2 == 0){
            left.append(elements.charAt(index));
          }else{
            right.append(elements.charAt(index));
            if(index != (elements.length() - 1)) index++; else index = 0;
          }
      }
      return left.append(right.reverse()).toString();
    }
}