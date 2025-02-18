import java.util.*;

class DoublyLinkedList {
  class Node{
    int value;
    Node next;
    Node prev;

    public Node(int value){
      this.value = value;
    }
    public Node(int value, Node next, Node prev){
      this.value = value;
      this.next = next;
      this.prev = prev;
    }
  }
  Node head;

  public void add(int value){
    if(head == null){
      head = new Node(value);
      return;
    }
    Node current = head;
    while(current.next != null){
      current = current.next;
    }
    current.next = new Node(value, null, current);
    // current.next.prev = current;
  }

  public void display(){
    Node current = head;
    while(current != null){
      System.out.print(current.value+"->");
      current = current.next;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();
    dll.add(1);
    dll.add(2);
    dll.add(3);
    dll.display();
  }
}
