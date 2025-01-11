public class Stack_LinkedList {
  class Node {
    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
    }
  }

  Node top = null;
  Integer size = 0;

  void push(String name) {
    Node newNode = new Node(name);
    if (top == null) {
      top = newNode;
      System.out.println("First added...");
    } else {
      newNode.next = top;
      top = newNode;
      System.out.println("Next added.....");
    }
    size++;
  }

  void traverse() {
    Node temp = top;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  void pop() {
    if (top != null) {
      size--;
      top = top.next;
      System.out.println("Item removed");
    } else {
      System.out.println("Item not removed due to empty stack");
    }
  }

  void peek() {
    if (top != null) {
      System.out.println("Last Node:" + top.data);
    } else {
      System.out.println("ITem not found due to empty stack");
    }
  }

  Boolean isEmpty() {
    return top = null;
  }

  void clear() {
    top = null;
    size = 0;
  }

  void size() {
    return size;
  }

  Integer search(String name) {
    Integer index = 0;
    Node temp = top;
    while (top != null) {
      if (top.data.equals(name)) {
        return index;
      }
      index++;
      top = top.next;
    }
    return -1;
  }

  String getMax() {
    Node temp = top;
    if (temp != null) {
      String max = temp.data;
      while (temp != null) {
        if (temp.data.compareTo(max) > 0) {
          max = temp.data;
        }
        temp = temp.next;
      }
      return max;
    } else {
      return "No max Item due to empty stack";
    }
  }

  String getMin() {
    Node temp = top;
    if (temp != null) {
      String min = temp.data;
      while (temp != null) {
        if (temp.data.compareTo(min) > 0) {
          min = temp.data;
        }
        temp = temp.next;
      }
      return min;
    } else {
      return "No min Item due to empty stack";
    }
  }

}

public static void main(String[] args) {
  Stack_LinkedList s = new Stack_LinkedList();
  s.pop();
  System.out.println(s.isEmpty());
  s.push("A");
  s.push("B");
  s.push("C");
  s.push("D");
  s.traverse();
  System.out.println(s.size);
  System.out.println(s.getMax());
  System.out.println(s.getMin());

}
