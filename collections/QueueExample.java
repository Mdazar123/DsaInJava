import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        // Using LinkedList to implement Queue (FIFO)
        Queue<String> linkedListQueue = new LinkedList<>();

        // Adding elements to the Queue
        linkedListQueue.add("Alice");
        linkedListQueue.add("Bob");
        linkedListQueue.add("Charlie");
        System.out.println("LinkedList Queue: " + linkedListQueue);

        // Using element() to get the head of the queue without removing it (throws an exception if empty)
        System.out.println("Head of the Queue (using element): " + linkedListQueue.element());

        // Using peek() to get the head of the queue without removing it (returns null if empty)
        System.out.println("Head of the Queue (using peek): " + linkedListQueue.peek());

        // Removing elements from the Queue
        System.out.println("Removed element (using remove): " + linkedListQueue.remove());
        System.out.println("Queue after remove: " + linkedListQueue);

        // Using poll() to remove and return the head of the queue (returns null if empty)
        System.out.println("Removed element (using poll): " + linkedListQueue.poll());
        System.out.println("Queue after poll: " + linkedListQueue);

        // Checking if the queue is empty
        System.out.println("Is LinkedList Queue empty? " + linkedListQueue.isEmpty());

        // Checking the size of the queue
        System.out.println("Size of the LinkedList Queue: " + linkedListQueue.size());

        // Adding more elements for further operations
        linkedListQueue.add("David");
        linkedListQueue.add("Eve");

        // Iterating through the queue
        System.out.println("Iterating through LinkedList Queue:");
        for (String person : linkedListQueue) {
            System.out.println(person);
        }

        // Using PriorityQueue (sorted queue)
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        priorityQueue.add(40);
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(20);
        System.out.println("\nPriorityQueue (sorted order): " + priorityQueue);

        // Polling elements (removes the head element, which is the smallest in PriorityQueue)
        System.out.println("Removed element (using poll): " + priorityQueue.poll());
        System.out.println("PriorityQueue after poll: " + priorityQueue);

        // Using peek() to view the smallest element without removing it
        System.out.println("Peek element in PriorityQueue: " + priorityQueue.peek());

        // Iterating through the PriorityQueue
        System.out.println("Iterating through PriorityQueue:");
        for (Integer number : priorityQueue) {
            System.out.println(number);
        }

        // Using ArrayDeque as a double-ended queue
        Deque<String> arrayDeque = new ArrayDeque<>();

        // Adding elements to the deque (both at head and tail)
        arrayDeque.add("First");
        arrayDeque.addFirst("Start");
        arrayDeque.addLast("Last");
        System.out.println("\nArrayDeque: " + arrayDeque);

        // Removing elements from the deque
        System.out.println("Removed first element (using removeFirst): " + arrayDeque.removeFirst());
        System.out.println("Removed last element (using removeLast): " + arrayDeque.removeLast());
        System.out.println("ArrayDeque after removals: " + arrayDeque);

        // Adding elements back for further operations
        arrayDeque.add("Middle");

        // Iterating through the deque
        System.out.println("Iterating through ArrayDeque:");
        arrayDeque.forEach(System.out::println);

        // Using offer() to add elements to the queue
        arrayDeque.offer("New Element");
        System.out.println("ArrayDeque after offer: " + arrayDeque);

        // Using poll() to remove the head of the deque
        System.out.println("Polled element: " + arrayDeque.poll());
        System.out.println("ArrayDeque after poll: " + arrayDeque);
    }
}
/*
 * Key Methods Demonstrated:
Queue-Specific Methods:

add(element): Inserts the specified element into the queue. Throws an exception if the queue is full.
offer(element): Inserts the specified element into the queue. Returns false if the queue is full.
remove(): Retrieves and removes the head of the queue. Throws an exception if the queue is empty.
poll(): Retrieves and removes the head of the queue. Returns null if the queue is empty.
element(): Retrieves but does not remove the head of the queue. Throws an exception if the queue is empty.
peek(): Retrieves but does not remove the head of the queue. Returns null if the queue is empty.
PriorityQueue-Specific Features:

Elements are ordered based on their natural ordering or by a comparator provided at queue construction time.
Head of the queue is the smallest element.
ArrayDeque-Specific Methods (Double-Ended Queue):

addFirst(element): Adds the element at the front of the deque.
addLast(element): Adds the element at the end of the deque.
removeFirst(): Removes the first element of the deque.
removeLast(): Removes the last element of the deque.
poll(): Removes and returns the head of the queue.
offer(element): Adds the element to the queue.
forEach(): Iterates through the deque.
Conclusion:
LinkedList implements Queue to provide a basic First-In-First-Out (FIFO) queue.
PriorityQueue orders its elements based on their natural order or a custom comparator.
ArrayDeque allows double-ended operations (elements can be added or removed from both ends of the deque).
This example showcases how queues work, from basic FIFO operations to advanced priority-based ordering and deque (double-ended queue) features.
 */