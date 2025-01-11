//Method without Parameter and With return type
public class Method4 {
  static int sum() {
    int x = 10;
    int y = 5;
    int z = x + y;
    return z;
  }

  public static void main(String[] args) {
    {
      int c = sum();
      System.out.println(c);
      System.out.println(sum());
    }
  }
}
