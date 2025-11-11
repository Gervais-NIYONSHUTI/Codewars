import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;
public class PeteBaker {
  public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
     ArrayList<Integer> cakes = new ArrayList<>();
        for(Map.Entry<String,Integer> entry: recipe.entrySet()){
            if(available.get(entry.getKey())== null) return 0;
            cakes.add(available.get(entry.getKey())/recipe.get(entry.getKey()));
        }
    Collections.sort(cakes);
    return cakes.get(0);
  }
}