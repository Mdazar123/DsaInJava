import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements to the LinkedList
        list.add(10);  // Adds element to the end
        list.add(20);
        list.add(30);

        // Adding elements at a specific position
        list.add(1, 15);  // Inserts 15 at index 1
        System.out.println("List after adding elements: " + list);

        // Adding elements to the beginning and end of the LinkedList
        list.addFirst(5);  // Adds 5 at the beginning
        list.addLast(35);  // Adds 35 at the end
        System.out.println("List after addFirst and addLast: " + list);

        // Retrieving elements from the LinkedList
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // Removing elements from the LinkedList
        list.removeFirst();  // Removes the first element
        list.removeLast();   // Removes thElement at index 0: " + arr.get(0)e last element
        list.remove(1);      // Removes the element at index 1
        System.out.println("List after remove operations: " + list);

        // Checking if the list contains a specific element
        System.out.println("List contains 20: " + list.contains(20));

        // Replacing an element at a specific index
        list.set(1, 25);  // Replaces element at index 1 with 25
        System.out.println("List after set operation: " + list);

        // Iterating through the LinkedList using an iterator
        System.out.println("Iterating using Iterator:");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterating in reverse order using descendingIterator()
        System.out.println("Iterating in reverse order:");
        Iterator<Integer> reverseIterator = list.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

        // Converting LinkedList to an array
        Object[] array = list.toArray();
        System.out.println("Array representation: " + Arrays.toString(array));

        // Adding elements at the front and rear using offer, offerFirst, and offerLast
        list.offer(40);       // Adds at the end (same as add)
        list.offerFirst(0);   // Adds at the front
        list.offerLast(50);   // Adds at the end
        System.out.println("List after offer operations: " + list);

        // Retrieving elements using peek, peekFirst, peekLast
        System.out.println("Peek: " + list.peek());        // Retrieves but doesn't remove first element
        System.out.println("PeekFirst: " + list.peekFirst());  // Same as getFirst
        System.out.println("PeekLast: " + list.peekLast());    // Same as getLast

        // Polling elements using poll, pollFirst, pollLast
        System.out.println("Poll: " + list.poll());        // Retrieves and removes the first element
        System.out.println("PollFirst: " + list.pollFirst());  // Same as removeFirst
        System.out.println("PollLast: " + list.pollLast());    // Same as removeLast
        System.out.println("List after poll operations: " + list);

        // Pushing and popping elements (works as a stack)
        list.push(5);  // Pushes element at the front (same as addFirst)
        System.out.println("List after push(5): " + list);
        System.out.println("Popped element: " + list.pop());  // Pops the first element (same as removeFirst)
        System.out.println("List after pop: " + list);

        // Checking size and clearing the list
        System.out.println("List size: " + list.size());
        list.clear();
        System.out.println("List after clear: " + list);
        System.out.println("Is list empty? " + list.isEmpty());

        // Adding elements again to demonstrate cloning and subList
        list.addAll(Arrays.asList(100, 200, 300, 400, 500));
        System.out.println("List after adding more elements: " + list);

        // Creating a shallow copy of the list using clone()
        LinkedList<Integer> clonedList = (LinkedList<Integer>) list.clone();
        System.out.println("Cloned list: " + clonedList);

        // Extracting a subList
        List<Integer> subList = list.subList(1, 4);  // Sublist from index 1 (inclusive) to 4 (exclusive)
        System.out.println("SubList (index 1 to 3): " + subList);
    }
}

/*
 * Key Methods Demonstrated in the Code:
Basic Operations:

add(element): Adds an element to the end of the list.
add(index, element): Adds an element at the specified index.
addFirst(element), addLast(element): Add elements to the front or end of the list.
Accessing Elements:

get(index): Returns the element at the specified position.
getFirst(), getLast(): Return the first and last elements of the list.
Removing Elements:

remove(index): Removes the element at the specified index.
removeFirst(), removeLast(): Remove the first or last element from the list.
Checking and Modifying:

contains(element): Checks if the list contains a specific element.
set(index, element): Replaces the element at the specified index with the provided one.
Iteration:

iterator(): Standard forward iteration.
descendingIterator(): Iterates in reverse order.
Conversion and Cloning:

toArray(): Converts the list to an array.
clone(): Creates a shallow copy of the list.
Queue-Like Operations:

offer(element), offerFirst(element), offerLast(element): Add elements in a queue-like fashion.
peek(), peekFirst(), peekLast(): Retrieve elements without removing.
poll(), pollFirst(), pollLast(): Retrieve and remove elements from the list.
Stack-Like Operations:

push(element): Pushes an element at the front (like addFirst()).
pop(): Pops the first element (like removeFirst()).
Other Useful Methods:

clear(): Clears all elements from the list.
isEmpty(): Checks if the list is empty.
size(): Returns the size of the list.
subList(fromIndex, toIndex): Returns a view of a portion of the list as a sublist.
This example covers all essential methods from the LinkedList class, including basic list operations, queue/stack functionalities, and more advanced features like subList() and clone().
 */