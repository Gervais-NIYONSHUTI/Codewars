class Kata {
    public static String multiTable(int num) {
      String result = "";
        for(int i = 1; i <= 10; i++){
          result += i + " * " + num + " = " + i*num;
          result += (i==10) ? "" : "\n";
        }
      return result;
    }
}