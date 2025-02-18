import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        // Creating two ArrayLists
        ArrayList<Object> arr = new ArrayList<>();
        ArrayList<Object> arr2 = new ArrayList<>();

        // Adding elements to arr2
        arr2.add("Azhar");
        arr2.add("Nilesh");

        // Adding elements to arr
        arr.add(1);
        arr.add(2);
        
        // Size of arr
        System.out.println("Size of arr: " + arr.size());

        // Adding all elements from arr2 to arr
        System.out.println("Adding all elements from arr2 to arr: " + arr.addAll(arr2));

        // Displaying elements of arr
        System.out.println("Elements of arr: " + arr);

        // Iterating through arr using a for-each loop
        for (Object ele : arr) {
            System.out.println("Element: " + ele);
        }

        // Retaining only elements that exist in arr2
        System.out.println("Retain only elements from arr2: " + arr.retainAll(arr2));

        // Displaying elements of arr after retainAll
        System.out.println("Elements of arr after retainAll: " + arr);

        // Checking if arr is empty
        System.out.println("Is arr empty? " + arr.isEmpty());

        // Converting arr to an array and printing elements
        Object[] ans = arr.toArray();
        System.out.println("Array from arr:");
        for (Object a : ans) {
            System.out.println(a);
        }

        // Checking if arr contains specific elements
        System.out.println("Does arr contain 'Azhar'? " + arr.contains("Azhar"));
        System.out.println("Does arr contain '1'? " + arr.contains(1));

        // Getting element by index
        System.out.println("Element at index 0: " + arr.get(0));

        // Adding an element at a specific index
        arr.add(1, "New Element");
        System.out.println("arr after adding 'New Element' at index 1: " + arr);

        // Removing an element by value
        arr.remove("Azhar");
        System.out.println("arr after removing 'Azhar': " + arr);

        // Removing an element by index
        arr.remove(0);
        System.out.println("arr after removing element at index 0: " + arr);

        // Getting the index of an element
        System.out.println("Index of 'New Element': " + arr.indexOf("New Element"));

        // Clearing all elements in arr
        arr.clear();
        System.out.println("arr after clearing: " + arr);

        // Checking if arr is empty after clearing
        System.out.println("Is arr empty after clearing? " + arr.isEmpty());

        // Adding some elements to arr again
        arr.add("One");
        arr.add("Two");
        arr.add("Three");

        // Sorting arr
        // Collections.sort(arr);  // Note: Sorting works only for Comparable types like String.
        System.out.println("arr after sorting: " + arr);

        // Shuffling elements in arr
        Collections.shuffle(arr);
        System.out.println("arr after shuffling: " + arr);

        // Reversing elements in arr
        Collections.reverse(arr);
        System.out.println("arr after reversing: " + arr);
    }
}
