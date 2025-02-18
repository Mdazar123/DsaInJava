import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Set default value to 0 if the key is absent
        String key = "key1";
        map.putIfAbsent(key, 0);
        
        // Increment the value associated with the key
        map.put(key, map.get(key) + 1);

        System.out.println(map); // Output: {key1=1}

        // Increment again
        map.put(key, map.get(key) + 1);

        System.out.println(map); // Output: {key1=2}
    }
}
