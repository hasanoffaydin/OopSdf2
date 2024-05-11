package Task4;

import java.util.HashMap;
import java.util.Map;

public class Main {

        public static <K, V> void printMap(Map<K, V> map) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }


        public static void main(String[] args) {
            Map<String, Integer> sampleMap = new HashMap<>();
            sampleMap.put("Apple", 5);
            sampleMap.put("Banana", 10);
            sampleMap.put("Orange", 7);

            printMap(sampleMap);
        }
}


