import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // Using HashMap (unordered, key-value pairs)
        Map<Integer, String> hashMap = new HashMap<>();
        
        // Adding key-value pairs to the HashMap
        hashMap.put(1,  "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Cherry");
        System.out.println("HashMap: " + hashMap);

        // Replacing a value for a specific key
        hashMap.put(2, "Blueberry");
        System.out.println("HashMap after replacing key 2: " + hashMap);

        // Using get() to retrieve a value by key
        System.out.println("Value at key 1: " + hashMap.get(1));
        System.out.println("Value at key 4 (non-existent): " + hashMap.get(4));

        // Checking if a key or value exists in the map
        System.out.println("HashMap contains key 3? " + hashMap.containsKey(3));
        System.out.println("HashMap contains value 'Cherry'? " + hashMap.containsValue("Cherry"));

        // Removing a key-value pair by key
        hashMap.remove(1);
        System.out.println("HashMap after removing key 1: " + hashMap);

        // Getting the size of the HashMap
        System.out.println("Size of HashMap: " + hashMap.size());

        // Iterating over the HashMap entries
        System.out.println("Iterating over HashMap entries:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Checking if the map is empty
        System.out.println("Is HashMap empty? " + hashMap.isEmpty());

        // Using putIfAbsent() to add an entry only if the key is not already present
        hashMap.putIfAbsent(3, "Cantaloupe");
        hashMap.putIfAbsent(4, "Date");
        System.out.println("HashMap after putIfAbsent: " + hashMap);

        // Replacing a value only if the key exists and has a specific value
        hashMap.replace(2, "Blueberry", "Dragonfruit");
        System.out.println("HashMap after replace: " + hashMap);

        // Clearing all entries from the HashMap
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);

        // Using LinkedHashMap (maintains insertion order)
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Dog", 1);
        linkedHashMap.put("Cat", 2);
        linkedHashMap.put("Elephant", 3);
        System.out.println("\nLinkedHashMap (insertion order): " + linkedHashMap);

        // Iterating over the LinkedHashMap
        System.out.println("Iterating over LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Using TreeMap (sorted order)
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("X", 10);
        treeMap.put("A", 20);
        treeMap.put("M", 30);
        treeMap.put("P", 40);
        System.out.println("\nTreeMap (sorted order): " + treeMap);

        // Accessing the first and last entries in TreeMap
        System.out.println("First Entry in TreeMap: " + ((TreeMap<String, Integer>) treeMap).firstEntry());
        System.out.println("Last Entry in TreeMap: " + ((TreeMap<String, Integer>) treeMap).lastEntry());

        // Using subMap, headMap, and tailMap methods in TreeMap
        System.out.println("SubMap from 'A' to 'P': " + ((TreeMap<String, Integer>) treeMap).subMap("A", "P"));
        System.out.println("HeadMap (elements less than 'M'): " + ((TreeMap<String, Integer>) treeMap).headMap("M"));
        System.out.println("TailMap (elements greater than or equal to 'M'): " + ((TreeMap<String, Integer>) treeMap).tailMap("M"));
    }
}

/*
 * Key Methods Demonstrated:
Map-Specific Methods:

put(key, value): Adds a key-value pair to the map or updates the value if the key already exists.
get(key): Retrieves the value associated with the specified key, or null if the key doesn't exist.
containsKey(key): Checks if the map contains the specified key.
containsValue(value): Checks if the map contains the specified value.
remove(key): Removes the key-value pair associated with the specified key.
size(): Returns the number of key-value pairs in the map.
isEmpty(): Checks if the map is empty.
clear(): Removes all key-value pairs from the map.
putIfAbsent(key, value): Adds the key-value pair only if the key is not already present.
replace(key, oldValue, newValue): Replaces the value for the specified key if it is currently mapped to oldValue.
HashMap Features:

Unordered collection of key-value pairs.
Allows one null key and multiple null values.
LinkedHashMap Features:

Maintains the insertion order of the key-value pairs.
Ideal for applications where order matters.
TreeMap Features (Sorted Map):

Stores key-value pairs in natural order (or a custom comparator).
Additional methods:
firstEntry(): Returns the first entry in the map.
lastEntry(): Returns the last entry in the map.
subMap(fromKey, toKey): Returns a view of the portion of this map whose keys range from fromKey to toKey.
headMap(toKey): Returns a view of the portion of this map whose keys are strictly less than toKey.
tailMap(fromKey): Returns a view of the portion of this map whose keys are greater than or equal to fromKey.
Conclusion:
HashMap: Best for key-value storage where order is irrelevant.
LinkedHashMap: Useful when you want to preserve the insertion order.
TreeMap: Useful when you need sorted keys and want to work with ordered views like subMap, headMap, or tailMap.
This program demonstrates how to use the Map interface and its various implementations effectively.
 */

