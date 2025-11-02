public class Kata {
  public static String sendMessage(String message) {
    System.out.println(message);
        String result = "";
        boolean upperCase = false;
        for(int i = 0; i < message.length(); i++){
            if(String.valueOf(message.charAt(i)).matches("[A-Z]") && !upperCase){
                upperCase = true;
                result += "#";
            }else if (String.valueOf(message.charAt(i)).matches("[a-z]") && upperCase){
                upperCase = false;
                result += "#";
            }
            if(String.valueOf(message.charAt(i)).matches("[0-9*#]")) {
                if(result.length()>0){
                    result += (message.charAt(i) == result.charAt(result.length() - 1)) ? " " + String.valueOf(message.charAt(i)) + "-" : String.valueOf(message.charAt(i)) + "-";
                } else {
                    result += String.valueOf(message.charAt(i)) + "-";
                }
            }
            String add = check(message.charAt(i));
            if(add.length() > 0) {