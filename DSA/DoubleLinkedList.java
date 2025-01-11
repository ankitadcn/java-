public class DoubleLinkedList {
  class Node {
    String data;
    Node next;
    Node prev;

    Node(String data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

  Node root = null;
  Node tail = null;

  void addFirst(String data) {
    Node newNode = new Node(data);
    if (root == null) {
      root = newNode;
      tail = newNode;

    } else {
      newNode.next = root;
      root.prev = newNode;
      root = newNode;
    }
  }

  void addLast(String data) {
    if (root == null) {
      addFirst(data);
    } else {
      Node newNode = new Node(data);
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
  }

  void addIndex(int index, String data) {
    if (index == 0) {
      addFirst(data);
    } else {
      Node temp = root;
      for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
      }
      Node newNode = new Node(data);
      newNode.next = temp.next;
      newNode.prev = temp;
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

  void btraverse() {
    Node temp = tail;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.prev;
    }
  }

  public static void main(String[] args) {
    DoubleLinkedList list = new DoubleLinkedList();
    list.addFirst("C");
    list.addFirst("B");
    list.addFirst("A");
    list.addLast("D");
    list.traverse();
    System.out.println("---------------------------");
    list.addIndex(3, "E");
    list.traverse();
    // list.btraverse();
  }

}
