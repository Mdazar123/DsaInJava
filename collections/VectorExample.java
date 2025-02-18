import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        // Creating two Vectors
        Vector<Object> vec = new Vector<>();
        Vector<Object> vec2 = new Vector<>();

        // Adding elements to vec2
        vec2.add("Azhar");
        vec2.add("Nilesh");

        // Adding elements to vec
        vec.add(1);
        vec.add(2);

        // Size of vec
        System.out.println("Size of vec: " + vec.size());

        // Adding all elements from vec2 to vec
        System.out.println("Adding all elements from vec2 to vec: " + vec.addAll(vec2));

        // Displaying elements of vec
        System.out.println("Elements of vec: " + vec);

        // Iterating through vec using a for-each loop
        for (Object ele : vec) {
            System.out.println("Element: " + ele);
        }

        // Retaining only elements that exist in vec2
        System.out.println("Retain only elements from vec2: " + vec.retainAll(vec2));

        // Displaying elements of vec after retainAll
        System.out.println("Elements of vec after retainAll: " + vec);

        // Checking if vec is empty
        System.out.println("Is vec empty? " + vec.isEmpty());

        // Converting vec to an array and printing elements
        Object[] ans = vec.toArray();
        System.out.println("Array from vec:");
        for (Object a : ans) {
            System.out.println(a);
        }

        // Checking if vec contains specific elements
        System.out.println("Does vec contain 'Azhar'? " + vec.contains("Azhar"));
        System.out.println("Does vec contain '1'? " + vec.contains(1));

        // Getting element by index
        System.out.println("Element at index 0: " + vec.get(0));

        // Adding an element at a specific index
        vec.add(1, "New Element");
        System.out.println("vec after adding 'New Element' at index 1: " + vec);

        // Removing an element by value
        vec.remove("Azhar");
        System.out.println("vec after removing 'Azhar': " + vec);

        // Removing an element by index
        vec.remove(0);
        System.out.println("vec after removing element at index 0: " + vec);

        // Getting the index of an element
        System.out.println("Index of 'New Element': " + vec.indexOf("New Element"));

        // Clearing all elements in vec
        vec.clear();
        System.out.println("vec after clearing: " + vec);

        // Checking if vec is empty after clearing
        System.out.println("Is vec empty after clearing? " + vec.isEmpty());

        // Adding some elements to vec again
        vec.add("One");
        vec.add("Two");
        vec.add("Three");

        // Sorting vec
        // Collections.sort(vec);  // Note: Sorting works only for Comparable types like String.
        System.out.println("vec after sorting: " + vec);

        // Shuffling elements in vec
        Collections.shuffle(vec);
        System.out.println("vec after shuffling: " + vec);

        // Reversing elements in vec
        Collections.reverse(vec);
        System.out.println("vec after reversing: " + vec);

        // Checking capacity of the vector
        System.out.println("Capacity of vec: " + vec.capacity());

        // Adding more elements to vec and checking capacity
        vec.add("Four");
        vec.add("Five");
        System.out.println("Capacity after adding elements: " + vec.capacity());

        // Ensuring minimum capacity
        vec.ensureCapacity(20);
        System.out.println("Capacity after ensureCapacity(20): " + vec.capacity());

        // Setting size of the vector manually
        vec.setSize(10);
        System.out.println("Size of vec after setSize(10): " + vec);
        
        // Trimming capacity to current size
        vec.trimToSize();
        System.out.println("Capacity after trimToSize(): " + vec.capacity());
    }
}

/*
 * Explanation of Added Vector-Specific Methods:
capacity(): Returns the current capacity of the vector.
ensureCapacity(int minCapacity): Ensures that the vector can hold at least the specified number of elements without resizing.
setSize(int newSize): Changes the size of the vector; if it is increased, null elements are added, and if decreased, elements are removed.
trimToSize(): Trims the capacity of the vector to match its current size.
Common Methods (inherited from List interface):
add(): Adds elements to the vector.
addAll(): Adds all elements from one collection to another.
retainAll(): Retains only elements present in another collection.
isEmpty(): Checks if the vector is empty.
toArray(): Converts the vector to an array.
contains(): Checks if the vector contains a specific element.
get(): Gets the element at a specific index.
remove(): Removes an element either by index or value.
indexOf(): Returns the index of a specific element.
clear(): Clears all elements from the vector.
sort(): Sorts the vector (works for elements that implement Comparable).
shuffle(): Shuffles the elements in the vector randomly.
reverse(): Reverses the order of the elements in the vector.
This code demonstrates a wide variety of Vector operations and should help you understand how to use the various methods available in the Vector class. Let me know if you need further details!
 */
