class P {
  void m1() {
    System.out.println("Papa Method");
  }
}

class Child1 extends P {
  public static void main(String args[]) {
    Child1 c1 = new Child1();
    c1.m1();
  }
}

class Child2 extends P {
  public static void main(String args[]) {
    Child2 c2 = new Child2();
    c2.m1();
  }
}