 
public class Kata {
  public static String highAndLow(String numbers) {
    String[] numbersArray = Array.stream(numbers.split(" ")).map(num -> Integer.parseInt(num));
    System.out.println(numbersArray);
    return "throw towel";
  }
}