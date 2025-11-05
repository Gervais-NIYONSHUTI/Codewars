import java.util.ArrayList;
import java.util.Arrays;
​
public class Routes {
   public static String findRoutes(String[][] routes) {
        String[] data = Arrays.deepToString(routes).replaceAll("[\\[\\] ]","").split(",");
        String[] finalData = data;
        data = Arrays.stream(data).filter(v -> Arrays.asList(finalData).indexOf(v) == Arrays.asList(finalData).lastIndexOf(v) && Arrays.asList(finalData).indexOf(v) % 2 == 0).toArray(String[]::new);
        int index = Arrays.asList(finalData).indexOf(data[0]);
        String[] temp= routes[(int)index/2];
        routes[(int)index/2] = routes[0];
        routes[0] = temp;
        ArrayList<String> result = new ArrayList<>();
        result.add(routes[0][0]);
        result.add(routes[0][1]);
        for(int i = 1; i < routes.length; i++) {
            for(int j = 1; j < routes.length; j++) {
                if(routes[j][0].equals(result.get(result.size() - 1))) {
                    result.add(routes[j][1]);
                    break;
                }
            }
        }
        return String.join(", ", result);
    }
}