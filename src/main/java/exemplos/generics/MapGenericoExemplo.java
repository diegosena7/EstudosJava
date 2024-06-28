package exemplos.generics;

import java.util.HashMap;
import java.util.Map;

public class MapGenericoExemplo {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Diego", 35);
        ageMap.put("Nayara", 36);
        ageMap.put("Ryan", 18);

        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
