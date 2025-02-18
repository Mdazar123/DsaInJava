import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack of integers
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Stack after push operations: " + stack);

        // Checking the top element using peek (without removing it)
        System.out.println("Top element (using peek): " + stack.peek());

        // Removing elements from the stack (LIFO)
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Searching for an element in the stack
        // Returns 1-based position from the top of the stack
        System.out.println("Position of 20 from the top: " + stack.search(20));

        // Iterating through the stack using forEach
        System.out.println("Iterating through the stack:");
        stack.forEach(System.out::println);

        // Adding more elements to the stack
        stack.push(50);
        stack.push(60);
        System.out.println("Stack after adding more elements: " + stack);

        // Using empty() to check if the stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // Getting size of the stack
        System.out.println("Size of the stack: " + stack.size());

        // Cloning the stack
        Stack<Integer> clonedStack = (Stack<Integer>) stack.clone();
        System.out.println("Cloned stack: " + clonedStack);

        // Clearing the stack
        stack.clear();
        System.out.println("Stack after clear: " + stack);

        // Adding elements back for more operations
        stack.push(70);
        stack.push(80);

        // Converting stack to an array
        Object[] array = stack.toArray();
        System.out.println("Array representation of the stack: " + Arrays.toString(array));

        // Checking element existence using contains
        System.out.println("Stack contains 80: " + stack.contains(80));

        // Checking element at a specific index (using inherited Vector methods)
        System.out.println("Element at index 1: " + stack.get(1));

        // Replacing an element at a specific index
        stack.set(1, 90);
        System.out.println("Stack after replacing element at index 1: " + stack);

        // Inserting an element at a specific index
        stack.insertElementAt(100, 1);
        System.out.println("Stack after insertElementAt: " + stack);

        // Removing an element by index
        stack.remove(0);  // Removes the element at index 0
        System.out.println("Stack after removing element at index 0: " + stack);
        
        // Removing an element by value
        stack.removeElement(Integer.valueOf(90));  // Removes the first occurrence of 90
        System.out.println("Stack after removing element '90': " + stack);
        
        // Clearing all elements using removeAllElements()
        stack.removeAllElements();
        System.out.println("Stack after removeAllElements: " + stack);
    }
}

/*
 * Key Methods Demonstrated in the Code:
Stack-Specific Methods:

push(element): Adds an element to the top of the stack.
pop(): Removes and returns the top element of the stack.
peek(): Returns the top element without removing it.
empty(): Checks if the stack is empty.
search(element): Searches for an element in the stack and returns its 1-based position from the top.
Vector-Inherited Methods:

add(element): Adds an element at the end of the stack.
remove(index): Removes the element at the specified index.
removeElement(element): Removes the first occurrence of the specified element.
clear(): Clears all elements from the stack.
contains(element): Checks if the stack contains a specific element.
toArray(): Converts the stack to an array.
clone(): Creates a shallow copy of the stack.
get(index): Retrieves the element at the specified index.
set(index, element): Replaces the element at the specified index with the provided one.
insertElementAt(element, index): Inserts an element at the specified index.
removeAllElements(): Removes all elements from the stack (same as clear()).
Other Useful Methods:

isEmpty(): Checks if the stack is empty.
size(): Returns the size of the stack.
forEach(): Iterates over each element in the stack using a lambda or method reference.
This example covers all essential methods from the Stack class, including stack-specific operations (LIFO behavior), vector-inherited methods, and some additional functionalities like cloning and iteration.
 */
