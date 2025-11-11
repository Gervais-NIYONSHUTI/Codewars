class Diamond {
    public static String print(int n) {
      if(n < 0 || n % 2 == 0) return null;
      String result = "";
      int x = n/2;
      for(int i = 1; i <= n; i+=2){
        result += " ".repeat(x) + "*".repeat(i) + "\n";
        x--;
      }
      x = 1;
      for(int i = n-2; i >= 1; i-=2){
        result += " ".repeat(x) + "*".repeat(i) + "\n";
        x++;
      }
      return result;
    }
} 