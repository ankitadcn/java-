import java.util.*;

public class SingleLinkedList {
  class Node {
    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
    }
  }

  Node root = null;

  void addNodeFirst(String name) {
    Node newNode = new Node(name);
    if (root == null) {
      root = newNode;
    } else {
      newNode.next = root;
      root = newNode;
    }
  }

  void addNodeLast(String name) {
    Node newNode = new Node(name);
    if (root == null) {
      root = newNode;
    } else {
      Node temp = root;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
  }

  void traverse() {
    Node temp = root;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  public static void main(String[] args) {
    SingleLinkedList s1 = new SingleLinkedList();
    s1.addNodeFirst("A");

    s1.traverse();
    System.out.println("----------------");

    s1.addNodeFirst("B");
    s1.traverse();
    System.out.println("-------------------");

    s1.addNodeLast("C");
    s1.traverse();
    System.out.println("-------------------");

  }
}