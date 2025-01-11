class Grandparent {
  void grandparent() {
    System.out.println("Grandparent");
  }
}

class Parent extends Grandparent {
  void parent() {
    System.out.println("Parent");
  }
}

class Child extends Parent {
  void child() {
    System.out.println("child");
  }
}

public class Multilevel_Inheritance {
  public static void main(String[] args) {
    Child child = new Child();
    child.grandparent();
    child.parent();
    child.child();
  }
}