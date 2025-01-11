
class Parent {
  void parent() {
    System.out.println("Parent Method");
  }
}

class Child1 extends Parent {
  public static void main(String args[]) {
    Child1 child1 = new Child1();
    child1.parent();
  }
}

class Child2 extends Parent {
  public static void main(String args[]) {
    Child2 child2 = new Child2();
    child2.parent();
  }
}
