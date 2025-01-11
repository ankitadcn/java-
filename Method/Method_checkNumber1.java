//Method without Parameter and Without return type
public class Method_checkNumber1 {
  static void checkNumber() {
    int num = 11;
    if (num % 2 == 0) {
      System.out.println("No is Even");
    } else {
      System.out.println("No is Odd");
    }
  }

  public static void main(String[] args) {
    checkNumber();
  }
}
