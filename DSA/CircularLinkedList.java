import java.util.*;

public class CircularLinkedList {
  class Node {
    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
    }
  }

  Node root = null;
  Node tail = null;

  void addFirst(String name) {
    Node newNode = new Node(name);
    if (root == null) {
      root = newNode;
      tail = newNode;
      newNode.next = root;
    } else {
      newNode.next = root;
      root = newNode;
      tail.next = newNode;
    }
  }

  // void addLast(String name) {
  // Node newNode = new Node(name);
  // if (root == null) {
  // root = newNode;
  // tail = newNode;
  // newNode.next = root;
  // } else {
  // tail.next = newNode;
  // tail = newNode;
  // newNode.next = root;
  // }
  // }

  public void removeFirst() {
    Node temp = root;
    root = temp.next;
    tail.next = root;
  }

  // public void findFirst() {
  // Node temp = root;
  // System.out.println(temp.data);
  // }

  public void findLast() {
    Node temp = root;
    root = tail.next;
  }

  void traverse() {
    Node temp = root;
    do {
      System.out.println(temp.data);
      temp = temp.next;
    } while (temp != root);
  }

  public static void main(String[] args) {
    CircularLinkedList s1 = new CircularLinkedList();
    s1.addFirst("Apple");

    s1.addFirst("Boy");

    s1.addFirst("Cat");

    // s1.addLast("Dog");
    // s1.removeFirst();
    // s1.findFirst();
    s1.findLast();
    s1.traverse();

  }
}
