import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        // Using HashSet (unordered, unique elements)
        Set<String> hashSet = new HashSet<>();
        
        // Adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple");  // Duplicate element, won't be added
        System.out.println("HashSet: " + hashSet);

        // Removing an element from the HashSet
        hashSet.remove("Banana");
        System.out.println("After removing 'Banana': " + hashSet);

        // Checking if the set contains an element
        System.out.println("Contains 'Apple'? " + hashSet.contains("Apple"));
        System.out.println("Contains 'Mango'? " + hashSet.contains("Mango"));

        // Iterating over the elements in HashSet
        System.out.println("Iterating through HashSet:");
        for (String element : hashSet) {
            System.out.println(element);
        }

        // Checking if the set is empty
        System.out.println("Is HashSet empty? " + hashSet.isEmpty());

        // Getting the size of the set
        System.out.println("Size of HashSet: " + hashSet.size());

        // Clearing all elements from the set
        hashSet.clear();
        System.out.println("After clearing HashSet: " + hashSet);

        // Adding elements back for further operations
        hashSet.addAll(Arrays.asList("Grapes", "Mango", "Orange"));
        System.out.println("HashSet after adding new elements: " + hashSet);

        // Converting HashSet to an array
        Object[] array = hashSet.toArray();
        System.out.println("Array representation of HashSet: " + Arrays.toString(array));

        // Cloning the HashSet
        Set<String> clonedHashSet = new HashSet<>(hashSet);
        System.out.println("Cloned HashSet: " + clonedHashSet);

        // Using LinkedHashSet (ordered, unique elements)
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Dog");
        linkedHashSet.add("Cat");
        linkedHashSet.add("Elephant");
        linkedHashSet.add("Dog");  // Duplicate element, won't be added
        System.out.println("\nLinkedHashSet (insertion order): " + linkedHashSet);

        // Using TreeSet (sorted, unique elements)
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(40);
        System.out.println("\nTreeSet (sorted order): " + treeSet);

        // Checking the first and last elements in TreeSet
        System.out.println("First element in TreeSet: " + ((TreeSet<Integer>) treeSet).first());
        System.out.println("Last element in TreeSet: " + ((TreeSet<Integer>) treeSet).last());

        // Using headSet, tailSet, and subSet methods in TreeSet
        System.out.println("HeadSet (elements < 30): " + ((TreeSet<Integer>) treeSet).headSet(30));
        System.out.println("TailSet (elements >= 20): " + ((TreeSet<Integer>) treeSet).tailSet(20));
        System.out.println("SubSet (between 20 and 40): " + ((TreeSet<Integer>) treeSet).subSet(20, 40));
    }
}

/*
 * Key Methods Demonstrated:
Set-Specific Methods:

add(element): Adds an element to the set if it's not already present.
remove(element): Removes the specified element from the set.
contains(element): Checks if the set contains the specified element.
isEmpty(): Checks if the set is empty.
size(): Returns the number of elements in the set.
clear(): Removes all elements from the set.
toArray(): Converts the set to an array.
addAll(Collection): Adds all elements from the specified collection to the set.
clone(): Clones the set (in this case, we cloned a HashSet using a constructor).
HashSet-Specific Features:

Unordered and does not allow duplicates.
LinkedHashSet-Specific Features:

Maintains the order of insertion and does not allow duplicates.
TreeSet-Specific Methods (Sorted set):

first(), last(): Returns the first and last elements in the sorted set.
headSet(toElement): Returns a subset of elements strictly less than the specified element.
tailSet(fromElement): Returns a subset of elements greater than or equal to the specified element.
subSet(fromElement, toElement): Returns a subset of elements within a range.
Conclusion:
HashSet is used for storing unique elements in an unordered manner.
LinkedHashSet stores unique elements while maintaining insertion order.
TreeSet stores unique elements in a sorted manner and provides additional methods to work with ranges of elements (headSet, tailSet, subSet).
This program demonstrates how to use the Set interface and its implementations effectively.
 */
