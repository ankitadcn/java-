//Method with Parameter and Without return type
public class Method_checkNumber2 {
  static void checkNumber(int num) {
    if (num % 2 == 0) {
      System.out.println("No is Even");
    } else {
      System.out.println("No is odd");
    }
  }

  public static void main(String[] args) {
    checkNumber(10);
  }
}
