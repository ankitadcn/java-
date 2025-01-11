public class Circular {
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

}
